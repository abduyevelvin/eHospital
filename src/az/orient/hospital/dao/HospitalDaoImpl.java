/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package az.orient.hospital.dao;

import az.orient.hospital.model.Department;
import az.orient.hospital.model.Employee;
import az.orient.hospital.model.Patient;
import az.orient.hospital.model.Users;
import az.orient.hospital.util.JdbcUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EAAbduyev
 */
public class HospitalDaoImpl implements HospitalDao {
    
    @Override
    public List<Employee> getEmployeeList() throws Exception {
        List<Employee> employeeList = new ArrayList<Employee>();
        Connection c = null; // the class make connection to DB
        PreparedStatement ps = null; // the class prepare SQL to run
        ResultSet rs = null; // the class keep result of SQL
        String sql = "SELECT e.id, emp_name, emp_surname, emp_gender, emp_dob, emp_phone, emp_address, emp_salary, emp_email, emp_bonus, emp_category, dept_name, emp_hire_date, emp_fire_date \r\n" +
                "FROM EMPLOYEE e JOIN DEPARTMENT ON DEPT_ID = DEPARTMENT.ID \r\n" +
                "WHERE e.IsActive = 1";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Employee emp = new Employee();
                    Department dept = new Department();
                    emp.setId(rs.getInt("e.id"));
                    emp.setEmp_name(rs.getString("emp_name"));
                    emp.setEmp_surname(rs.getString("emp_surname"));
                    emp.setEmp_gender(rs.getString("emp_gender"));
                    emp.setEmp_dob(rs.getDate("emp_dob"));
                    emp.setEmp_phone(rs.getString("emp_phone"));
                    emp.setEmp_email(rs.getString("emp_email"));
                    emp.setEmp_address(rs.getString("emp_address"));
                    emp.setEmp_salary(rs.getDouble("emp_salary"));
                    emp.setEmp_bonus(rs.getDouble("emp_bonus"));
                    emp.setEmp_category(rs.getString("emp_category"));
                    dept.setDept_name(rs.getString("dept_name"));
                    emp.setEmp_department(dept);
                    emp.setEmp_hire_date(rs.getDate("emp_hire_date"));
                    emp.setEmp_fire_date(rs.getDate("emp_fire_date"));
                    employeeList.add(emp);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        //List<Object> res = Stream.concat(employeeList.stream(), deptList.stream()).collect(Collectors.toList());
        return employeeList;
    }
    
    @Override
    public List<Patient> getPatientList() throws Exception {
        List<Patient> patientList = new ArrayList<Patient>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address FROM PATIENT \r\n" +
                "WHERE IsActive = 1";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Patient patient = new Patient();
                    patient.setId(rs.getInt("id"));
                    patient.setPat_name(rs.getString("pat_name"));
                    patient.setPat_surname(rs.getString("pat_surname"));
                    patient.setPat_gender(rs.getString("pat_gender"));
                    patient.setPat_dob(rs.getDate("pat_dob"));
                    patient.setPat_phone(rs.getString("pat_phone"));
                    patient.setPat_email(rs.getString("pat_email"));
                    patient.setPat_address(rs.getString("pat_address"));
                    patientList.add(patient);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return patientList;
    }
    
    public List<Department> getDeptList() throws Exception {
        List<Department> deptList = new ArrayList<Department>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, dept_name, dept_description FROM DEPARTMENT \r\n" +
                "WHERE IsActive = 1";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Department dept = new Department();
                    dept.setId(rs.getInt("id"));
                    dept.setDept_name(rs.getString("dept_name"));
                    dept.setDept_description(rs.getString("dept_description"));
                    deptList.add(dept);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return deptList;
    }
    
