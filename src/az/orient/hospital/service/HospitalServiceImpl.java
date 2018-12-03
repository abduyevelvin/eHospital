/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.hospital.service;

import az.orient.hospital.dao.HospitalDao;
import az.orient.hospital.model.Department;
import az.orient.hospital.model.Employee;
import az.orient.hospital.model.Patient;
import az.orient.hospital.model.Users;
import java.util.List;

/**
 *
 * @author EAAbduyev
 */
public class HospitalServiceImpl implements HospitalService {

    private HospitalDao hospDao;
    
   public HospitalServiceImpl(HospitalDao hospDao) {
       this.hospDao = hospDao;
   }
    
    @Override
    public List<Employee> getEmployeeList() throws Exception {
        return hospDao.getEmployeeList();
    }

    @Override
    public List<Patient> getPatientList() throws Exception {
        return hospDao.getPatientList();
    }

    @Override
    public List<Patient> getPatientListU() throws Exception {
        return hospDao.getPatientListU();
    }

    @Override
    public boolean addPatient(Patient pat) throws Exception {
        return hospDao.addPatient(pat);
    }

    @Override
    public Patient getPatientById(int patId) throws Exception {
        return hospDao.getPatientById(patId);
    }

    @Override
    public boolean updatePatient(Patient pat, int patId) throws Exception {
        return hospDao.updatePatient(pat, patId);
    }

    @Override
    public boolean deletePatient(int patId) throws Exception {
        return hospDao.deletePatient(patId);
    }

    @Override
    public boolean checkUsers(Users user) throws Exception {
        return hospDao.checkUsers(user);
    }

    @Override
    public List<Users> getUsersList() throws Exception {
        return hospDao.getUsersList();
    }

    @Override
    public boolean addUsers(Users user) throws Exception {
        return hospDao.addUsers(user);
    }

    @Override
    public Users getUserRole(String uName) throws Exception {
        return hospDao.getUserRole(uName);
    }

    @Override
    public List<Department> getDeptList() throws Exception {
        return hospDao.getDeptList();
    }

    @Override
    public boolean addEmployee(Employee emp) throws Exception {
        return hospDao.addEmployee(emp);
    }

    @Override
    public List<Patient> getPatientListBySearch(String searchTxt) throws Exception {
        return hospDao.getPatientListBySearch(searchTxt);
    }

    @Override
    public List<Patient> getPatientListBySearchAdmin(String searchTxt) throws Exception {
        return hospDao.getPatientListBySearchAdmin(searchTxt);
    }

    @Override
    public Employee getEmployeeById(int empId) throws Exception {
        return hospDao.getEmployeeById(empId);
    }

    @Override
    public List<Employee> getEmployeeListU() throws Exception {
        return hospDao.getEmployeeListU();
    }

    @Override
    public boolean updateEmployee(Employee emp, int empId) throws Exception {
        return hospDao.updateEmployee(emp, empId);
    }
    
}