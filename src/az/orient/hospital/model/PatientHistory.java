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
public class PatientHistory extends HospitalModel {
    
    private Patient patient;
    private Employee employee;
    private Room room;
    private Operation operation;
    private Analize analize;
    private Medicine medicine;
    private Bill bill;
    private String ph_disease;
    private String ph_disease_description;
    private String ph_disease_status;
    private Date ph_date_in;
    private Date ph_date_out;
    
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Operation getOperation() {
        return operation;
    }
    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    public Analize getAnalize() {
        return analize;
    }
    public void setAnalize(Analize analize) {
        this.analize = analize;
    }
    public Medicine getMedicine() {
        return medicine;
    }
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public Bill getBill() {
        return bill;
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    public String getPh_disease() {
        return ph_disease;
    }
    public void setPh_disease(String ph_disease) {
        this.ph_disease = ph_disease;
    }
    public String getPh_disease_description() {
        return ph_disease_description;
    }
    public void setPh_disease_description(String ph_disease_description) {
        this.ph_disease_description = ph_disease_description;
    }
    public String getPh_disease_status() {
        return ph_disease_status;
    }
    public void setPh_disease_status(String ph_disease_status) {
        this.ph_disease_status = ph_disease_status;
    }
    public Date getPh_date_in() {
        return ph_date_in;
    }
    public void setPh_date_in(Date ph_date_in) {
        this.ph_date_in = ph_date_in;
    }
    public Date getPh_date_out() {
        return ph_date_out;
    }
    public void setPh_date_out(Date ph_date_out) {
        this.ph_date_out = ph_date_out;
    }
    
}