    @Override
    public boolean addPatient(Patient pat) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO PATIENT(pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address) \r\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            c = DBHelper.getConnection();
            if( c!= null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, pat.getPat_name());
                ps.setString(2, pat.getPat_surname());
                ps.setString(3, pat.getPat_gender());
                ps.setDate(4, new java.sql.Date(pat.getPat_dob().getTime()));
                ps.setString(5, pat.getPat_phone());
                ps.setString(6, pat.getPat_email());
                ps.setString(7, pat.getPat_address());
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            //c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return res;
    }
    
    @Override
    public Patient getPatientById(int patId) throws Exception {
        Patient pat = new Patient();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address, IsActive FROM PATIENT \r\n" +
                "WHERE id = ?";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, patId);
                rs = ps.executeQuery();
                if(rs.next()) {
                    pat.setId(rs.getInt("id"));
                    pat.setPat_name(rs.getString("pat_name"));
                    pat.setPat_surname(rs.getString("pat_surname"));
                    pat.setPat_gender(rs.getString("pat_gender"));
                    pat.setPat_dob(rs.getDate("pat_dob"));
                    pat.setPat_phone(rs.getString("pat_phone"));
                    pat.setPat_email(rs.getString("pat_email"));
                    pat.setPat_address(rs.getString("pat_address"));
                    pat.setIsActive(rs.getInt("IsActive"));
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        
        return pat;
    }
    
    @Override
    public boolean updatePatient(Patient pat, int patId) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE PATIENT SET pat_name = ?, pat_surname = ?, pat_gender = ?, pat_dob = ?, pat_phone = ?, pat_email = ?, pat_address = ?, IsActive = ? \r\n" +
                "WHERE id = ?";
        try {
            c = DBHelper.getConnection();
            if( c!= null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, pat.getPat_name());
                ps.setString(2, pat.getPat_surname());
                ps.setString(3, pat.getPat_gender());
                ps.setDate(4, new java.sql.Date(pat.getPat_dob().getTime()));
                ps.setString(5, pat.getPat_phone());
                ps.setString(6, pat.getPat_email());
                ps.setString(7, pat.getPat_address());
                ps.setInt(8, pat.getIsActive());
                ps.setInt(9, patId);
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            //c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return res;
    }
    
    @Override
    public boolean deletePatient(int patId) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE PATIENT SET IsActive = 0 WHERE id = ?";
        try {
            c = DBHelper.getConnection();
            if( c!= null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, patId);
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            //c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return res;
    }
    
    @Override
    public List<Patient> getPatientListU() throws Exception {
        List<Patient> patientList = new ArrayList<Patient>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address, IsActive FROM PATIENT";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Patient patient = new Patient();
                    patient.setId(rs.getInt("id"));
                    patient.setPat_name(rs.getString("pat_name"));
                    patient.setPat_surname(rs.getString("pat_surname"));
                    patient.setPat_gender(rs.getString("pat_gender"));
                    patient.setPat_dob(rs.getDate("pat_dob"));
                    patient.setPat_phone(rs.getString("pat_phone"));
                    patient.setPat_email(rs.getString("pat_email"));
                    patient.setPat_address(rs.getString("pat_address"));
                    patient.setIsActive(rs.getInt("IsActive"));
                    patientList.add(patient);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return patientList;
    }
    
    @Override
    public boolean checkUsers(Users user) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM USERS WHERE username = ? and password = ?";
        
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                rs = ps.executeQuery();
                if(rs.next()) {
                    res = true;
                } else {
                    res = false;
                }
            } else {
                System.out.println("No connection");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        
        return res;
    }

    @Override
    public List<Users> getUsersList() throws Exception {
        List<Users> userList = new ArrayList<Users>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, name, surname, username, gender, email, password, confirm_password, role, isadmin FROM USERS";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Users user = new Users();
                    user.setId(rs.getInt("id"));
                    user.setName(rs.getString("name"));
                    user.setSurname(rs.getString("surname"));
                    user.setUsername(rs.getString("username"));
                    user.setGender(rs.getString("gender"));
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setConfirm_password(rs.getString("confirm_password"));
                    user.setRole(rs.getString("role"));
                    user.setIsAdmin(rs.getInt("isadmin"));
                    userList.add(user);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return userList;
    }

    @Override
    public boolean addUsers(Users user) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO USERS(name, surname, username, gender, email, password, confirm_password, role, IsAdmin) \r\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            c = DBHelper.getConnection();
            if( c!= null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, user.getName());
                ps.setString(2, user.getSurname());
                ps.setString(3, user.getUsername());
                ps.setString(4, user.getGender());
                ps.setString(5, user.getEmail());
                ps.setString(6, user.getPassword());
                ps.setString(7, user.getConfirm_password());
                ps.setString(8, user.getRole());
                ps.setInt(9, user.getIsAdmin());
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            //c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return res;
    }
    
    public Users getUserRole(String uName) throws Exception {
        Users user = new Users();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT ROLE, NAME, SURNAME, IsActive FROM USERS WHERE username = ?";
        
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, uName);
                rs = ps.executeQuery();
                if(rs.next()) {
                    user.setRole(rs.getString("ROLE"));
                    user.setName(rs.getString("NAME"));
                    user.setSurname(rs.getString("SURNAME"));
                    user.setIsActive(rs.getInt("IsActive"));
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        
        return user;
    }

    @Override
    public boolean addEmployee(Employee emp) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO EMPLOYEE(emp_name, emp_surname, emp_gender, emp_dob, emp_phone, emp_email, emp_address, emp_salary, emp_bonus, emp_category, dept_id, emp_hire_date) \r\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            c = DBHelper.getConnection();
            if( c!= null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, emp.getEmp_name());
                ps.setString(2, emp.getEmp_surname());
                ps.setString(3, emp.getEmp_gender());
                ps.setDate(4, new java.sql.Date(emp.getEmp_dob().getTime()));
                ps.setString(5, emp.getEmp_phone());
                ps.setString(6, emp.getEmp_email());
                ps.setString(7, emp.getEmp_address());
                ps.setDouble(8, emp.getEmp_salary());
                ps.setDouble(9, emp.getEmp_bonus());
                ps.setString(10, emp.getEmp_category());
                ps.setInt(11, emp.getEmp_department().getId());
                ps.setDate(12, new java.sql.Date(emp.getEmp_hire_date().getTime()));
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            //c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return res;
    }

    @Override
    public List<Patient> getPatientListBySearch(String searchTxt) throws Exception {
        List<Patient> patientList = new ArrayList<Patient>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address FROM PATIENT \r\n" +
                "WHERE IsActive = 1 AND (pat_name LIKE CONCAT('%',?,'%') OR pat_surname LIKE CONCAT('%',?,'%') OR pat_gender LIKE CONCAT('%',?,'%') \r\n" +
                "OR pat_phone LIKE CONCAT('%',?,'%') OR pat_dob LIKE CONCAT('%',?,'%') OR pat_email LIKE CONCAT('%',?,'%') OR pat_address LIKE CONCAT('%',?,'%'))";
                
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, searchTxt);
                ps.setString(2, searchTxt);
                ps.setString(3, searchTxt);
                ps.setString(4, searchTxt);
                ps.setString(5, searchTxt);
                ps.setString(6, searchTxt);
                ps.setString(7, searchTxt);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Patient patient = new Patient();
                    patient.setId(rs.getInt("id"));
                    patient.setPat_name(rs.getString("pat_name"));
                    patient.setPat_surname(rs.getString("pat_surname"));
                    patient.setPat_gender(rs.getString("pat_gender"));
                    patient.setPat_dob(rs.getDate("pat_dob"));
                    patient.setPat_phone(rs.getString("pat_phone"));
                    patient.setPat_email(rs.getString("pat_email"));
                    patient.setPat_address(rs.getString("pat_address"));
                    patientList.add(patient);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientListBySearchAdmin(String searchTxt) throws Exception {
        List<Patient> patientList = new ArrayList<Patient>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id, pat_name, pat_surname, pat_gender, pat_dob, pat_phone, pat_email, pat_address, IsActive FROM PATIENT \r\n" +
                "WHERE  IsActive LIKE CONCAT('%',?,'%') OR pat_name LIKE CONCAT('%',?,'%') OR pat_surname LIKE CONCAT('%',?,'%') OR pat_gender LIKE CONCAT('%',?,'%') \r\n" +
                "OR pat_phone LIKE CONCAT('%',?,'%') OR pat_dob LIKE CONCAT('%',?,'%') OR pat_email LIKE CONCAT('%',?,'%') OR pat_address LIKE CONCAT('%',?,'%')";
                
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, searchTxt);
                ps.setString(2, searchTxt);
                ps.setString(3, searchTxt);
                ps.setString(4, searchTxt);
                ps.setString(5, searchTxt);
                ps.setString(6, searchTxt);
                ps.setString(7, searchTxt);
                ps.setString(8, searchTxt);
                rs = ps.executeQuery();
                while(rs.next()) {
                    Patient patient = new Patient();
                    patient.setId(rs.getInt("id"));
                    patient.setPat_name(rs.getString("pat_name"));
                    patient.setPat_surname(rs.getString("pat_surname"));
                    patient.setPat_gender(rs.getString("pat_gender"));
                    patient.setPat_dob(rs.getDate("pat_dob"));
                    patient.setPat_phone(rs.getString("pat_phone"));
                    patient.setPat_email(rs.getString("pat_email"));
                    patient.setPat_address(rs.getString("pat_address"));
                    patient.setIsActive(rs.getInt("IsActive"));
                    patientList.add(patient);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return patientList;
    }

    @Override
    public Employee getEmployeeById(int empId) throws Exception {
        Employee emp = new Employee();
        Department dept = new Department();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT e.id, emp_name, emp_surname, emp_gender, emp_dob, emp_phone, emp_address, emp_salary, emp_email, emp_bonus, emp_category, \r\n" +
                "dept_name, emp_hire_date, emp_fire_date, e.IsActive FROM EMPLOYEE e JOIN DEPARTMENT ON DEPT_ID = DEPARTMENT.ID WHERE e.id = ?";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setInt(1, empId);
                rs = ps.executeQuery();
                if(rs.next()) {
                    emp.setId(rs.getInt("e.id"));
                    emp.setEmp_name(rs.getString("emp_name"));
                    emp.setEmp_surname(rs.getString("emp_surname"));
                    emp.setEmp_gender(rs.getString("emp_gender"));
                    emp.setEmp_dob(rs.getDate("emp_dob"));
                    emp.setEmp_phone(rs.getString("emp_phone"));
                    emp.setEmp_address(rs.getString("emp_address"));
                    emp.setEmp_salary(rs.getDouble("emp_salary"));
                    emp.setEmp_email(rs.getString("emp_email"));
                    emp.setEmp_bonus(rs.getDouble("emp_bonus"));
                    emp.setEmp_category(rs.getString("emp_category"));
                    dept.setDept_name(rs.getString("dept_name"));
                    emp.setEmp_department(dept);
                    emp.setEmp_hire_date(rs.getDate("emp_hire_date"));
                    emp.setEmp_fire_date(rs.getDate("emp_fire_date"));
                    emp.setIsActive(rs.getInt("e.IsActive"));                    
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        
        return emp;
    }

    @Override
    public List<Employee> getEmployeeListU() throws Exception {
        List<Employee> employeeList = new ArrayList<Employee>();
        Connection c = null; // the class make connection to DB
        PreparedStatement ps = null; // the class prepare SQL to run
        ResultSet rs = null; // the class keep result of SQL
        String sql = "SELECT e.id, emp_name, emp_surname, emp_gender, emp_dob, emp_phone, emp_address, emp_salary, emp_email, emp_bonus, emp_category, dept_name, emp_hire_date, emp_fire_date, e.IsActive \r\n" +
                "FROM EMPLOYEE e JOIN DEPARTMENT ON DEPT_ID = DEPARTMENT.ID";
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Employee emp = new Employee();
                    Department dept = new Department();
                    emp.setId(rs.getInt("e.id"));
                    emp.setEmp_name(rs.getString("emp_name"));
                    emp.setEmp_surname(rs.getString("emp_surname"));
                    emp.setEmp_gender(rs.getString("emp_gender"));
                    emp.setEmp_dob(rs.getDate("emp_dob"));
                    emp.setEmp_phone(rs.getString("emp_phone"));
                    emp.setEmp_email(rs.getString("emp_email"));
                    emp.setEmp_address(rs.getString("emp_address"));
                    emp.setEmp_salary(rs.getDouble("emp_salary"));
                    emp.setEmp_bonus(rs.getDouble("emp_bonus"));
                    emp.setEmp_category(rs.getString("emp_category"));
                    dept.setDept_name(rs.getString("dept_name"));
                    emp.setEmp_department(dept);
                    emp.setEmp_hire_date(rs.getDate("emp_hire_date"));
                    emp.setEmp_fire_date(rs.getDate("emp_fire_date"));
                    emp.setIsActive(rs.getInt("e.IsActive"));
                    employeeList.add(emp);
                }
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        //List<Object> res = Stream.concat(employeeList.stream(), deptList.stream()).collect(Collectors.toList());
        return employeeList;
    }

    @Override
    public boolean updateEmployee(Employee emp, int empId) throws Exception {
        boolean res = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE EMPLOYEE SET emp_name = ?, emp_surname = ?, emp_gender = ?, emp_dob = ?, emp_phone = ?, emp_email = ?, emp_address = ?, emp_salary = ?, \r\n"
                + "emp_bonus = ?, emp_category = ?, dept_id = ?, emp_hire_date = ?, emp_fire_date = ? WHERE ID = ?";
        
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, emp.getEmp_name());
                ps.setString(2, emp.getEmp_surname());
                ps.setString(3, emp.getEmp_gender());
                ps.setDate(4, new java.sql.Date(emp.getEmp_dob().getTime()));
                ps.setString(5, emp.getEmp_phone());
                ps.setString(6, emp.getEmp_email());
                ps.setString(7, emp.getEmp_address());
                ps.setDouble(8, emp.getEmp_salary());
                ps.setDouble(9, emp.getEmp_bonus());
                ps.setString(10, emp.getEmp_category());
                ps.setInt(11, emp.getEmp_department().getId());
                ps.setDate(12, new java.sql.Date(emp.getEmp_hire_date().getTime()));
                ps.setDate(13, new java.sql.Date(emp.getEmp_fire_date().getTime()));
                ps.setInt(14, empId);
                ps.execute();
                res = true;
            } else {
                System.out.println("Connection is failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = false;
        } finally {
            JdbcUtility.close(c, ps, null);
        }
        
        return res;
    }
    
}
