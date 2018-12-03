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
public class Medicine extends HospitalModel {
    
    private String med_name;
    private String med_description;
    private double med_price;
    private String med_type;
    private int med_quantity;
    private String med_status;
    private Date med_date_in;
    private Date med_date_out;
    
    public String getMed_name() {
        return med_name;
    }
    public void setMed_name(String med_name) {
        this.med_name = med_name;
    }
    public String getMed_description() {
        return med_description;
    }
    public void setMed_description(String med_description) {
        this.med_description = med_description;
    }
    public double getMed_price() {
        return med_price;
    }
    public void setMed_price(double med_price) {
        this.med_price = med_price;
    }
    public String getMed_type() {
        return med_type;
    }
    public void setMed_type(String med_type) {
        this.med_type = med_type;
    }
    public int getMed_quantity() {
        return med_quantity;
    }
    public void setMed_quantity(int med_quantity) {
        this.med_quantity = med_quantity;
    }
    public String getMed_status() {
        return med_status;
    }
    public void setMed_status(String med_status) {
        this.med_status = med_status;
    }
    public Date getMed_date_in() {
        return med_date_in;
    }
    public void setMed_date_in(Date med_date_in) {
        this.med_date_in = med_date_in;
    }
    public Date getMed_date_out() {
        return med_date_out;
    }
    public void setMed_date_out(Date med_date_out) {
        this.med_date_out = med_date_out;
    }
    
}
