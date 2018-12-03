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
public class Department extends HospitalModel {
    
    private String dept_name;
    private String dept_description;
    
    public String getDept_name() {
        return dept_name;
    }
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public String getDept_description() {
        return dept_description;
    }
    public void setDept_description(String dept_description) {
        this.dept_description = dept_description;
    }
    
}
