/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthUI;

import Healthmodel.Person;
import Healthmodel.PersonDirectory;
import Healthmodel.House;
import Healthmodel.City;
import Healthmodel.Community;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chava
 */
public class PersonRegistration extends javax.swing.JFrame {
    PersonDirectory personDir;
//    Person person= new Person();
    
    public PersonRegistration(PersonDirectory personDir) {
        initComponents();
        this.personDir=personDir;
        personDispTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        personHomeBtn = new javax.swing.JButton();
        personLogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        personName = new javax.swing.JTextField();
        personID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        personContact = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        personHouse = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        personEmailID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        personCommunity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        personGender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        personCity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        personAge = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        personState = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        personZipCode = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        personCreatePswd = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        personReenterPswd = new javax.swing.JTextField();
        personRegisterBtn = new javax.swing.JButton();
        personViewBtn = new javax.swing.JButton();
        personUpdateBtn = new javax.swing.JButton();
        personDeleteBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1062, 671));

        personHomeBtn.setText("Home");
        personHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personHomeBtnActionPerformed(evt);
            }
        });

        personLogoutBtn.setText("Logout");
        personLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personLogoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 15)); // NOI18N
        jLabel1.setText("Person Registration");

        personID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personIDActionPerformed(evt);
            }
        });

        jLabel11.setText("Person ID");

        jLabel2.setText("Name");

        jLabel3.setText("Contact");

        jLabel19.setText("Community");

        jLabel10.setText("Email ID");

        jLabel7.setText("House");

        personCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCommunityActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender");

        personGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personGenderActionPerformed(evt);
            }
        });

        jLabel9.setText("City");

        personCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCityActionPerformed(evt);
            }
        });

        jLabel15.setText("Age");

        personAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAgeActionPerformed(evt);
            }
        });

        jLabel16.setText("State");

        jLabel8.setText("DOB");

        jLabel12.setText("Zip Code");

        personZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personZipCodeActionPerformed(evt);
            }
        });

        jLabel21.setText("Password");

        jLabel20.setText("Re-enter Password");

        personReenterPswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personReenterPswdActionPerformed(evt);
            }
        });

        personRegisterBtn.setText("REGISTER");
        personRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personRegisterBtnActionPerformed(evt);
            }
        });

        personViewBtn.setText("View");
        personViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personViewBtnActionPerformed(evt);
            }
        });

        personUpdateBtn.setText("Update");

        personDeleteBtn.setText("Delete");
        personDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personDeleteBtnActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Name", "Age", "Contact No", "Email ID", "Gender", "House", "Community", "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(personTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(personName, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(personContact))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(personEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personAge, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel20))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(personReenterPswd)
                                            .addComponent(personCreatePswd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personID, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(personCommunity)
                            .addComponent(personHouse)
                            .addComponent(personCity)
                            .addComponent(personState)
                            .addComponent(personZipCode))
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(personHomeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personLogoutBtn)))
                .addGap(54, 54, 54))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(personViewBtn)
                        .addGap(81, 81, 81)
                        .addComponent(personUpdateBtn)
                        .addGap(85, 85, 85)
                        .addComponent(personDeleteBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(personRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personHomeBtn)
                    .addComponent(personLogoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(personName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(personID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(personContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(personEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(personGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(personAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(personCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(personHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(personCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(personState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(personZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(personCreatePswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addComponent(jLabel21)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(personReenterPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(personRegisterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personUpdateBtn)
                    .addComponent(personDeleteBtn)
                    .addComponent(personViewBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personHomeBtnActionPerformed
        // TODO add your handling code here:
        MainFrame newMainFrame=new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_personHomeBtnActionPerformed

    private void personIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personIDActionPerformed

    private void personCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personCommunityActionPerformed

    private void personCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personCityActionPerformed

    private void personAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personAgeActionPerformed

    private void personZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personZipCodeActionPerformed

    private void personReenterPswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personReenterPswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personReenterPswdActionPerformed

    private void personRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personRegisterBtnActionPerformed
        // TODO add your handling code here:
        Person person=new Person();
        person.setName(personName.getText());
        person.setAge(Integer.parseInt(personAge.getText()));
        person.setContactNo(Long.parseLong(personContact.getText()));
        person.setEmailId(personEmailID.getText());
        person.setGender(personGender.getText());
        person.residence.communityName= personCommunity.getText();
        person.residence.houseNo= Integer.parseInt(personHouse.getText());
        person.residence.zip = Integer.parseInt(personZipCode.getText());
        person.residence.newCity = personCity.getText();
        person.residence.state = personState.getText();
        person.setPersonId(Integer.parseInt(personID.getText()));
        
        person.setPwd(personCreatePswd.getText());
        PersonDirectory.personDir.add(person);
        JOptionPane.showMessageDialog(this, "Person Successfully Added");
        personDispTable();
    }//GEN-LAST:event_personRegisterBtnActionPerformed

    private void personDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personDeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personDeleteBtnActionPerformed

    private void personViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personViewBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex=personTable.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        Person selectedPerson=(Person)model.getValueAt(selectedRowIndex,0);
        personName.setText(selectedPerson.getName());
        personID.setText(String.valueOf(selectedPerson.getPersonId()));
        personContact.setText(String.valueOf(selectedPerson.getContactNo()));
        personHouse.setText(String.valueOf(selectedPerson.residence.getHouseNo()));
        personEmailID.setText(selectedPerson.getEmailId());
        personCommunity.setText(selectedPerson.residence.getCommunityName());
        personAge.setText(String.valueOf(selectedPerson.getAge()));
        personGender.setText(selectedPerson.getGender());
        personCity.setText(selectedPerson.residence.getNewCity());
        personState.setText(selectedPerson.residence.getState());
        personZipCode.setText(String.valueOf(selectedPerson.residence.getZip()));
        
        //        SimpleDateFormat strdate = new SimpleDateFormat("MMM-dd-yyyy");
        //PhotoDisp.setIcon(selectedEmp.getIcon());
    }//GEN-LAST:event_personViewBtnActionPerformed

    private void personGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personGenderActionPerformed

    private void personLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personLogoutBtnActionPerformed
        // TODO add your handling code here:
        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_personLogoutBtnActionPerformed
    
    public void personDispTable(){
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        model.setRowCount(0);
        System.out.println("Done");
        for (Person person: PersonDirectory.personDir){
            Object[] row=new Object[10];
            row[0]=person;
            row[1]=person.getPersonId();
            row[2]=person.getContactNo();
            row[3]=person.getEmailId();
            row[4]=person.getGender();
            row[5]=person.getAge();
            row[6]=person.residence.getHouseNo();
            row[7]=person.residence.getCommunityName();
            row[8]=person.residence.getNewCity();
            row[9]=person.residence.getState();
            model.addRow(row);
    }
    }
    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(PersonRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PersonRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PersonRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PersonRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PersonRegistration(personDir).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField personAge;
    private javax.swing.JTextField personCity;
    private javax.swing.JTextField personCommunity;
    private javax.swing.JTextField personContact;
    private javax.swing.JTextField personCreatePswd;
    private javax.swing.JButton personDeleteBtn;
    private javax.swing.JTextField personEmailID;
    private javax.swing.JTextField personGender;
    private javax.swing.JButton personHomeBtn;
    private javax.swing.JTextField personHouse;
    private javax.swing.JTextField personID;
    private javax.swing.JButton personLogoutBtn;
    private javax.swing.JTextField personName;
    private javax.swing.JTextField personReenterPswd;
    private javax.swing.JButton personRegisterBtn;
    private javax.swing.JTextField personState;
    private javax.swing.JTable personTable;
    private javax.swing.JButton personUpdateBtn;
    private javax.swing.JButton personViewBtn;
    private javax.swing.JTextField personZipCode;
    // End of variables declaration//GEN-END:variables
}
