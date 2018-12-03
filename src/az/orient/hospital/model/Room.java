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
public class Room extends HospitalModel {
    
    private String room_type;
    private String room_status;
    private double room_price;
    private Date room_date_in;
    private Date room_date_out;
    
    public String getRoom_type() {
        return room_type;
    }
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }
    public String getRoom_status() {
        return room_status;
    }
    public void setRoom_status(String room_status) {
        this.room_status = room_status;
    }
    public double getRoom_price() {
        return room_price;
    }
    public void setRoom_price(double room_price) {
        this.room_price = room_price;
    }
    public Date getRoom_date_in() {
        return room_date_in;
    }
    public void setRoom_date_in(Date room_date_in) {
        this.room_date_in = room_date_in;
    }
    public Date getRoom_date_out() {
        return room_date_out;
    }
    public void setRoom_date_out(Date room_date_out) {
        this.room_date_out = room_date_out;
    }
    
}
