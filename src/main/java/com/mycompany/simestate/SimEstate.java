/*
 * 
 * 
 * modified     20230720
 * date         20220720
 * @filename    SimEstate.java
 * @author      curtiswong
 * @version     1.0.0 
 * @see         N/A
 */

package com.mycompany.simestate;
import java.awt.Dialog;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author user
 */
public class SimEstate extends javax.swing.JFrame {

    public SimEstate() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dContractDes = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        cmbCDesType = new javax.swing.JComboBox<>();
        cmbCDes = new javax.swing.JComboBox<>();
        txtCDistance = new javax.swing.JTextField();
        txtCAddress = new javax.swing.JTextField();
        btnCDes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cDesFeedback = new javax.swing.JTextArea();
        backdropCDes = new javax.swing.JLabel();
        dContractBuild = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        cmbCBuildType = new javax.swing.JComboBox<>();
        cmbCBedrooms = new javax.swing.JComboBox<>();
        cmbCBathrooms = new javax.swing.JComboBox<>();
        cmbCFloors = new javax.swing.JComboBox<>();
        cmbCParking = new javax.swing.JComboBox<>();
        txtCArea = new javax.swing.JTextField();
        txtCYardArea = new javax.swing.JTextField();
        lblConfig = new javax.swing.JLabel();
        btnCBuild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cBuildFeedback = new javax.swing.JTextArea();
        backdropCBuild = new javax.swing.JLabel();
        dSimModes = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnGov = new javax.swing.JButton();
        btnBuyer = new javax.swing.JButton();
        btnContractor = new javax.swing.JButton();
        backDropModes = new javax.swing.JLabel();
        dGovDes = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        cmbGDesType = new javax.swing.JComboBox<>();
        cmbGDes = new javax.swing.JComboBox<>();
        txtGDistance = new javax.swing.JTextField();
        txtGName = new javax.swing.JTextField();
        txtGAddress = new javax.swing.JTextField();
        btnGDes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        gDesFeedback = new javax.swing.JTextArea();
        backdropGDes = new javax.swing.JLabel();
        dGovBuild = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        cmbGBuildType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbGBedrooms = new javax.swing.JComboBox<>();
        cmbGBathrooms = new javax.swing.JComboBox<>();
        cmbGFloors = new javax.swing.JComboBox<>();
        cmbGParking = new javax.swing.JComboBox<>();
        txtGArea = new javax.swing.JTextField();
        txtGYardArea = new javax.swing.JTextField();
        btnGBuild = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        cBuildFeedback1 = new javax.swing.JTextArea();
        backdropGBuild = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBegin = new javax.swing.JButton();
        backDrop = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        cmbCDesType.setBackground(new java.awt.Color(199, 223, 220));
        cmbCDesType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbCDesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Landmark", "Residential" }));
        cmbCDesType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCDesTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cmbCDesType);
        cmbCDesType.setBounds(452, 75, 115, 25);

        cmbCDes.setBackground(new java.awt.Color(199, 223, 220));
        cmbCDes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbCDes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Store", "Mall", "Hospital", "Station", "Office", "Community Centre" }));
        jPanel2.add(cmbCDes);
        cmbCDes.setBounds(583, 75, 115, 25);
        jPanel2.add(txtCDistance);
        txtCDistance.setBounds(501, 188, 115, 30);
        jPanel2.add(txtCAddress);
        txtCAddress.setBounds(452, 283, 163, 30);

        btnCDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnCDes.setBorderPainted(false);
        btnCDes.setContentAreaFilled(false);
        btnCDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDesActionPerformed(evt);
            }
        });
        jPanel2.add(btnCDes);
        btnCDes.setBounds(570, 350, 140, 40);

        cDesFeedback.setEditable(false);
        cDesFeedback.setColumns(20);
        cDesFeedback.setLineWrap(true);
        cDesFeedback.setRows(5);
        cDesFeedback.setBorder(null);
        cDesFeedback.setOpaque(false);
        jScrollPane2.setViewportView(cDesFeedback);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 320, 40);

        backdropCDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contract Destination.png"))); // NOI18N
        jPanel2.add(backdropCDes);
        backdropCDes.setBounds(0, 0, 720, 404);

        javax.swing.GroupLayout dContractDesLayout = new javax.swing.GroupLayout(dContractDes.getContentPane());
        dContractDes.getContentPane().setLayout(dContractDesLayout);
        dContractDesLayout.setHorizontalGroup(
            dContractDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dContractDesLayout.setVerticalGroup(
            dContractDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel3.setLayout(null);

        cmbCBuildType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbCBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Townhouse", "Apartment Building" }));
        cmbCBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCBuildTypeActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCBuildType);
        cmbCBuildType.setBounds(550, 155, 115, 25);

        cmbCBedrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCBedrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel3.add(cmbCBedrooms);
        cmbCBedrooms.setBounds(560, 204, 115, 24);

        cmbCBathrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCBathrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel3.add(cmbCBathrooms);
        cmbCBathrooms.setBounds(560, 230, 115, 24);

        cmbCFloors.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel3.add(cmbCFloors);
        cmbCFloors.setBounds(560, 260, 115, 24);

        cmbCParking.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbCParking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel3.add(cmbCParking);
        cmbCParking.setBounds(560, 290, 115, 24);

        txtCArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel3.add(txtCArea);
        txtCArea.setBounds(560, 335, 115, 24);

        txtCYardArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel3.add(txtCYardArea);
        txtCYardArea.setBounds(570, 370, 105, 24);

        lblConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png"))); // NOI18N
        jPanel3.add(lblConfig);
        lblConfig.setBounds(450, 200, 250, 200);

        btnCBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnCBuild.setBorderPainted(false);
        btnCBuild.setContentAreaFilled(false);
        btnCBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCBuildActionPerformed(evt);
            }
        });
        jPanel3.add(btnCBuild);
        btnCBuild.setBounds(210, 270, 150, 40);

        cBuildFeedback.setEditable(false);
        cBuildFeedback.setColumns(20);
        cBuildFeedback.setLineWrap(true);
        cBuildFeedback.setRows(5);
        cBuildFeedback.setBorder(null);
        cBuildFeedback.setOpaque(false);
        jScrollPane1.setViewportView(cBuildFeedback);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 320, 40);

        backdropCBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Contract-Build.png"))); // NOI18N
        jPanel3.add(backdropCBuild);
        backdropCBuild.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout dContractBuildLayout = new javax.swing.GroupLayout(dContractBuild.getContentPane());
        dContractBuild.getContentPane().setLayout(dContractBuildLayout);
        dContractBuildLayout.setHorizontalGroup(
            dContractBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dContractBuildLayout.setVerticalGroup(
            dContractBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel4.setLayout(null);

        btnGov.setBorderPainted(false);
        btnGov.setContentAreaFilled(false);
        btnGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGovActionPerformed(evt);
            }
        });
        jPanel4.add(btnGov);
        btnGov.setBounds(500, 135, 165, 185);

        btnBuyer.setBorderPainted(false);
        btnBuyer.setContentAreaFilled(false);
        btnBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuyer);
        btnBuyer.setBounds(67, 135, 165, 185);

        btnContractor.setBorderPainted(false);
        btnContractor.setContentAreaFilled(false);
        btnContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContractorActionPerformed(evt);
            }
        });
        jPanel4.add(btnContractor);
        btnContractor.setBounds(270, 135, 190, 185);

        backDropModes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sim Modes.png"))); // NOI18N
        jPanel4.add(backDropModes);
        backDropModes.setBounds(0, 0, 720, 405);

        javax.swing.GroupLayout dSimModesLayout = new javax.swing.GroupLayout(dSimModes.getContentPane());
        dSimModes.getContentPane().setLayout(dSimModesLayout);
        dSimModesLayout.setHorizontalGroup(
            dSimModesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dSimModesLayout.setVerticalGroup(
            dSimModesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel5.setLayout(null);

        cmbGDesType.setBackground(new java.awt.Color(199, 223, 220));
        cmbGDesType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbGDesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Landmark", "Residential" }));
        cmbGDesType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGDesTypeActionPerformed(evt);
            }
        });
        jPanel5.add(cmbGDesType);
        cmbGDesType.setBounds(452, 75, 115, 25);

        cmbGDes.setBackground(new java.awt.Color(199, 223, 220));
        cmbGDes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbGDes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Store", "Mall", "Hospital", "Station", "Office", "Community Centre" }));
        jPanel5.add(cmbGDes);
        cmbGDes.setBounds(583, 75, 115, 25);
        jPanel5.add(txtGDistance);
        txtGDistance.setBounds(501, 188, 115, 30);
        jPanel5.add(txtGName);
        txtGName.setBounds(576, 251, 125, 30);
        jPanel5.add(txtGAddress);
        txtGAddress.setBounds(575, 305, 130, 30);

        btnGDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnGDes.setBorderPainted(false);
        btnGDes.setContentAreaFilled(false);
        btnGDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDesActionPerformed(evt);
            }
        });
        jPanel5.add(btnGDes);
        btnGDes.setBounds(570, 350, 140, 40);

        gDesFeedback.setEditable(false);
        gDesFeedback.setColumns(20);
        gDesFeedback.setLineWrap(true);
        gDesFeedback.setRows(5);
        gDesFeedback.setBorder(null);
        gDesFeedback.setOpaque(false);
        jScrollPane3.setViewportView(gDesFeedback);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 320, 40);

        backdropGDes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gov Destination.png"))); // NOI18N
        jPanel5.add(backdropGDes);
        backdropGDes.setBounds(0, 0, 720, 404);

        javax.swing.GroupLayout dGovDesLayout = new javax.swing.GroupLayout(dGovDes.getContentPane());
        dGovDes.getContentPane().setLayout(dGovDesLayout);
        dGovDesLayout.setHorizontalGroup(
            dGovDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dGovDesLayout.setVerticalGroup(
            dGovDesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        jPanel6.setLayout(null);

        cmbGBuildType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbGBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Townhouse", "Apartment Building" }));
        cmbGBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGBuildTypeActionPerformed(evt);
            }
        });
        jPanel6.add(cmbGBuildType);
        cmbGBuildType.setBounds(550, 155, 115, 25);

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 16)); // NOI18N
        jLabel1.setText("TYPE");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(467, 210, 50, 20);

        cmbGBedrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbGBedrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel6.add(cmbGBedrooms);
        cmbGBedrooms.setBounds(560, 204, 115, 24);

        cmbGBathrooms.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbGBathrooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel6.add(cmbGBathrooms);
        cmbGBathrooms.setBounds(560, 230, 115, 24);

        cmbGFloors.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbGFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel6.add(cmbGFloors);
        cmbGFloors.setBounds(560, 260, 115, 24);

        cmbGParking.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbGParking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel6.add(cmbGParking);
        cmbGParking.setBounds(560, 290, 115, 24);

        txtGArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel6.add(txtGArea);
        txtGArea.setBounds(560, 335, 115, 24);

        txtGYardArea.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel6.add(txtGYardArea);
        txtGYardArea.setBounds(570, 370, 105, 24);

        btnGBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnGBuild.setBorderPainted(false);
        btnGBuild.setContentAreaFilled(false);
        btnGBuild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGBuildActionPerformed(evt);
            }
        });
        jPanel6.add(btnGBuild);
        btnGBuild.setBounds(210, 270, 150, 40);

        cBuildFeedback1.setEditable(false);
        cBuildFeedback1.setColumns(20);
        cBuildFeedback1.setLineWrap(true);
        cBuildFeedback1.setRows(5);
        cBuildFeedback1.setBorder(null);
        cBuildFeedback1.setOpaque(false);
        jScrollPane4.setViewportView(cBuildFeedback1);

        jPanel6.add(jScrollPane4);
        jScrollPane4.setBounds(20, 350, 320, 40);

        backdropGBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gov Build.png"))); // NOI18N
        jPanel6.add(backdropGBuild);
        backdropGBuild.setBounds(0, 0, 720, 410);

        javax.swing.GroupLayout dGovBuildLayout = new javax.swing.GroupLayout(dGovBuild.getContentPane());
        dGovBuild.getContentPane().setLayout(dGovBuildLayout);
        dGovBuildLayout.setHorizontalGroup(
            dGovBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        dGovBuildLayout.setVerticalGroup(
            dGovBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnBegin.setBackground(new java.awt.Color(189, 215, 203));
        btnBegin.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 16)); // NOI18N
        btnBegin.setForeground(new java.awt.Color(76, 135, 154));
        btnBegin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Begin.png"))); // NOI18N
        btnBegin.setBorderPainted(false);
        btnBegin.setContentAreaFilled(false);
        btnBegin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginActionPerformed(evt);
            }
        });
        jPanel1.add(btnBegin);
        btnBegin.setBounds(600, 10, 110, 30);

        backDrop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backDrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sim Estate.png"))); // NOI18N
        jPanel1.add(backDrop);
        backDrop.setBounds(0, 0, 720, 405);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginActionPerformed
        screenRoute(dSimModes);
    }//GEN-LAST:event_btnBeginActionPerformed

    private void btnCDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDesActionPerformed
        screenRoute(dContractBuild);
    }//GEN-LAST:event_btnCDesActionPerformed

    private void cmbCDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCDesTypeActionPerformed
        cmbCDes.setModel(desModel(cmbCDesType));
    }//GEN-LAST:event_cmbCDesTypeActionPerformed

    private void btnGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovActionPerformed
        screenRoute(dGovDes);
    }//GEN-LAST:event_btnGovActionPerformed

    private void btnBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyerActionPerformed

    private void btnContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractorActionPerformed
        screenRoute(dContractDes);
    }//GEN-LAST:event_btnContractorActionPerformed

    private void cmbCBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCBuildTypeActionPerformed
        if(cmbCBuildType.getSelectedItem().equals("House")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);
        } 
        else if (cmbCBuildType.getSelectedItem().equals("Townhouse")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);
            
        } else {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartmentConfig.png")));
            cmbCParking.setVisible(false);
            
        }
    }//GEN-LAST:event_cmbCBuildTypeActionPerformed

    private void btnCBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCBuildActionPerformed
        if(cmbCBuildType.getSelectedItem().equals("House")) {
            // create House object
        } 
        else if (cmbCBuildType.getSelectedItem().equals("Townhouse")) {
            // create Townhouse object
            
        } else {
//            int unitsbyFloor = Integer.valueOf(txtYardArea.getText());
            // create apartemtn object
        }
        
