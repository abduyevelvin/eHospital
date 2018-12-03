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
public class Patient extends HospitalModel {
    
    private String pat_name;
    private String pat_surname;
    private String pat_gender;
    private Date pat_dob;
    private String pat_phone;
    private String pat_email;
    private String pat_address;
    
    public String getPat_name() {
        return pat_name;
    }
    public void setPat_name(String pat_name) {
        this.pat_name = pat_name;
    }
    public String getPat_surname() {
        return pat_surname;
    }
    public void setPat_surname(String pat_surname) {
        this.pat_surname = pat_surname;
    }
    public String getPat_gender() {
        return pat_gender;
    }
    public void setPat_gender(String pat_gender) {
        this.pat_gender = pat_gender;
    }
    public Date getPat_dob() {
        return pat_dob;
    }
    public void setPat_dob(Date pat_dob) {
        this.pat_dob = pat_dob;
    }
    public String getPat_phone() {
        return pat_phone;
    }
    public void setPat_phone(String pat_phone) {
        this.pat_phone = pat_phone;
    }
    public String getPat_email() {
        return pat_email;
    }
    public void setPat_email(String pat_email) {
        this.pat_email = pat_email;
    }
    public String getPat_address() {
        return pat_address;
    }
    public void setPat_address(String pat_address) {
        this.pat_address = pat_address;
    }
    @Override
    public String toString() {
        return "Patient [pat_name=" + pat_name + ", pat_surname=" + pat_surname
                + ", pat_gender=" + pat_gender + ", pat_dob=" + pat_dob
                + ", pat_phone=" + pat_phone + ", pat_email=" + pat_email
                + ", pat_address=" + pat_address + "]";
    }
    
}
