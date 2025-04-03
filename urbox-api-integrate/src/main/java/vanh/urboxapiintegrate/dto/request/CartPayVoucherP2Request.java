package vanh.urboxapiintegrate.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CartPayVoucherP2Request {
    private String app_id;
    private String app_secret;
    private String campaign_code;
    private String site_user_id;
    private String ttphone;
    private String ttemail;
    private String ttfullname;
    private String transaction_id;
    private Integer shorten;
    private Integer isSendSms;
    private Integer shipping_info_available = 2;
    private List<DataBuyItem> dataBuy;
    private Integer city_id;
    private Integer district_id;
    private Integer ward_id;
    private String ttaddress;
    private String delivery_note;

    @Data
    public static class DataBuyItem {
        private String priceId;
        private Integer quantity;
    }
}
