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
        cmbDes = new javax.swing.JComboBox<>();
        cmbDesType = new javax.swing.JComboBox<>();
        txtDistance = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnConfirmDestination = new javax.swing.JButton();
        backdropDestination = new javax.swing.JLabel();
        dContractBuild = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        cmbBuildType = new javax.swing.JComboBox<>();
        lblBedrooms = new javax.swing.JLabel();
        txtBedrooms = new javax.swing.JTextField();
        txtFloors = new javax.swing.JTextField();
        lblFloors = new javax.swing.JLabel();
        lblParking = new javax.swing.JLabel();
        txtParking = new javax.swing.JTextField();
        backdropBuild = new javax.swing.JLabel();
        dSimModes = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnGov = new javax.swing.JButton();
        btnBuyer = new javax.swing.JButton();
        btnContractor = new javax.swing.JButton();
        backDropModes = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBegin = new javax.swing.JButton();
        backDrop = new javax.swing.JLabel();

        jPanel2.setLayout(null);

        cmbDes.setBackground(new java.awt.Color(199, 223, 220));
        cmbDes.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbDes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Store", "Mall", "Hospital", "Station", "Office", "Community Centre" }));
        jPanel2.add(cmbDes);
        cmbDes.setBounds(583, 75, 115, 25);

        cmbDesType.setBackground(new java.awt.Color(199, 223, 220));
        cmbDesType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbDesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Landmark", "Residential" }));
        cmbDesType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDesTypeActionPerformed(evt);
            }
        });
        jPanel2.add(cmbDesType);
        cmbDesType.setBounds(452, 75, 115, 25);

        txtDistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanceActionPerformed(evt);
            }
        });
        jPanel2.add(txtDistance);
        txtDistance.setBounds(501, 188, 115, 30);
        jPanel2.add(txtAddress);
        txtAddress.setBounds(452, 283, 163, 30);

        btnConfirmDestination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Confirm.png"))); // NOI18N
        btnConfirmDestination.setBorderPainted(false);
        btnConfirmDestination.setContentAreaFilled(false);
        btnConfirmDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmDestinationActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirmDestination);
        btnConfirmDestination.setBounds(570, 350, 140, 40);

        backdropDestination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Destination.png"))); // NOI18N
        jPanel2.add(backdropDestination);
        backdropDestination.setBounds(0, 0, 720, 404);

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

        lblType.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblType.setText("TYPE:");
        jPanel3.add(lblType);
        lblType.setBounds(470, 90, 50, 21);

        cmbBuildType.setBackground(new java.awt.Color(199, 223, 220));
        cmbBuildType.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        cmbBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "House", "Townhouse", "Apartment Building" }));
        cmbBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuildTypeActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBuildType);
        cmbBuildType.setBounds(550, 90, 115, 25);

        lblBedrooms.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblBedrooms.setText("Bedrooms:");
        jPanel3.add(lblBedrooms);
        lblBedrooms.setBounds(440, 140, 90, 21);
        jPanel3.add(txtBedrooms);
        txtBedrooms.setBounds(540, 140, 150, 22);
        jPanel3.add(txtFloors);
        txtFloors.setBounds(540, 190, 150, 22);

        lblFloors.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblFloors.setText("Floors:");
        jPanel3.add(lblFloors);
        lblFloors.setBounds(440, 190, 90, 21);

        lblParking.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        lblParking.setText("Parking:");
        jPanel3.add(lblParking);
        lblParking.setBounds(440, 240, 90, 21);
        jPanel3.add(txtParking);
        txtParking.setBounds(540, 240, 150, 22);

        backdropBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Build.png"))); // NOI18N
        jPanel3.add(backdropBuild);
        backdropBuild.setBounds(0, 0, 720, 410);

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
        dSimModes.setSize(735, 445);
        dSimModes.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dSimModes.setVisible(true);
    }//GEN-LAST:event_btnBeginActionPerformed

    private void cmbBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuildTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuildTypeActionPerformed

    private void btnConfirmDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmDestinationActionPerformed
        dContractBuild.setSize(735, 445);
        dContractBuild.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dContractBuild.setVisible(true);
    }//GEN-LAST:event_btnConfirmDestinationActionPerformed

    private void txtDistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistanceActionPerformed

    private void cmbDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDesTypeActionPerformed
        if(cmbDesType.getSelectedItem().equals("Residential")) {
            String[] residentialDestinations = {"House 1", "Townhouse 2", "Condo 3"};
            DefaultComboBoxModel<String> resModel = new DefaultComboBoxModel<>(residentialDestinations);
            cmbDes.setModel(resModel);
        } else {
            String[] landmarkDestinations = {"School", "Store", "Mall", "Hospital", "Station", "Office", "Community Centre"};
            DefaultComboBoxModel<String> markModel = new DefaultComboBoxModel<>(landmarkDestinations);
            cmbDes.setModel(markModel);
        }
    }//GEN-LAST:event_cmbDesTypeActionPerformed

    private void btnGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGovActionPerformed

    private void btnBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyerActionPerformed

    private void btnContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractorActionPerformed
        dContractDes.setSize(735, 445);
        dContractDes.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dContractDes.setVisible(true);
    }//GEN-LAST:event_btnContractorActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backDrop;
    private javax.swing.JLabel backDropModes;
    private javax.swing.JLabel backdropBuild;
    private javax.swing.JLabel backdropDestination;
    private javax.swing.JButton btnBegin;
    private javax.swing.JButton btnBuyer;
    private javax.swing.JButton btnConfirmDestination;
    private javax.swing.JButton btnContractor;
    private javax.swing.JButton btnGov;
    private javax.swing.JComboBox<String> cmbBuildType;
    private javax.swing.JComboBox<String> cmbDes;
    private javax.swing.JComboBox<String> cmbDesType;
    private javax.swing.JDialog dContractBuild;
    private javax.swing.JDialog dContractDes;
    private javax.swing.JDialog dSimModes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBedrooms;
    private javax.swing.JLabel lblFloors;
    private javax.swing.JLabel lblParking;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBedrooms;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtFloors;
    private javax.swing.JTextField txtParking;
    // End of variables declaration//GEN-END:variables
}
