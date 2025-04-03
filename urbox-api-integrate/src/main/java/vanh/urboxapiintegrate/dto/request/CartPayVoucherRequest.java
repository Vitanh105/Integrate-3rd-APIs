package vanh.urboxapiintegrate.dto.request;

import lombok.Data;

import java.util.List;

@Data
public class CartPayVoucherRequest {
    private String app_id;
    private String app_secret;
    private String campaign_code;
    private String site_user_id;
    private String ttphone;
    private String ttemail;
    private String ttfullname;
    private String transaction_id;
    private String client_purchase_order;
    private Integer shorten;
    private Integer isSendSms;
    private String pin;
    private List<DataBuyItem> dataBuy;

    @Data
    public static class DataBuyItem {
        private String priceId;
        private Integer quantity;
        private Integer amount;
    }
}