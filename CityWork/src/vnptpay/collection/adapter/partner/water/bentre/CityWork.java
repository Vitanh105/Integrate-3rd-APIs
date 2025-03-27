package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vnptpay.message.common.CollectionErrorCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Base64;

import static org.apache.axis2.kernel.http.HTTPConstants.USER_AGENT;

public class CityWork {
    String url;
    String user;
    String pass;
    int timeout;
    Logger logger = LogManager.getLogger(CityWork.class.getName());;
    String token;
    HttpClient HTTP_CLIENT;

    public CityWork(String url, String user, String pass, int timeout) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.timeout = timeout;
        this.token = Base64.getEncoder().encodeToString((user + ":" + pass).getBytes());
        logger.info("CityWork user: "+user+" | pass: "+pass);
        RequestConfig config = RequestConfig.custom()
                .setConnectTimeout(timeout * 1000)
                .setConnectionRequestTimeout(timeout * 1000)
                .setSocketTimeout(timeout * 1000).build();

        HTTP_CLIENT = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
    }

//API lấy thông tin khách hàng
    public CustomerlInfoHB getCustomerInfo(String maKhachHang) {
        try {
            HttpGet request = new HttpGet(url + "/api/vnptpayment/laythongtinkhachhang?token=" + token + "&maKhachHang=" + maKhachHang);
            logger.info("getCustomerInfo: " + url + "/api/vnptpayment/laythongtinkhachhang?token=" + token + "&maKhachHang=" + maKhachHang);
            request.setHeader("User-Agent", USER_AGENT);
            request.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
            HttpResponse response = HTTP_CLIENT.execute(request);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"));
            StringBuilder output = new StringBuilder();
            String l = "";
            while ((l = rd.readLine()) != null) {
                output.append(l);
            }
            logger.info("getCustomerInfo output: " + output.toString());
            CustomerlInfoHB res = new Gson().fromJson(output.toString(), CustomerlInfoHB.class);
            return res;
        } catch (Exception e) {
            logger.info("getCustomerInfo Exception :" + e.toString());
            return null;
        }
    }

//API lấy thông tin hóa đơn nợ
    public BillInfoHB getBillInfo(String maKhachHang, ResponseCode resCode) {
        try {
            CustomerlInfoHB cusInfo = getCustomerInfo(maKhachHang);
            if (cusInfo == null || (cusInfo.getCode() != 1 && cusInfo.getCode() != 4)) {
                resCode.setCode(CollectionErrorCode.UNKNOWN_ERROR);
                return null;
            } else if (cusInfo.getCode() == 4) {
                resCode.setCode(CollectionErrorCode.PAYMENT_CODE_INVALID);
                return null;
            }
            logger.info("getBillInfo: " + url + "/api/vnptpayment/laythongtinhoadonno?token=" + token + "&maKhachHang=" + cusInfo.getData().get(0).getMaKhachHang());
            HttpGet request = new HttpGet(url + "/api/vnptpayment/laythongtinhoadonno?token=" + token + "&maKhachHang=" + cusInfo.getData().get(0).getMaKhachHang());
            request.setHeader("User-Agent", USER_AGENT);
            request.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
            HttpResponse response = HTTP_CLIENT.execute(request);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"));
            StringBuilder output = new StringBuilder();
            String l = "";
            while ((l = rd.readLine()) != null) {
                output.append(l);
            }
            logger.info("getBillInfo output: " + output.toString());
            BillInfoHB res = new Gson().fromJson(output.toString(), BillInfoHB.class);

            if (res != null && res.getCode() == 1) {
                resCode.setCode(CollectionErrorCode.OK);
                return res;
            } else if (res != null && res.getCode() == 4) {
                resCode.setCode(CollectionErrorCode.NOT_FOUND_DATA);
                return res;
            } else {
                resCode.setCode(CollectionErrorCode.UNKNOWN_ERROR);
                return null;
            }
        } catch (IOException | UnsupportedOperationException | JsonSyntaxException e) {
            logger.info("getBillInfo Exception :" + e.toString());
            resCode.setCode(CollectionErrorCode.UNKNOWN_ERROR);
            return null;
        }
    }

