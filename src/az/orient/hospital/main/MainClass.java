package az.orient.hospital.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import az.orient.hospital.dao.HospitalDao;
import az.orient.hospital.dao.HospitalDaoAdmin;
import az.orient.hospital.dao.HospitalDaoAdminImpl;
import az.orient.hospital.dao.HospitalDaoImpl;
import az.orient.hospital.gui.LoginFrame;
import az.orient.hospital.gui.MainFrame;
import az.orient.hospital.service.HospitalService;
import az.orient.hospital.service.HospitalServiceAdmin;
import az.orient.hospital.service.HospitalServiceAdminImpl;
import az.orient.hospital.service.HospitalServiceImpl;
import javax.swing.JFrame;

/**
 *
 * @author EAAbduyev
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
            HospitalDao hDao = new HospitalDaoImpl();
            HospitalService hService = new HospitalServiceImpl(hDao);
            HospitalDaoAdmin hDaoAdmin = new HospitalDaoAdminImpl();
            HospitalServiceAdmin hServiceAdmin = new HospitalServiceAdminImpl(hDaoAdmin);
            
            LoginFrame loginFrame = new LoginFrame(hService, hServiceAdmin);
            loginFrame.setVisible(true);
            loginFrame.setResizable(false);
            loginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