//        dispose();
    }//GEN-LAST:event_btnCBuildActionPerformed

    private void cmbGDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGDesTypeActionPerformed
        cmbGDes.setModel(desModel(cmbGDesType));
    }//GEN-LAST:event_cmbGDesTypeActionPerformed

    private void btnGDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDesActionPerformed
//        screenRoute();
    }//GEN-LAST:event_btnGDesActionPerformed

    private void cmbGBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGBuildTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGBuildTypeActionPerformed

    private void btnGBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGBuildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGBuildActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(SimEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimEstate frame = new SimEstate();
                frame.setSize(735, 445);
                frame.setVisible(true);
            }
        });
    }
    
    public void screenRoute(javax.swing.JDialog dialog) {
        dialog.setSize(735, 445);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setVisible(true);
    }
    
    public DefaultComboBoxModel<String> desModel(javax.swing.JComboBox combo) {
        if(combo.getSelectedItem().equals("Residential")) {
            String[] residentialDestinations = {"House 1", "Townhouse 2", "Condo 3"};
            DefaultComboBoxModel<String> resModel = new DefaultComboBoxModel<>(residentialDestinations);
            return resModel;
        } else {
            String[] landmarkDestinations = {"School", "Store", "Mall", "Hospital", "Station", "Office", "Community Centre"};
            DefaultComboBoxModel<String> markModel = new DefaultComboBoxModel<>(landmarkDestinations);
            return markModel;
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backDrop;
    private javax.swing.JLabel backDropModes;
    private javax.swing.JLabel backdropCBuild;
    private javax.swing.JLabel backdropCDes;
    private javax.swing.JLabel backdropGBuild;
    private javax.swing.JLabel backdropGDes;
    private javax.swing.JButton btnBegin;
    private javax.swing.JButton btnBuyer;
    private javax.swing.JButton btnCBuild;
    private javax.swing.JButton btnCDes;
    private javax.swing.JButton btnContractor;
    private javax.swing.JButton btnGBuild;
    private javax.swing.JButton btnGDes;
    private javax.swing.JButton btnGov;
    private javax.swing.JTextArea cBuildFeedback;
    private javax.swing.JTextArea cBuildFeedback1;
    private javax.swing.JTextArea cDesFeedback;
    private javax.swing.JComboBox<String> cmbCBathrooms;
    private javax.swing.JComboBox<String> cmbCBedrooms;
    private javax.swing.JComboBox<String> cmbCBuildType;
    private javax.swing.JComboBox<String> cmbCDes;
    private javax.swing.JComboBox<String> cmbCDesType;
    private javax.swing.JComboBox<String> cmbCFloors;
    private javax.swing.JComboBox<String> cmbCParking;
    private javax.swing.JComboBox<String> cmbGBathrooms;
    private javax.swing.JComboBox<String> cmbGBedrooms;
    private javax.swing.JComboBox<String> cmbGBuildType;
    private javax.swing.JComboBox<String> cmbGDes;
    private javax.swing.JComboBox<String> cmbGDesType;
    private javax.swing.JComboBox<String> cmbGFloors;
    private javax.swing.JComboBox<String> cmbGParking;
    private javax.swing.JDialog dContractBuild;
    private javax.swing.JDialog dContractDes;
    private javax.swing.JDialog dGovBuild;
    private javax.swing.JDialog dGovDes;
    private javax.swing.JDialog dSimModes;
    private javax.swing.JTextArea gDesFeedback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JTextField txtCAddress;
    private javax.swing.JTextField txtCArea;
    private javax.swing.JTextField txtCDistance;
    private javax.swing.JTextField txtCYardArea;
    private javax.swing.JTextField txtGAddress;
    private javax.swing.JTextField txtGArea;
    private javax.swing.JTextField txtGDistance;
    private javax.swing.JTextField txtGName;
    private javax.swing.JTextField txtGYardArea;
    // End of variables declaration//GEN-END:variables
}
