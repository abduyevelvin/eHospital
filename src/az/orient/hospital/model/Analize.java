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
public class Analize extends HospitalModel {
    
    private String an_name;
    private String an_description;
    private String an_type;
    private double an_price;
    private Date an_date_in;
    private Date an_date_out;
    
    public String getAn_name() {
        return an_name;
    }
    public void setAn_name(String an_name) {
        this.an_name = an_name;
    }
    public String getAn_description() {
        return an_description;
    }
    public void setAn_description(String an_description) {
        this.an_description = an_description;
    }
    public String getAn_type() {
        return an_type;
    }
    public void setAn_type(String an_type) {
        this.an_type = an_type;
    }
    public double getAn_price() {
        return an_price;
    }
    public void setAn_price(double an_price) {
        this.an_price = an_price;
    }
    public Date getAn_date_in() {
        return an_date_in;
    }
    public void setAn_date_in(Date an_date_in) {
        this.an_date_in = an_date_in;
    }
    public Date getAn_date_out() {
        return an_date_out;
    }
    public void setAn_date_out(Date an_date_out) {
        this.an_date_out = an_date_out;
    }
   
}
