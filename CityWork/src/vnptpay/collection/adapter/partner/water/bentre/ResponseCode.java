/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import vnptpay.message.common.CollectionErrorCode;

/**
 *
 * @author VNPT
 */
public class ResponseCode {
    CollectionErrorCode code;

    public CollectionErrorCode getCode() {
        return code;
    }

    public void setCode(CollectionErrorCode code) {
        this.code = code;
    }
    
}
