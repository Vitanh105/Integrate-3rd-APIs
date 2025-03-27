/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CustomerlInfoHB {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<DataCustomerHB> data = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataCustomerHB> getData() {
        return data;
    }

    public void setData(List<DataCustomerHB> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nCustomerInfo: \n{" + "\ncode=" + code + ", \nmessage=" + message + ", \ndata=" + data + "\n}";
    }

}
