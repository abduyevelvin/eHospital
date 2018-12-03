/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.hospital.dao;

import az.orient.hospital.model.Analize;
import az.orient.hospital.model.Bill;
import az.orient.hospital.model.Employee;
import az.orient.hospital.model.Medicine;
import az.orient.hospital.model.Operation;
import az.orient.hospital.model.Patient;
import az.orient.hospital.model.PatientHistory;
import az.orient.hospital.model.Room;
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
public class HospitalDaoAdminImpl implements HospitalDaoAdmin {

    @Override
    public List<PatientHistory> getPatHistory() throws Exception {
        List<PatientHistory> patHistoryList = new ArrayList<PatientHistory>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT PH.ID, P.ID AS PAT_ID, PAT_NAME, PAT_SURNAME, E.ID AS EMP_ID, EMP_NAME, EMP_SURNAME, R.ID AS ROOM_ID, ROOM_TYPE, O.ID AS OP_ID, OPER_NAME, \r\n" +
                        "A.ID AS AN_ID, AN_NAME, M.ID AS MED_ID, MED_NAME, B.ID AS BILL_ID, BILL_TOTAL, BILL_STATUS, PH_DISEASE, PH_DISEASE_DESCRIPTION, PH_DISEASE_STATUS, \r\n" +
                        "PH_DATE_IN, PH_DATE_OUT, PH.IsActive \r\n" +
                        "FROM PATIENT_HISTORY PH JOIN PATIENT P ON PH.PAT_ID = P.ID \r\n" +
                        "JOIN EMPLOYEE E ON PH.EMP_ID = E.ID \r\n" +
                        "JOIN ROOM R ON PH.ROOM_ID = R.ID \r\n" +
                        "JOIN OPERATION O ON PH.OPER_ID = O.ID \r\n" +
                        "JOIN ANALIZE A ON PH.AN_ID = A.ID \r\n" +
                        "JOIN MEDICINE M ON PH.MED_ID = M.ID \r\n" +
                        "JOIN BILL B ON PH.BILL_ID = B.ID";
        
        try {
            c = DBHelper.getConnection();
            if(c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()) {
                    PatientHistory ph = new PatientHistory();
                    Patient pat = new Patient();
                    Employee emp = new Employee();
                    Room room = new Room();
                    Operation op = new Operation();
                    Analize an = new Analize();
                    Medicine med = new Medicine();
                    Bill bill = new Bill();
                    ph.setId(rs.getInt("PH.ID"));
                    ph.setPh_disease(rs.getString("PH_DISEASE"));
                    ph.setPh_disease_description(rs.getString("PH_DISEASE_DESCRIPTION"));
                    ph.setPh_disease_status(rs.getString("PH_DISEASE_STATUS"));
                    ph.setPh_date_in(rs.getDate("PH_DATE_IN"));
                    ph.setPh_date_out(rs.getDate("PH_DATE_OUT"));
                    ph.setIsActive(rs.getInt("PH.IsActive"));
                    pat.setId(rs.getInt("PAT_ID"));
                    pat.setPat_name(rs.getString("PAT_NAME"));
                    pat.setPat_surname(rs.getString("PAT_SURNAME"));
                    emp.setId(rs.getInt("EMP_ID"));
                    emp.setEmp_name(rs.getString("EMP_NAME"));
                    emp.setEmp_surname(rs.getString("EMP_SURNAME"));
                    room.setId(rs.getInt("ROOM_ID"));
                    room.setRoom_type(rs.getString("ROOM_TYPE"));
                    op.setId(rs.getInt("OP_ID"));
                    op.setOper_name(rs.getString("OPER_NAME"));
                    an.setId(rs.getInt("AN_ID"));
                    an.setAn_name(rs.getString("AN_NAME"));
                    med.setId(rs.getInt("MED_ID"));
                    med.setMed_name(rs.getString("MED_NAME"));
                    bill.setId(rs.getInt("BILL_ID"));
                    bill.setBill_total(rs.getDouble("BILL_TOTAL"));
                    bill.setBill_status(rs.getString("BILL_STATUS"));
                    ph.setPatient(pat);
                    ph.setEmployee(emp);
                    ph.setRoom(room);
                    ph.setOperation(op);
                    ph.setAnalize(an);
                    ph.setMedicine(med);
                    ph.setBill(bill);
                    patHistoryList.add(ph);                    
                }
            } else {
                System.out.println("Connection is failed!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        
        return patHistoryList;
    }
    
}
