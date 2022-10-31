/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HealthUI;

import Healthmodel.City;
import Healthmodel.Community;
import Healthmodel.Hospital;
import Healthmodel.HospitalDirectory;
import Healthmodel.House;
import Healthmodel.State;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chava
 */
public class HosphospRegister extends javax.swing.JFrame {

    /**
     * Creates new form HosphospRegister
     */
    Hospital hosp = new Hospital();
    HospitalDirectory hospDir;
    Community houseDir;
    public HosphospRegister(HospitalDirectory hospDir) {
        initComponents();
        this.hospDir=hospDir;
        if(houseDir == null){
            ArrayList<House> houseDir = new ArrayList<>();
        }
        else{
            this.houseDir = houseDir;
        }
        dropdownCity();
        dropdownCommunity();
//        dropdownHouse();
        hospDispTable();
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
        hospitalSearchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        hospitalName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hospitalLicenseNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        hospitalNowards = new javax.swing.JTextField();
        hospitalHomeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hospitalLogoutBtn = new javax.swing.JButton();
        hospitalRegisterBtn = new javax.swing.JButton();
        hospitalUpdateBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        hospitalState = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hospitalZipCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();
        communityCombo = new javax.swing.JComboBox<>();
        hospAddress = new javax.swing.JTextField();
        hospitalViewBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        hospitalSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        hospTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hospitalSearchBtn.setText("Search");
        hospitalSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalSearchBtnActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospital Details"));

        hospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameActionPerformed(evt);
            }
        });
        hospitalName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospitalNameKeyTyped(evt);
            }
        });

        jLabel3.setText("License No");

        jLabel2.setText("Name");

        hospitalLicenseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalLicenseNoActionPerformed(evt);
            }
        });
        hospitalLicenseNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospitalLicenseNoKeyTyped(evt);
            }
        });

        jLabel9.setText("No. of Wards");

        hospitalNowards.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospitalNowardsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hospitalLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalNowards, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalNowards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hospitalHomeBtn.setText("Home");
        hospitalHomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalHomeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 15)); // NOI18N
        jLabel1.setText("Hospital Registration");

        hospitalLogoutBtn.setText("Logout");
        hospitalLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalLogoutBtnActionPerformed(evt);
            }
        });

        hospitalRegisterBtn.setText("Register");
        hospitalRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalRegisterBtnActionPerformed(evt);
            }
        });

        hospitalUpdateBtn.setText("Update");
        hospitalUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalUpdateBtnActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Address Details"));

        hospitalState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospitalStateKeyTyped(evt);
            }
        });

        jLabel6.setText("City");

        jLabel7.setText("Community");

        jLabel8.setText("Zip Code");

        jLabel4.setText("Address");

        hospitalZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalZipCodeActionPerformed(evt);
            }
        });
        hospitalZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospitalZipCodeKeyTyped(evt);
            }
        });

        jLabel5.setText("State");

        cityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cityCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityComboItemStateChanged(evt);
            }
        });
        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        communityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        communityCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communityComboItemStateChanged(evt);
            }
        });

        hospAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospAddressActionPerformed(evt);
            }
        });
        hospAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hospAddressKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(hospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalState, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(156, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hospAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hospitalZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        hospitalViewBtn.setText("View");
        hospitalViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalViewBtnActionPerformed(evt);
            }
        });

        hospitalSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalSearchActionPerformed(evt);
            }
        });

        hospTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "License No", "Name", "Address", "Community", "City", "State", "Zip Code", "No of Wards"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(hospTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(hospitalRegisterBtn)
                                .addGap(128, 128, 128)
                                .addComponent(hospitalUpdateBtn)
                                .addGap(154, 154, 154)
                                .addComponent(hospitalViewBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(hospitalSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(hospitalSearchBtn)))))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(hospitalHomeBtn)
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hospitalLogoutBtn)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospitalHomeBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(hospitalLogoutBtn))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalUpdateBtn)
                    .addComponent(hospitalRegisterBtn)
                    .addComponent(hospitalViewBtn))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalSearchBtn))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dropdownCity() {
            ArrayList<String> cityDropdown = new ArrayList<>();
            for (int i = 0; i < State.cityDir.size(); i++) {
                cityDropdown.add(State.cityDir.get(i).newCity);
            }

            String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
            DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
            cityCombo.setModel(yearsSDropdownModel);
        }
    
    public void dropdownCommunity() {
        ArrayList<String> communityDropdown = new ArrayList<>();
        String val;    
        if(cityCombo.getSelectedIndex() == -1){
            val = "";
        }
        else{
            val = cityCombo.getSelectedItem().toString();
        }
        City.communityDirectory.stream().filter(communityValue -> (communityValue.newCity == null ? val.equals("") : communityValue.newCity.equals(val))).forEachOrdered(communityValue -> {
                communityDropdown.add(String.valueOf(communityValue.communityName));
            });
        String[] communitySDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
        DefaultComboBoxModel<String> SDropdownModel = new DefaultComboBoxModel<>(communitySDropdown);
        this.communityCombo.setModel(SDropdownModel);
        
        
    }
    private void hospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalSearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalSearchBtnActionPerformed

    private void hospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalNameActionPerformed

    private void hospitalNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospitalNameKeyTyped
        // TODO add your handling code here:

        char typedHospName = evt.getKeyChar();
        if(!Character.isAlphabetic(typedHospName)&& !Character.isWhitespace(typedHospName)){
            evt.consume();
        }
        if(hospitalName.getText().length()>100)
        evt.consume();

    }//GEN-LAST:event_hospitalNameKeyTyped

    private void hospitalLicenseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalLicenseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalLicenseNoActionPerformed

    private void hospitalLicenseNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospitalLicenseNoKeyTyped
        // TODO add your handling code here:
        char typedlic = evt.getKeyChar();
        if(!Character.isDigit(typedlic)){
            evt.consume();
        }
        //Restrict the length to 5
        if(hospitalLicenseNo.getText().length() > 4){
            evt.consume();
        }

    }//GEN-LAST:event_hospitalLicenseNoKeyTyped

    private void hospitalNowardsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospitalNowardsKeyTyped
        // TODO add your handling code here:

        char ward = evt.getKeyChar();
        if(!Character.isDigit(ward)){
            evt.consume();
        }
        //Restrict the length to 5
        if(hospitalNowards.getText().length() > 4){
            evt.consume();
        }
    }//GEN-LAST:event_hospitalNowardsKeyTyped

    private void hospitalHomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalHomeBtnActionPerformed
        // TODO add your handling code here:

        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_hospitalHomeBtnActionPerformed

    private void hospitalLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalLogoutBtnActionPerformed
        // TODO add your handling code here

        LoginFrame newLoginPage = new LoginFrame();
        newLoginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_hospitalLogoutBtnActionPerformed

    private void hospitalRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalRegisterBtnActionPerformed
        // TODO add your handling code here:
        if(validation()){
            Hospital hosp=new Hospital();
            hosp.setHospName(hospitalName.getText());
            hosp.setHospLicNo(Integer.parseInt(hospitalLicenseNo.getText()));
            hosp.setHospAddress(hospAddress.getText());
            hosp.residence.setCommunityName((String)communityCombo.getSelectedItem()) ;
            hosp.residence.setNewCity((String)cityCombo.getSelectedItem());
            hosp.residence.zip = Integer.parseInt(hospitalZipCode.getText());
            hosp.residence.setState(hospitalState.getText());
            hosp.setHospWard(Integer.parseInt(hospitalNowards.getText()));

            HospitalDirectory.hospDir.add(hosp);
            JOptionPane.showMessageDialog(this, "Person Successfully Added");
            hospDispTable();
        }
    }//GEN-LAST:event_hospitalRegisterBtnActionPerformed

    private void hospitalUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalUpdateBtnActionPerformed
        // TODO add your handling code here:
        if(validation()){
            int selectedRowIndex1=hospTable.getSelectedRow();
            DefaultTableModel model1 = (DefaultTableModel) hospTable.getModel();
            Hospital selectedHosp=(Hospital)model1.getValueAt(selectedRowIndex1,0);
            selectedHosp.setHospName(hospitalName.getText());
            selectedHosp.setHospLicNo(Integer.parseInt(hospitalLicenseNo.getText()));
            selectedHosp.setHospAddress((hospAddress.getText()));
            selectedHosp.residence.setCommunityName((String)communityCombo.getSelectedItem()) ;
            selectedHosp.residence.zip = Integer.parseInt(hospitalZipCode.getText());
            selectedHosp.residence.newCity = (String)cityCombo.getSelectedItem();
            selectedHosp.residence.state = hospitalState.getText();
            selectedHosp.setHospWard(Integer.parseInt(hospitalNowards.getText()));
            hospDispTable();
        }
    }//GEN-LAST:event_hospitalUpdateBtnActionPerformed

    private void hospitalStateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospitalStateKeyTyped
        // TODO add your handling code here:

        char typedAddress = evt.getKeyChar();
        if(!Character.isAlphabetic(typedAddress) && !Character.isWhitespace(typedAddress)){
            evt.consume();
        }
        //Restrict the length to 256
        if(hospitalState.getText().length() > 100){
            evt.consume();
        }
    }//GEN-LAST:event_hospitalStateKeyTyped

    private void hospitalZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalZipCodeActionPerformed

    private void hospitalZipCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospitalZipCodeKeyTyped
        // TODO add your handling code here:
        char state = evt.getKeyChar();
        if(!Character.isAlphabetic(state) && !Character.isWhitespace(state)){
            evt.consume();
        }
        //Restrict the length to 256
        if(hospitalZipCode.getText().length() > 100){
            evt.consume();
        }

    }//GEN-LAST:event_hospitalZipCodeKeyTyped

    private void cityComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityComboItemStateChanged
        // TODO add your handling code here:
        dropdownCommunity();
    }//GEN-LAST:event_cityComboItemStateChanged

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityComboActionPerformed

    private void communityComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communityComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_communityComboItemStateChanged

    private void hospAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospAddressActionPerformed

    private void hospAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_hospAddressKeyTyped

    private void hospitalViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalViewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex1=hospTable.getSelectedRow();
        if (selectedRowIndex1<0){
            JOptionPane.showMessageDialog(this,"Please select a row to View");
            return;
        }
        DefaultTableModel model1 = (DefaultTableModel) hospTable.getModel();
        Hospital selectedHosp=(Hospital)model1.getValueAt(selectedRowIndex1,0);
        hospitalName.setText(selectedHosp.getHospName());
        hospitalLicenseNo.setText(String.valueOf(selectedHosp.getHospLicNo()));
        hospitalNowards.setText(String.valueOf(selectedHosp.getHospWard()));
        hospitalZipCode.setText(String.valueOf(selectedHosp.residence.getZip()));
        communityCombo.setSelectedItem(selectedHosp.residence.getCommunityName());
        hospAddress.setText(selectedHosp.getHospAddress());
        hospitalState.setText(selectedHosp.residence.getNewCity());
        hospitalZipCode.setText(selectedHosp.residence.getState());
    }//GEN-LAST:event_hospitalViewBtnActionPerformed

    private void hospitalSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalSearchActionPerformed

    public void hospDispTable(){
        DefaultTableModel model1 = (DefaultTableModel) hospTable.getModel();
        model1.setRowCount(0);
        System.out.println("Done");
        for (Hospital h:HospitalDirectory.getHospDir()){
            Object[] row=new Object[8];
            row[0]=h;
            row[1]=h.getHospName();
            row[2]=h.getHospAddress();
            row[3]=h.residence.getCommunityName();
            row[4]=h.residence.getNewCity();
            row[5]=h.residence.getState();
            row[6]=h.residence.getZip();
            row[7]=h.getHospWard();
            model1.addRow(row);
        }
    }
    boolean validation(){
        String lic, hospname, wardNo, gender, community, city, state, username,streetaddress ;
        String address,houseNumber, zipCode, age, bloodGroup, height, weight;
        String contactDetails;
        Date dob;
        //String patternEmail = "^[A-Za-z0-9+_.-]+@(.+)$";
        String patternEmail = "^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$";
        String bmi = "[(0-9\\.)]{2,}$";
               
        ///
        hospname = hospitalName.getText();
        lic = hospitalLicenseNo.getText();
        wardNo = hospitalNowards.getText();
    
        streetaddress = hospAddress.getText();
        community = (String)communityCombo.getSelectedItem();
        city = (String)cityCombo.getSelectedItem();
        state = hospitalZipCode.getText();
        zipCode = hospitalZipCode.getText();
        ///
        //bloodGroup = (String) patientBloodGroupTxt.getSelectedItem();
       
       
        if (hospname.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital Name");
            return false;
        }
       
        if (hospitalLicenseNo.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital License Number");
            return false;
        }
       
        if (hospitalNowards.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter valid contact Number");
            hospitalNowards.setText("");
           
            return false;
        }

       
        if (hospAddress.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital Address");
            return false;
        }
       
        if (communityCombo.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital Community");
            return false;
        }
       
        if (hospitalState.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital City");
            return false;
        }
       
        if (hospitalZipCode.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter hospital State");
            return false;
        }
       
        if (hospitalZipCode.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter ZipCode");
            return false;
        }
       
        
       

       
        return true;
       
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
//            java.util.logging.Logger.getLogger(HosphospRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HosphospRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HosphospRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HosphospRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HosphospRegister().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> communityCombo;
    private javax.swing.JTextField hospAddress;
    private javax.swing.JTable hospTable;
    private javax.swing.JButton hospitalHomeBtn;
    private javax.swing.JTextField hospitalLicenseNo;
    private javax.swing.JButton hospitalLogoutBtn;
    private javax.swing.JTextField hospitalName;
    private javax.swing.JTextField hospitalNowards;
    private javax.swing.JButton hospitalRegisterBtn;
    private javax.swing.JTextField hospitalSearch;
    private javax.swing.JButton hospitalSearchBtn;
    private javax.swing.JTextField hospitalState;
    private javax.swing.JButton hospitalUpdateBtn;
    private javax.swing.JButton hospitalViewBtn;
    private javax.swing.JTextField hospitalZipCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
