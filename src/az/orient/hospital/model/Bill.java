/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package az.orient.hospital.model;

/**
 *
 * @author EAAbduyev
 */
public class Bill extends HospitalModel {
    
    private double bill_total;
    private String bill_status;
    private String bill_type;
    
    public double getBill_total() {
        return bill_total;
    }
    public void setBill_total(double bill_total) {
        this.bill_total = bill_total;
    }
    public String getBill_status() {
        return bill_status;
    }
    public void setBill_status(String bill_status) {
        this.bill_status = bill_status;
    }
    public String getBill_type() {
        return bill_type;
    }
    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }
    
}
