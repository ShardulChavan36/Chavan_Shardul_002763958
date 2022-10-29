/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthUI;

import Healthmodel.PatientDirectory;
import Healthmodel.PersonDirectory;
import Healthmodel.VitalSignsHistory;
import Healthmodel.DoctorDirectory;
import Healthmodel.DoctorDirectory;
import Healthmodel.EncounterHistory;
import Healthmodel.HospitalDirectory;


/**
 *
 * @author chava
 */
public class MainFrame extends javax.swing.JFrame {
    PersonDirectory personDir;
    PatientDirectory patientDir;
    VitalSignsHistory vitalDir;
    DoctorDirectory docDir;
    HospitalDirectory hospDir;
    EncounterHistory encHis;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        personDir=new PersonDirectory();
        patientDir=new PatientDirectory();
        vitalDir=new VitalSignsHistory();
        docDir=new DoctorDirectory();
        hospDir=new HospitalDirectory();
        encHis=new EncounterHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        menuRoles = new javax.swing.JMenuBar();
        roleSysAdmin = new javax.swing.JMenu();
        itemSysPerson = new javax.swing.JMenuItem();
        itemSysPatient = new javax.swing.JMenuItem();
        itemSysDoctor = new javax.swing.JMenuItem();
        itemSysHospital = new javax.swing.JMenuItem();
        itemSysEncounters = new javax.swing.JMenuItem();
        roleHospAdmin = new javax.swing.JMenu();
        itemHospPatient = new javax.swing.JMenuItem();
        itemHospDoctor = new javax.swing.JMenuItem();
        itemHospHospital = new javax.swing.JMenuItem();
        itemHospEncounters = new javax.swing.JMenuItem();
        roleCommAdmin = new javax.swing.JMenu();
        itemCommCity = new javax.swing.JMenuItem();
        itemCommCommunity = new javax.swing.JMenuItem();
        itemCommHouses = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        roleSysAdmin.setText("System Admin");

        itemSysPerson.setText("Person");
        itemSysPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysPersonActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysPerson);

        itemSysPatient.setText("Patient");
        itemSysPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysPatientActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysPatient);

        itemSysDoctor.setText("Doctor");
        itemSysDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysDoctorActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysDoctor);

        itemSysHospital.setText("Hospital");
        itemSysHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysHospitalActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysHospital);

        itemSysEncounters.setText("Encounters");
        itemSysEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSysEncountersActionPerformed(evt);
            }
        });
        roleSysAdmin.add(itemSysEncounters);

        menuRoles.add(roleSysAdmin);

        roleHospAdmin.setText("Hospital Admin");

        itemHospPatient.setText("Patient");
        itemHospPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHospPatientActionPerformed(evt);
            }
        });
        roleHospAdmin.add(itemHospPatient);

        itemHospDoctor.setText("Doctor");
        roleHospAdmin.add(itemHospDoctor);

        itemHospHospital.setText("Hospital");
        roleHospAdmin.add(itemHospHospital);

        itemHospEncounters.setText("Encounters");
        roleHospAdmin.add(itemHospEncounters);

        menuRoles.add(roleHospAdmin);

        roleCommAdmin.setText("Community Admin");

        itemCommCity.setText("City");
        itemCommCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCommCityActionPerformed(evt);
            }
        });
        roleCommAdmin.add(itemCommCity);

        itemCommCommunity.setText("Community");
        itemCommCommunity.setFocusTraversalPolicyProvider(true);
        roleCommAdmin.add(itemCommCommunity);

        itemCommHouses.setText("Houses");
        roleCommAdmin.add(itemCommHouses);

        menuRoles.add(roleCommAdmin);

        setJMenuBar(menuRoles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 325, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 254, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSysPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysPatientActionPerformed
        // TODO add your handling code here:
        PatientRegistration registerPatient = new PatientRegistration(patientDir,personDir,vitalDir);
        registerPatient.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_itemSysPatientActionPerformed

    private void itemHospPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHospPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemHospPatientActionPerformed

    private void itemCommCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCommCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCommCityActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void itemSysPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysPersonActionPerformed
        // TODO add your handling code here:
        PersonRegistration registerPerson = new PersonRegistration(personDir);
        registerPerson.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_itemSysPersonActionPerformed

    private void itemSysDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysDoctorActionPerformed
        // TODO add your handling code here:
        DoctorRegistration registerDoctor = new DoctorRegistration(docDir,personDir);
        registerDoctor.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_itemSysDoctorActionPerformed

    private void itemSysHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysHospitalActionPerformed
        // TODO add your handling code here:
        HospitalRegistration registerHosp = new HospitalRegistration(hospDir);
        registerHosp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_itemSysHospitalActionPerformed

    private void itemSysEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSysEncountersActionPerformed
        // TODO add your handling code here:
        EncounterSysRegistration registerSysEnc = new EncounterSysRegistration(encHis,personDir, patientDir,docDir,vitalDir);
        registerSysEnc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_itemSysEncountersActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void AssignMenu(String role){
        if(role.equals("system_admin")){
            roleSysAdmin.setVisible(true);
            roleHospAdmin.setVisible(true);
            roleCommAdmin.setVisible(true);
        }
        if(role.equals("hospital_admin")){
            roleSysAdmin.setVisible(false);
            roleHospAdmin.setVisible(true);
            roleCommAdmin.setVisible(false);
        }
        if(role.equals("community_admin")){
            roleSysAdmin.setVisible(false);
            roleHospAdmin.setVisible(false);
            roleCommAdmin.setVisible(true);
        }
    
    }
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JMenuItem itemCommCity;
    private javax.swing.JMenuItem itemCommCommunity;
    private javax.swing.JMenuItem itemCommHouses;
    private javax.swing.JMenuItem itemHospDoctor;
    private javax.swing.JMenuItem itemHospEncounters;
    private javax.swing.JMenuItem itemHospHospital;
    private javax.swing.JMenuItem itemHospPatient;
    private javax.swing.JMenuItem itemSysDoctor;
    private javax.swing.JMenuItem itemSysEncounters;
    private javax.swing.JMenuItem itemSysHospital;
    private javax.swing.JMenuItem itemSysPatient;
    private javax.swing.JMenuItem itemSysPerson;
    private javax.swing.JMenuBar menuRoles;
    private javax.swing.JMenu roleCommAdmin;
    private javax.swing.JMenu roleHospAdmin;
    private javax.swing.JMenu roleSysAdmin;
    // End of variables declaration//GEN-END:variables


}
