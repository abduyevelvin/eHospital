/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package az.orient.hospital.model;

import java.util.Date;

/**
 *
 * @author EAAbduyev
 */
public class Operation extends HospitalModel {
    
    private String oper_name;
    private String oper_type;
    private double oper_price;
    private Date oper_date_in;
    private Date oper_date_out;
    
    public String getOper_name() {
        return oper_name;
    }
    public void setOper_name(String oper_name) {
        this.oper_name = oper_name;
    }
    public String getOper_type() {
        return oper_type;
    }
    public void setOper_type(String oper_type) {
        this.oper_type = oper_type;
    }
    public double getOper_price() {
        return oper_price;
    }
    public void setOper_price(double oper_price) {
        this.oper_price = oper_price;
    }
    public Date getOper_date_in() {
        return oper_date_in;
    }
    public void setOper_date_in(Date oper_date_in) {
        this.oper_date_in = oper_date_in;
    }
    public Date getOper_date_out() {
        return oper_date_out;
    }
    public void setOper_date_out(Date oper_date_out) {
        this.oper_date_out = oper_date_out;
    }
    
}
