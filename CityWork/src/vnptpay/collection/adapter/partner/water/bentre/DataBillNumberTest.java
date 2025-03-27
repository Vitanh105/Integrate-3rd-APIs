/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataBillNumberTest {

    
    @SerializedName("tongTien")
    @Expose
    private Number tongTien;

    public Number getTongTien() {
        return tongTien;
    }

    public void setTongTien(Number tongTien) {
        this.tongTien = tongTien;
    }
   

   

}
