/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HealthUI;

import Healthmodel.Doctor;
import Healthmodel.DoctorDirectory;
import Healthmodel.Encounter;
import Healthmodel.EncounterHistory;
import Healthmodel.Patient;
import Healthmodel.PatientDirectory;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author chava
 */
public class PatientBookEncounter extends javax.swing.JPanel {

    /**
     * Creates new form PatientBookEncounter
     */
    EncounterHistory encHis;
    Patient patient = new Patient();
    Doctor doc = new Doctor();
    String community;
    int docId;
    private TableRowSorter searcher;
    public PatientBookEncounter(String patientUsername,EncounterHistory encHis) {
        initComponents();

        if(encHis == null){
            this.encHis = new EncounterHistory();
        }
        else{
            this.encHis = encHis;
        }
        
        for(Patient p:PatientDirectory.getPatientDir()){
            if(patientUsername.equals(p.getEmailId())){
                patient = p;
                community = p.residence.getCommunityName();
                System.out.println(community);
            }
        }
        
        for(Doctor d: DoctorDirectory.getDocDir()){
            if(community.equals(d.residence.getCommunityName())){
                docId = d.getDocId();
                System.out.println(docId);
            }
        }
        docTableData(docId);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookappointmentDoctorID = new javax.swing.JTextField();
        bookappointmentEncounterID = new javax.swing.JTextField();
        bookappointmentSearchDoctor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookDocTable = new javax.swing.JTable();
        bookappointmenSelectDoctorBtn = new javax.swing.JButton();
        bookappointmentBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bookappointmentLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bookappointmentHomeBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        bookappointmentPatientID = new javax.swing.JTextField();
        bookApptDate = new com.toedter.calendar.JDateChooser();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();

        bookappointmentSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentSearchDoctorActionPerformed(evt);
            }
        });

        bookDocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name ", "Contact", "Email ID", "Gender", "Age", "Hospital Name", "Qualifications", "Specialization", "Avaialble Slots"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bookDocTable);

        bookappointmenSelectDoctorBtn.setText("Select Doctor");
        bookappointmenSelectDoctorBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookappointmenSelectDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmenSelectDoctorBtnActionPerformed(evt);
            }
        });

        bookappointmentBtn.setText("Book Appointment");
        bookappointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient ID");

        jLabel3.setText("Doctor ID");

        jLabel4.setText("Encounter ID");

        jLabel5.setText("Date");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bookappointmentLogoutBtn.setText("Logout");
        bookappointmentLogoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookappointmentLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentLogoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel1.setText("Book Appointment");

        bookappointmentHomeBtn.setText("Home");
        bookappointmentHomeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookappointmentHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentHomeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bookappointmentHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317)
                .addComponent(jLabel1)
                .addGap(317, 317, 317)
                .addComponent(bookappointmentLogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookappointmentLogoutBtn)
                    .addComponent(bookappointmentHomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jLabel6.setText("Time");

        bookappointmentPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookappointmentPatientIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(653, 653, 653)
                        .addComponent(bookappointmentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(bookappointmentSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bookappointmenSelectDoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bookappointmentDoctorID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookappointmentEncounterID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookApptDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookappointmentPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookappointmentSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookappointmenSelectDoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookappointmentPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookappointmentDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bookappointmentEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bookApptDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(bookappointmentBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookappointmentSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentSearchDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookappointmentSearchDoctorActionPerformed

    private void bookappointmenSelectDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmenSelectDoctorBtnActionPerformed
        // TODO add your handling code here:

        int i = bookDocTable.getSelectedRow();

        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a doctor to proceed.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) bookDocTable.getModel();
        Doctor doc1 = (Doctor) model.getValueAt(i, 1);

        
        int patientId = patient.getPatientId();
        int doctorId = doc.getDocId();
        int randomEncId=(int)(Math.random()*999+100);
        
        for(Encounter e:EncounterHistory.getEncHis()){
            if(randomEncId==e.getEncId()){
               
               randomEncId =(int)(Math.random()*999+100);
            }
        }
        bookappointmentEncounterID.setText(String.valueOf(randomEncId));
        bookappointmentPatientID.setText(String.valueOf(patientId));
        bookappointmentDoctorID.setText(String.valueOf(doctorId));

        bookappointmentEncounterID.setEditable(false);
        bookappointmentPatientID.setEditable(false);
        bookappointmentDoctorID.setEditable(false);

        

    }//GEN-LAST:event_bookappointmenSelectDoctorBtnActionPerformed

    private void bookappointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentBtnActionPerformed
        // TODO add your handling code here:

        System.out.println("***********");
        int i = bookDocTable.getSelectedRow();
        if (i<0){
            JOptionPane.showMessageDialog(this, "Please select a doctor to proceed.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) bookDocTable.getModel();
        Doctor doc1 = (Doctor) model.getValueAt(i, 1);
        int pID = patient.getPatientId();
        int docID = doc.getDocId();
        int encID=Integer.parseInt(bookappointmentEncounterID.getText());
        
        Date date = bookApptDate.getDate();
        LocalTime time = timePicker1.getTime();
        Encounter e = encHis.addNewEncounter(encID,pID,  docID, date, time );
        e.setEncId(encID);
        e.setEncDate(date);
        e.patient.setPatientId(pID);
        e.doc.setDocId(docID);
        e.setEncTime(time);
        JOptionPane.showMessageDialog(this, "Appointment booked successfully");
            

        bookappointmentEncounterID.setText(null);
        bookappointmentPatientID.setText(null);
        bookappointmentDoctorID.setText(null);
        bookApptDate.setDate(null);
        timePicker1.setTime(null);

    }//GEN-LAST:event_bookappointmentBtnActionPerformed

    private void bookappointmentLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentLogoutBtnActionPerformed
        // TODO add your handling code here:

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bookappointmentLogoutBtnActionPerformed

    private void bookappointmentHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentHomeBtnActionPerformed
        // TODO add your handling code here:

        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bookappointmentHomeBtnActionPerformed

    private void bookappointmentPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookappointmentPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookappointmentPatientIDActionPerformed
    

    private void docTableData(int drID) {
        //Type-cast table model into default table model
        DefaultTableModel model = (DefaultTableModel) bookDocTable.getModel();
        
        searcher = new TableRowSorter<>(model);
      
        //tblDisplay = new JTable(model);
        bookDocTable.setRowSorter(searcher);
        //Clear the table 
        model.setRowCount(0);
        System.out.println("&&&&&");
        System.out.println(drID);
        //Iterate through the records and fill row cells
        for(Doctor d1: DoctorDirectory.getDocDir()){
            
            // Create a row object (dtype: Object, size: number of columns required)
            Object[] row = new Object[10];
            row[0] = d1.getDocId();
            row[1] = d1;
            row[2] = d1.getContactNo();
            row[3] = d1.getEmailId();
            row[4] = d1.getGender();
            row[5] = d1.getAge();
            row[6] = d1.hosp.getHospName();
            row[7] = d1.getDocQualifications();
            row[8] = d1.getDocSpecialize();
            
            if(d1.getDocId() == docId){
                model.addRow(row);
                System.out.println("hereeeeeeeee");
            }
                  
        }
        
        //--------------
        bookappointmentSearchDoctor.getDocument().addDocumentListener(new DocumentListener() {
         @Override
         public void insertUpdate(DocumentEvent e) {
            search(bookappointmentSearchDoctor.getText());
         }
         @Override
         public void removeUpdate(DocumentEvent e) {
            search(bookappointmentSearchDoctor.getText());
         }
         @Override
         public void changedUpdate(DocumentEvent e) {
            search(bookappointmentSearchDoctor.getText());
         }
         public void search(String str) {
            if (str.length() == 0) {
               searcher.setRowFilter(null);
            } else {
               searcher.setRowFilter(RowFilter.regexFilter(str));
            }
         }
      });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bookApptDate;
    private javax.swing.JTable bookDocTable;
    private javax.swing.JButton bookappointmenSelectDoctorBtn;
    private javax.swing.JButton bookappointmentBtn;
    private javax.swing.JTextField bookappointmentDoctorID;
    private javax.swing.JTextField bookappointmentEncounterID;
    private javax.swing.JButton bookappointmentHomeBtn;
    private javax.swing.JButton bookappointmentLogoutBtn;
    private javax.swing.JTextField bookappointmentPatientID;
    private javax.swing.JTextField bookappointmentSearchDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}