//API thanh toán
    public CollectionErrorCode payBill(String idHoadon) {
        try {
            logger.info("payBill: " + url + "/api/vnptpayment/thanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            HttpGet request = new HttpGet(url + "/api/vnptpayment/thanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            request.setHeader("User-Agent", USER_AGENT);
            request.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
            HttpResponse response = HTTP_CLIENT.execute(request);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"));
            StringBuilder output = new StringBuilder();
            String l = "";
            while ((l = rd.readLine()) != null) {
                output.append(l);
            }
            logger.info("payBill: output: " + output.toString());
            ResponsePayBillHB res = new Gson().fromJson(output.toString(), ResponsePayBillHB.class);
            if (res != null && res.getCode() == 1) {
                return CollectionErrorCode.OK;
            } else {
                return CollectionErrorCode.TRANSACTION_FAILED;
            }
        } catch (IOException | UnsupportedOperationException | JsonSyntaxException e) {
            logger.info("payBill: Exception :" + e.toString());
            return CollectionErrorCode.PARTNER_TIME_OUT;
        }
    }

//API lấy thông tin thanh toán
    public CollectionErrorCode getPayBill(String idHoadon) {
        try {
            logger.info("payBill: " + url + "/api/vnptpayment/laythongtinthanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            HttpGet request = new HttpGet(url + "/api/vnptpayment/laythongtinthanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            request.setHeader("User-Agent", USER_AGENT);
            request.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
            HttpResponse response = HTTP_CLIENT.execute(request);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"));
            StringBuilder output = new StringBuilder();
            String l = "";
            while ((l = rd.readLine()) != null) {
                output.append(l);
            }
            logger.info("payBill: output: " + output.toString());
            ResponsePayBillHB res = new Gson().fromJson(output.toString(), ResponsePayBillHB.class);
            if (res != null && res.getCode() == 1) {
                return CollectionErrorCode.OK;
            } else {
                return CollectionErrorCode.TRANSACTION_FAILED;
            }
        } catch (IOException | UnsupportedOperationException | JsonSyntaxException e) {
            logger.info("payBill: Exception :" + e.toString());
            return CollectionErrorCode.PARTNER_TIME_OUT;
        }
    }

//API hủy thanh toán
    public CollectionErrorCode cancelPayBill(String idHoadon) {
        try {
            logger.info("payBill: " + url + "/api/vnptpayment/huythanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            HttpGet request = new HttpGet(url + "/api/vnptpayment/huythanhtoan?token=" + token + "&idHoaDon=" + idHoadon);
            request.setHeader("User-Agent", USER_AGENT);
            request.setHeader("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
            HttpResponse response = HTTP_CLIENT.execute(request);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"));
            StringBuilder output = new StringBuilder();
            String l = "";
            while ((l = rd.readLine()) != null) {
                output.append(l);
            }
            logger.info("payBill: output: " + output.toString());
            ResponsePayBillHB res = new Gson().fromJson(output.toString(), ResponsePayBillHB.class);
            if (res != null && res.getCode() == 1) {
                return CollectionErrorCode.OK;
            } else {
                return CollectionErrorCode.TRANSACTION_FAILED;
            }
        } catch (IOException | UnsupportedOperationException | JsonSyntaxException e) {
            logger.info("payBill: Exception :" + e.toString());
            return CollectionErrorCode.PARTNER_TIME_OUT;
        }
    }

    public static void main(String[] args) {
        CityWorkWater hbw = new CityWorkWater("https://www.trungtamnuocbentre.vn/paymentctwservices", "ttnsbentrevnptpay", "tTNsBeNTrevNptp@yCn105", 20);
        ResponseCode resCode = new ResponseCode();
        BillInfoHB a = hbw.getBillInfo("90604", resCode);
        System.out.println(a);
    }
}
