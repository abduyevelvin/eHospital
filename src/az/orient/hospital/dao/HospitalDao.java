/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.hospital.dao;

import az.orient.hospital.model.*;
import java.util.List;

/**
 *
 * @author EAAbduyev
 */
public interface HospitalDao {
    
    List<Employee> getEmployeeList() throws Exception;
    List<Patient> getPatientList() throws Exception;
    List<Patient> getPatientListBySearch(String searchTxt) throws Exception;
    List<Patient> getPatientListBySearchAdmin(String searchTxt) throws Exception;
    List<Patient> getPatientListU() throws Exception;
    List<Employee> getEmployeeListU() throws Exception;
    List<Users> getUsersList() throws Exception;
    List<Department> getDeptList() throws Exception;
    boolean addPatient(Patient pat) throws Exception;
    boolean addEmployee(Employee emp) throws Exception;
    Patient getPatientById(int patId) throws Exception;
    Employee getEmployeeById(int empId) throws Exception;
    Users getUserRole(String uName) throws Exception;
    boolean updatePatient(Patient pat, int patId) throws Exception;
    boolean updateEmployee(Employee emp, int empId) throws Exception;    
    boolean deletePatient(int patId) throws Exception;
    boolean checkUsers(Users user) throws Exception;
    boolean addUsers(Users user) throws Exception;
    
}
