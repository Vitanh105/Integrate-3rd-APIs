/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.message.common;

/**
 *
 * @author hungnm
 */
public enum CollectionErrorCode
{
    UNDEFINED                    ("-99", "Undefined"),
    
    OK                          ("00", "Transaction done"),    
    TRANSACTION_FAILED          ("01", "Transaction failed"),
    TRANSACTION_EXISTED         ("02", "Transaciton existed"),
    INVALID_INPUT               ("03", "Invalid Input"),
    TRANSACTION_NOT_FOUND       ("04", "Transaction not found"), 
    INVALID_SIGNATURE           ("05", "Invalid signature"),
    ORDER_ID_EXISTED            ("06", "Order id existed"), 
    PARTNER_SUSPENDED           ("07", "Partner suspended"),
    MERCHANT_ID_NOT_FOUND       ("08", "Merchant ID Not found"),
    PARTNER_NOT_FOUND           ("09", "Partner not found"),
    NOT_FOUND_DATA              ("10", "Not Found Data"),
    SERVICE_ID_NOT_FOUND        ("11", "Service ID Not found"),
    ACCOUNT_NOT_EXITS           ("12", "Account not exits"),
    
    REF_OBJECT_NOT_INIT         ("13", "Reference Object Not Init"),   
    TRANSACTION_DUPLICATE       ("14", "Duplicate transaction"),
    
    TRANSACTION_DENIED          ("15", "Transaction denied"),
    PAYMENT_CODE_INVALID        ("16", "Payment code invalid"),
    PAYMENT_CODE_EXPIRED        ("17", "Payment code expired"),
    PAYMENT_CODE_PAY_OFF_DEBT       ("18", "Payment code pay off debt"),
    PAYMENT_CODE_INVALID_OR_OUT_OF_DEBT       ("19", "Payment code invalid or out of debt"),
    OUT_OF_MONEY                            ("20", "Account is invalid or out of funds"),
    NOT_ALLOW_PAYMENT                            ("23", "Not allow payment"),
    NOT_FOUND_DISCOUNT                            ("24", "Not found discount"),
    
    DATABASE_INSERT_FAIL        ("50", "Database insert failed"),
    DATABASE_UPDATE_FAIL        ("51", "Database update failed"),
    
    COLLECTION_METHOD_UNDEFINED        ("52", "Method undefined"),
    NOT_FOUND_COLLECTION_RELIEF_DEBT_CODE        ("53", "Not found collection relief debt code"),
    ALREADY_CANCEL_RELIEF_DEBT        ("54", "Already cancel relief debt"),
    
    
    RELIEF_DEBT_SUCCESS_INSERT_DATABASE_FAIL("60","Relief debt success, insert database fail"),
    RELIEF_DEBT_SUCCESS_RMI_EXCEPTION("61","Relief debt success, RMI exception"),
    RELIEF_DEBT_FAIL_INSERT_DATABASE_SUCCESS("62","Relief debt fail, insert database success"),
    RELIEF_DEBT_FAIL_INSERT_DATABASE_FAIL("63","Relief debt fail, insert database fail"),
    RELIEF_DEBT_FAIL_RMI_EXCEPTION("64","Relief debt fail, RMI exception"),
    
    LOGIN_FAIL                              ("90", "Login Fail"),   
    PARSE_DATA_ERROR                        ("91", "Parse Json Error"),   
    RMI_EXCEPTION                           ("92", "RMI Exception"),   
    PARTNER_NETWORK_ERROR                   ("93", "Partner network error"),
    SYSTEM_MAINTAINED                       ("94", "System maintained"),
    NETWORK_ERROR                           ("95", "Network error"),
    SYSTEM_BUSY                             ("96", "System busy"),
    LOCAL_TIME_OUT                          ("97", "Local timeout"),
    PARTNER_TIME_OUT                        ("98", "Partner timeout"),
    UNKNOWN_ERROR                           ("99", "Unknown Error"),
    PARTNER_RESPONSE_ERROR                  ("100", "Error occured in response of partner"),  

    HUEWACO_LOGIN_FAILED                    ("201",  "Login failed"),
    HUEWACO_CUSTOMER_NULL                   ("202",  "Customer is null"),
    HUEWACO_CONG_NO_NULL                    ("203",  "Cong no is null"),
    HUEWACO_CONG_NO_HE_NO_NULL              ("204",  "No debt"),
    HUEWACO_INCORRECT_MONEY                 ("205",  "Incorrect money"),
    
    VAS_NOT_SUBSCRIBER_EZPAY             ("211",  "Not subscriber ezpay"),
    VAS_SUBSCRIBER_LOCK                      ("212",  "Subscriber lock"),
    VAS_SUBSCRIBER_INCORRECT                      ("213",  "Subcriber incorrect"),
    VAS_SUBSCRIBER_NOT_ACTIVED                    ("214",  "Subcriber not actived"),
    VAS_SUBSCRIBER_LOCK_CHARGE_CARD                    ("215",  "Subcriber lock charge card");
    
    private final String code;
    private final String description;

    private CollectionErrorCode(String code, String description)
    {
        this.code = code;
        this.description = description;
    }

    public String getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString()
    {
        return code + ": " + description;
    }
}
