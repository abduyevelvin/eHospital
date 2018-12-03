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
public class Employee extends HospitalModel {
    
    private String emp_name;
    private String emp_surname;
    private String emp_gender;
    private Date emp_dob;
    private String emp_phone;
    private String emp_email;
    private String emp_address;
    private double emp_salary;
    private double emp_bonus;
    private String emp_category;
    private Department emp_department;
    private Date emp_hire_date;
    private Date emp_fire_date;
    
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public String getEmp_surname() {
        return emp_surname;
    }
    public void setEmp_surname(String emp_surname) {
        this.emp_surname = emp_surname;
    }
    public String getEmp_gender() {
        return emp_gender;
    }
    public void setEmp_gender(String emp_gender) {
        this.emp_gender = emp_gender;
    }
    public Date getEmp_dob() {
        return emp_dob;
    }
    public void setEmp_dob(Date emp_dob) {
        this.emp_dob = emp_dob;
    }
    public String getEmp_phone() {
        return emp_phone;
    }
    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }
    public String getEmp_email() {
        return emp_email;
    }
    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }
    public String getEmp_address() {
        return emp_address;
    }
    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }
    public double getEmp_salary() {
        return emp_salary;
    }
    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }
    public double getEmp_bonus() {
        return emp_bonus;
    }
    public void setEmp_bonus(double emp_bonus) {
        this.emp_bonus = emp_bonus;
    }
    public String getEmp_category() {
        return emp_category;
    }
    public void setEmp_category(String emp_category) {
        this.emp_category = emp_category;
    }
    public Department getEmp_department() {
        return emp_department;
    }
    public void setEmp_department(Department emp_department) {
        this.emp_department = emp_department;
    }
    public Date getEmp_hire_date() {
        return emp_hire_date;
    }
    public void setEmp_hire_date(Date emp_hire_date) {
        this.emp_hire_date = emp_hire_date;
    }
    public Date getEmp_fire_date() {
        return emp_fire_date;
    }
    public void setEmp_fire_date(Date emp_fire_date) {
        this.emp_fire_date = emp_fire_date;
    }

    @Override
    public String toString() {
        return "Employee{" + "emp_name=" + emp_name + ", emp_surname=" + emp_surname + ", emp_gender=" + emp_gender + ", emp_dob=" + emp_dob + ", emp_phone=" + emp_phone + ", emp_email=" + emp_email + ", emp_address=" + emp_address + ", emp_salary=" + emp_salary + ", emp_bonus=" + emp_bonus + ", emp_category=" + emp_category + ", emp_department=" + emp_department + ", emp_hire_date=" + emp_hire_date + ", emp_fire_date=" + emp_fire_date + '}';
    }
    
}
