/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.Gson;

/**
 *
 * @author AsRock
 */
public class TestNumber {
    public static void main(String[] args) {
                    String output =" {\"tongTien\": 100.00}";
                    DataBillNumberTest res = new Gson().fromJson(output.toString(), DataBillNumberTest.class);
                    System.out.println("res int "+(int)res.getTongTien().floatValue());
                    System.out.println("res float "+res.getTongTien().floatValue());
                    
    }
}
