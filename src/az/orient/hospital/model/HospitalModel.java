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
public abstract class HospitalModel {
    
    private int id;;
    private int IsActive;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIsActive() {
        return IsActive;
    }
    public void setIsActive(int isActive) {
        IsActive = isActive;
    }    
}
