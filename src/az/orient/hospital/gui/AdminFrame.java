/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package az.orient.hospital.gui;

import az.orient.hospital.model.Employee;
import az.orient.hospital.model.Patient;
import az.orient.hospital.model.PatientHistory;
import az.orient.hospital.model.Users;
import az.orient.hospital.service.HospitalService;
import az.orient.hospital.service.HospitalServiceAdmin;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EAAbduyev
 */
public class AdminFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminFrame
     */
    private HospitalService hService;
    private HospitalServiceAdmin hServiceAdmin;
    private String role, globalBtnName = "test", fullName;
    
    public AdminFrame() {
        initComponents();
    }
    
    public AdminFrame(HospitalServiceAdmin hServiceAdmin, HospitalService hService, String role, String fullName) {
        initComponents();
        setIcon();
        this.hService = hService;
        this.hServiceAdmin = hServiceAdmin;
        this.role = role;
        checkSearch();
        searchTxt.setToolTipText("Enter word for start search");
        this.fullName = fullName;
        wellcomeLbl.setText("Welcome, " + fullName + ". You are " + role + ".");
        editBtn.setEnabled(false);
        dltBtn.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        dltBtn = new javax.swing.JButton();
        infoBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        wellcomeLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        patientListBtn = new javax.swing.JButton();
        employeeListBtn = new javax.swing.JButton();
        userListBtn = new javax.swing.JButton();
        phBtn = new javax.swing.JButton();

        setTitle("Admin Frame");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        editBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\edit.png")); // NOI18N
        editBtn.setText("Edit");
        editBtn.setName(""); // NOI18N
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        newBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\new.png")); // NOI18N
        newBtn.setText("New");
        newBtn.setName(""); // NOI18N
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        dltBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\delete1.gif")); // NOI18N
        dltBtn.setText("Delete");
        dltBtn.setName(""); // NOI18N
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        infoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\info.png")); // NOI18N
        infoBtn.setText("Info");
        infoBtn.setName(""); // NOI18N
        infoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoBtnActionPerformed(evt);
            }
        });

        closeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\close.png")); // NOI18N
        closeBtn.setText("LogOut");
        closeBtn.setName(""); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        wellcomeLbl.setText("...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addComponent(infoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wellcomeLbl)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(newBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(dltBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(infoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(wellcomeLbl))
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        searchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\search.png")); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\clear.png")); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        patientListBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\patient.png")); // NOI18N
        patientListBtn.setText("Patient List");
        patientListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientListBtnActionPerformed(evt);
            }
        });

        employeeListBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\doctor.png")); // NOI18N
        employeeListBtn.setText("Employee List");
        employeeListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeListBtnActionPerformed(evt);
            }
        });

        userListBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\login.gif")); // NOI18N
        userListBtn.setText("Users List");
        userListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListBtnActionPerformed(evt);
            }
        });

        phBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\img\\ph.gif")); // NOI18N
        phBtn.setText("Patient History");
        phBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(employeeListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(patientListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(employeeListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        int rowIdx = jTable1.getSelectedRow();
        int selectedRow = (int) jTable1.getValueAt(rowIdx, 0);
        
        switch(globalBtnName) {
            case "patient":
                EditPatientFrame editPatientFrame = new EditPatientFrame(selectedRow, hService);
                editPatientFrame.setVisible(true);
                editPatientFrame.setResizable(false);
                break;
            case "employee":
                EditEmployeeFrame editEmployeeFrame = new EditEmployeeFrame(selectedRow, hService);
                editEmployeeFrame.setVisible(true);
                editEmployeeFrame.setResizable(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please choose any list first", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_editBtnMouseClicked
    
    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
    }//GEN-LAST:event_editBtnActionPerformed
    
    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        switch(globalBtnName) {
            case "patient":
                NewPatientFrame newPatFrame = new NewPatientFrame(hService);
                newPatFrame.setVisible(true);
                newPatFrame.setResizable(false);
                break;
            case "employee":
                NewEmployeeFrame newEmpFrame = new NewEmployeeFrame(hService);
                newEmpFrame.setVisible(true);
                newEmpFrame.setResizable(false);
                break;
            case "users":
                RegisterFrame registerFrame  = new RegisterFrame(hService);
                registerFrame.setVisible(true);
                registerFrame.setResizable(false);
                registerFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                break;
            case "patHistory":
                
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please choose any list first", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_newBtnActionPerformed
    
    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBtnActionPerformed
        int rowIdx = jTable1.getSelectedRow();
        int selectedRow = (int) jTable1.getValueAt(rowIdx, 0);
        int dec = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if(dec == 0) {
            try {
                boolean isDeleted = hService.deletePatient(selectedRow);
                if(isDeleted) {
                    JOptionPane.showMessageDialog(null, "Patient has been successfully deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Patient cannot be deleted!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_dltBtnActionPerformed
    
    private void infoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoBtnActionPerformed
        JOptionPane.showMessageDialog(null, "Welcome to the eHospital system. Built by Elvin", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_infoBtnActionPerformed
    
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int dec = JOptionPane.showConfirmDialog(null, "Are you sure to exit?", "Close App", JOptionPane.YES_NO_OPTION);
        if(dec == 0) {
            LoginFrame loginFrame = new LoginFrame(hService, hServiceAdmin);
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_closeBtnActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(role.equals("admin")) {
            if(evt.getClickCount() == 2) {
                editBtnMouseClicked(evt);
            }
        }
        int rowIdx = jTable1.getSelectedRow();
        int selectedRow = (int) jTable1.getValueAt(rowIdx, 0);
        if(selectedRow > 0 && role.equals("admin")) {
            editBtn.setEnabled(true);
            dltBtn.setEnabled(true);
        } else {
            editBtn.setEnabled(false);
            dltBtn.setEnabled(false);
        }
    }//GEN-LAST:event_jTable1MouseClicked
    
    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        searchBtn.setEnabled(true);
        clearBtn.setEnabled(true);
    }//GEN-LAST:event_searchTxtKeyReleased
    
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        switch(globalBtnName) {
            case "patient":
                if(!searchTxt.getText().isEmpty() && role.equals("user")) {
                    showPatientDataBySearch();
                }
                else if(!searchTxt.getText().isEmpty() && role.equals("admin")) {
                    showPatientDataBySearchAdmin();
                }
                break;
            case "employee":
                NewEmployeeFrame newEmpFrame = new NewEmployeeFrame(hService);
                newEmpFrame.setVisible(true);
                newEmpFrame.setResizable(false);
                break;
            case "users":
                RegisterFrame registerFrame  = new RegisterFrame(hService);
                registerFrame.setVisible(true);
                registerFrame.setResizable(false);
                registerFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please choose any list first", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        switch(globalBtnName) {
            case "patient":
                if(role.equals("user")) {
                    searchTxt.setText("");
                    checkSearch();
                    showPatientData();
                }
                else if(role.equals("admin")) {
                    searchTxt.setText("");
                    checkSearch();
                    showPatientDataAdmin();
                }
                break;
            case "employee":
                searchTxt.setText("");
                checkSearch();
                showEmployeeData();
                break;
            case "users":
                searchTxt.setText("");
                checkSearch();
                showUsersList();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please choose any list first", "Warning", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }//GEN-LAST:event_clearBtnActionPerformed
    
    private void patientListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientListBtnActionPerformed
        searchTxt.setText("");
        editBtn.setEnabled(false);
        dltBtn.setEnabled(false);
        checkSearch();
        if(role.equals("user")) {
            showPatientData();
        } else {
            showPatientDataAdmin();
        }
        globalBtnName = "patient";
    }//GEN-LAST:event_patientListBtnActionPerformed
    
    private void employeeListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeListBtnActionPerformed
        searchTxt.setText("");
        editBtn.setEnabled(false);
        dltBtn.setEnabled(false);
        checkSearch();
        showEmployeeData();
        globalBtnName = "employee";
    }//GEN-LAST:event_employeeListBtnActionPerformed
    
    private void userListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListBtnActionPerformed
        searchTxt.setText("");
        checkSearch();
        showUsersList();
        globalBtnName = "users";
    }//GEN-LAST:event_userListBtnActionPerformed
    
    private void phBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phBtnActionPerformed
        searchTxt.setText("");
        editBtn.setEnabled(false);
        dltBtn.setEnabled(false);
        checkSearch();
        showPatHistoryData();
        globalBtnName = "patHistory";
    }//GEN-LAST:event_phBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton dltBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton employeeListBtn;
    private javax.swing.JButton infoBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton patientListBtn;
    private javax.swing.JButton phBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JButton userListBtn;
    private javax.swing.JLabel wellcomeLbl;
    // End of variables declaration//GEN-END:variables
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("eHospital.png")));
    }
    
    private void checkSearch() {
        if(searchTxt.getText().isEmpty()) {
            searchBtn.setEnabled(false);
            clearBtn.setEnabled(false);
            searchBtn.setToolTipText("Please first enter the text for search!");
            clearBtn.setToolTipText("Please first enter the text for search!");
        }
    }
    
    private void showPatientDataBySearch() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Gender");
            model.addColumn("Date of Birth");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");
            
            List<Patient> patList = hService.getPatientListBySearch(searchTxt.getText());
            for(Patient pt: patList) {
                Object[] data = new Object[] {
                    pt.getId(), pt.getPat_name(), pt.getPat_surname(), pt.getPat_gender(), pt.getPat_dob(), pt.getPat_address(), pt.getPat_phone(), pt.getPat_email()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showPatientDataBySearchAdmin() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Gender");
            model.addColumn("Date of Birth");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");
            model.addColumn("Activity");
            
            List<Patient> patList = hService.getPatientListBySearchAdmin(searchTxt.getText());
            for(Patient pt: patList) {
                Object[] data = new Object[] {
                    pt.getId(), pt.getPat_name(), pt.getPat_surname(), pt.getPat_gender(), pt.getPat_dob(), pt.getPat_address(), pt.getPat_phone(), pt.getPat_email(), pt.getIsActive()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showPatientData() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Gender");
            model.addColumn("Date of Birth");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");
            
            List<Patient> patList = hService.getPatientList();
            for(Patient pt: patList) {
                Object[] data = new Object[] {
                    pt.getId(), pt.getPat_name(), pt.getPat_surname(), pt.getPat_gender(), pt.getPat_dob(), pt.getPat_address(), pt.getPat_phone(), pt.getPat_email()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showPatientDataAdmin() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Gender");
            model.addColumn("Date of Birth");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");
            model.addColumn("Activity");
            
            List<Patient> patList = hService.getPatientListU();
            for(Patient pt: patList) {
                Object[] data = new Object[] {
                    pt.getId(), pt.getPat_name(), pt.getPat_surname(), pt.getPat_gender(), pt.getPat_dob(), pt.getPat_address(), pt.getPat_phone(), pt.getPat_email(), pt.getIsActive()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showEmployeeData() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Gender");
            model.addColumn("Date of Birth");
            model.addColumn("Address");
            model.addColumn("Phone");
            model.addColumn("Email");
            model.addColumn("Department");
            model.addColumn("Category");
            model.addColumn("Hire Date");
            model.addColumn("Fire Date");
            model.addColumn("Salary");
            model.addColumn("Bonus");
            
            List<Employee> empList = hService.getEmployeeList();
            for(Employee emp: empList) {
                Object[] data = new Object[] {
                    emp.getId(), emp.getEmp_name(), emp.getEmp_surname(), emp.getEmp_gender(), emp.getEmp_dob(), emp.getEmp_address(), emp.getEmp_phone(), emp.getEmp_email(),
                    emp.getEmp_department().getDept_name(), emp.getEmp_category(), emp.getEmp_hire_date(), emp.getEmp_fire_date(), emp.getEmp_salary(), emp.getEmp_bonus()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showUsersList() {
        try{
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("UserName");
            model.addColumn("Gender");
            model.addColumn("Email");
            model.addColumn("Password");
            model.addColumn("Confirm Password");
            model.addColumn("Role");
            model.addColumn("IsAdmin Code");
            
            List<Users> usList = hService.getUsersList();
            for(Users us: usList) {
                Object[] data = new Object[] {
                    us.getId(), us.getName(), us.getSurname(), us.getUsername(), us.getGender(), us.getEmail(), us.getPassword(), us.getConfirm_password(), us.getRole(), us.getIsAdmin()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showPatHistoryData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(model);
            model.addColumn("No");
            model.addColumn("Patient Full Name");
            model.addColumn("Employee Full Name");
            model.addColumn("Room Type");
            model.addColumn("Operation");
            model.addColumn("Analize");
            model.addColumn("Medicine");
            model.addColumn("Total Bill");
            model.addColumn("Status of Bill");
            model.addColumn("Disease");
            model.addColumn("Description of Disease");
            model.addColumn("Status of Disease");
            model.addColumn("Enter Date");
            model.addColumn("Left Date");
            model.addColumn("Activity");
            
            List<PatientHistory> patList = hServiceAdmin.getPatHistory();
            for(PatientHistory ph: patList) {
                Object[] data = new Object[] {
                    ph.getId(), ph.getPatient().getPat_name().concat(" ").concat(ph.getPatient().getPat_surname()), ph.getEmployee().getEmp_name().concat(" ").concat(ph.getEmployee().getEmp_surname()),
                    ph.getRoom().getRoom_type(), ph.getOperation().getOper_name(), ph.getAnalize().getAn_name(), ph.getMedicine().getMed_name(), ph.getBill().getBill_total(),
                    ph.getBill().getBill_status(), ph.getPh_disease(), ph.getPh_disease_description(), ph.getPh_disease_status(), ph.getPh_date_in(), ph.getPh_date_out(), ph.getIsActive()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
