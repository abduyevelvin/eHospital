/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.hospital.service;

import az.orient.hospital.model.PatientHistory;
import java.util.List;

/**
 *
 * @author EAAbduyev
 */
public interface HospitalServiceAdmin {
    
    List<PatientHistory> getPatHistory() throws Exception;
    
}
