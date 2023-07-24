/*
 * 
 * 
 * modified     20230724
 * date         20220720
 * @filename    SimEstate.java
 * @author      curtiswong
 * @version     1.0.4 
 * @see         N/A
 */

package com.mycompany.simestate;
import java.awt.Dialog;
import java.util.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author user
 */
public class SimEstate extends javax.swing.JFrame {
    
    private Map<Place, List<Road>> adjacencyList;
    static ArrayList<ResidentialBuilding> residentialBuildings = new ArrayList<>();
    static ArrayList<Place> places = new ArrayList<>();
    static ArrayList<Road> roads = new ArrayList<>();
    
    DefaultComboBoxModel landmarkOptions;
    String contractAddress;
    int contractDistance;
    Place contractStart;
    
    String govAddress;
    int govDistance;
    Place govStart;
    String govName;
    
    public SimEstate() {
        initComponents();
        
        // run right before screen or dialog open
        chkCOne.setVisible(false);
        chkCTwo.setVisible(false);
        chkCThree.setVisible(false);
        cmbFieldFive.setVisible(false);
        
        places.add(new CommunityCentre("12 Ach Pal", "CC-01", "Hard Point Centre", 9, 4, true, true, false)); // preset starter landmarks
        residentialBuildings.add(new House("17 Hoover", "HH-01", 100.0, 2, 2, 0.0, 3, 2, 300.0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dSimModes = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnGov = new javax.swing.JButton();
        btnBuyer = new javax.swing.JButton();
        btnContractor = new javax.swing.JButton();
        backDropModes = new javax.swing.JLabel();
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
        chkCTwo = new javax.swing.JCheckBox();
        chkCOne = new javax.swing.JCheckBox();
        chkCThree = new javax.swing.JCheckBox();
        lblConfig = new javax.swing.JLabel();
        btnCBuild = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cBuildFeedback = new javax.swing.JTextArea();
        backdropCBuild = new javax.swing.JLabel();
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
        lblFieldOne = new javax.swing.JLabel();
        cmbFieldOne = new javax.swing.JComboBox<>();
        lblFieldTwo = new javax.swing.JLabel();
        cmbFieldTwo = new javax.swing.JComboBox<>();
        lblFieldThree = new javax.swing.JLabel();
        txtFieldThree = new javax.swing.JTextField();
        lblFieldFive = new javax.swing.JLabel();
        cmbFieldFive = new javax.swing.JComboBox<>();
        lblFieldFour = new javax.swing.JLabel();
        cmbFieldFour = new javax.swing.JComboBox<>();
        btnGBuild = new javax.swing.JButton();
        chkGOne = new javax.swing.JCheckBox();
        chkGTwo = new javax.swing.JCheckBox();
        chkGThree = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        gBuildFeedback = new javax.swing.JTextArea();
        backdropGBuild = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBegin = new javax.swing.JButton();
        backDrop = new javax.swing.JLabel();

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
        cDesFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
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

        chkCTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCTwo.setForeground(new java.awt.Color(51, 51, 51));
        chkCTwo.setText("Gym");
        jPanel3.add(chkCTwo);
        chkCTwo.setBounds(530, 313, 80, 22);

        chkCOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCOne.setForeground(new java.awt.Color(51, 51, 51));
        chkCOne.setText("Pool");
        jPanel3.add(chkCOne);
        chkCOne.setBounds(460, 313, 80, 22);

        chkCThree.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkCThree.setForeground(new java.awt.Color(51, 51, 51));
        chkCThree.setText("Tennis");
        jPanel3.add(chkCThree);
        chkCThree.setBounds(620, 313, 90, 22);

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
        cBuildFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
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
        gDesFeedback.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        gDesFeedback.setLineWrap(true);
        gDesFeedback.setRows(5);
        gDesFeedback.setBorder(null);
        gDesFeedback.setOpaque(false);
        jScrollPane3.setViewportView(gDesFeedback);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 320, 40);

        backdropGDes.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
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
        cmbGBuildType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School", "Store", "Mall", "Hospital", "Emergency Services", "Community Centre", "Park", "Disposal Centre", "Bus Stop", "Subway" }));
        cmbGBuildType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGBuildTypeActionPerformed(evt);
            }
        });
        jPanel6.add(cmbGBuildType);
        cmbGBuildType.setBounds(550, 155, 115, 25);

        lblFieldOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldOne.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldOne.setText("Ranking:");
        jPanel6.add(lblFieldOne);
        lblFieldOne.setBounds(460, 205, 90, 20);

        cmbFieldOne.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+10", "+20", "+50", "+100" }));
        jPanel6.add(cmbFieldOne);
        cmbFieldOne.setBounds(560, 204, 115, 24);

        lblFieldTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldTwo.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldTwo.setText("Private:");
        jPanel6.add(lblFieldTwo);
        lblFieldTwo.setBounds(460, 230, 90, 20);

        cmbFieldTwo.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jPanel6.add(cmbFieldTwo);
        cmbFieldTwo.setBounds(560, 230, 115, 24);

        lblFieldThree.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldThree.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldThree.setText("Tuition:");
        jPanel6.add(lblFieldThree);
        lblFieldThree.setBounds(460, 260, 90, 20);
        jPanel6.add(txtFieldThree);
        txtFieldThree.setBounds(560, 260, 115, 22);

        lblFieldFive.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblFieldFive.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldFive.setText("Special Programs:");
        jPanel6.add(lblFieldFive);
        lblFieldFive.setBounds(450, 350, 100, 20);

        cmbFieldFive.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        jPanel6.add(cmbFieldFive);
        cmbFieldFive.setBounds(560, 350, 115, 24);

        lblFieldFour.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFieldFour.setForeground(new java.awt.Color(51, 51, 51));
        lblFieldFour.setText("Grade Level:");
        jPanel6.add(lblFieldFour);
        lblFieldFour.setBounds(460, 290, 90, 20);

        cmbFieldFour.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 13)); // NOI18N
        cmbFieldFour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pre School", "Elementary", "Secondary", "Post-Secondary" }));
        jPanel6.add(cmbFieldFour);
        cmbFieldFour.setBounds(560, 290, 115, 24);

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

        chkGOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkGOne.setForeground(new java.awt.Color(51, 51, 51));
        chkGOne.setText("IB");
        jPanel6.add(chkGOne);
        chkGOne.setBounds(450, 380, 80, 22);

        chkGTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkGTwo.setForeground(new java.awt.Color(51, 51, 51));
        chkGTwo.setText("Gifted");
        jPanel6.add(chkGTwo);
        chkGTwo.setBounds(520, 380, 80, 22);

        chkGThree.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        chkGThree.setForeground(new java.awt.Color(51, 51, 51));
        chkGThree.setText("French");
        jPanel6.add(chkGThree);
        chkGThree.setBounds(610, 380, 80, 22);

        gBuildFeedback.setEditable(false);
        gBuildFeedback.setColumns(20);
        gBuildFeedback.setLineWrap(true);
        gBuildFeedback.setRows(5);
        gBuildFeedback.setBorder(null);
        gBuildFeedback.setOpaque(false);
        jScrollPane4.setViewportView(gBuildFeedback);

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
        if((txtCAddress.getText().toLowerCase()).contains("st") || (txtCAddress.getText().toLowerCase()).contains("ave") || (txtCAddress.getText().toLowerCase()).contains("rd") || (txtCAddress.getText().toLowerCase()).contains("ln") || (txtCAddress.getText().toLowerCase()).contains("blvd") || (txtCAddress.getText().toLowerCase()).contains("dr")) {
            if(addressSearch(txtCAddress.getText(), residentialBuildings) != null) {
                cDesFeedback.setText("Address has already been taken");
                return;
            }
            contractAddress = txtCAddress.getText();
            
            try {
                Integer.valueOf(txtCDistance.getText());
                if(Integer.valueOf(txtCDistance.getText()) > 0) {
                    contractDistance = Integer.valueOf(txtCDistance.getText());
                    contractStart = String.valueOf(cmbCDesType.getSelectedItem()).equals("Residential") ? addressSearch(String.valueOf(cmbCDes.getSelectedItem()), residentialBuildings): nameSearch(String.valueOf(cmbCDes.getSelectedItem()), places);
                    if(contractStart != null) {
                        screenRoute(dContractBuild);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                cDesFeedback.setText("Distance must be a Postiive Number");
            }

        } else {
            cDesFeedback.setText("Make sure to include a proper short form address suffix (St, Ave, Rd, Ln, Blvd, Dr)");
        }   
    }//GEN-LAST:event_btnCDesActionPerformed

    private void cmbCDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCDesTypeActionPerformed
        cmbCDes.setModel(desModel(cmbCDesType));
    }//GEN-LAST:event_cmbCDesTypeActionPerformed

    private void btnGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGovActionPerformed
        screenRoute(dGovDes);
        cmbGDes.setModel(desModel(cmbGDesType));
    }//GEN-LAST:event_btnGovActionPerformed

    private void btnBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyerActionPerformed

    private void btnContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContractorActionPerformed
        screenRoute(dContractDes);
        cmbCDes.setModel(desModel(cmbCDesType));
    }//GEN-LAST:event_btnContractorActionPerformed

    private void cmbCBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCBuildTypeActionPerformed
        chkCOne.setVisible(false);
        chkCTwo.setVisible(false);
        chkCThree.setVisible(false);
        
        if(cmbCBuildType.getSelectedItem().equals("House")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);
        } 
        else if (cmbCBuildType.getSelectedItem().equals("Townhouse")) {
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseConfig.png")));
            cmbCParking.setVisible(true);
            
        } else {
            chkCOne.setVisible(true);
            chkCOne.setText("Pool");
            chkCTwo.setVisible(true);
            chkCTwo.setText("Gym");
            chkCThree.setVisible(true);
            chkCThree.setText("Tennis Court");
            
            lblConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartmentConfig.png")));          
        }
    }//GEN-LAST:event_cmbCBuildTypeActionPerformed

    private void btnCBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCBuildActionPerformed
        try {
            double yardArea = Double.valueOf(String.valueOf(txtCYardArea.getText()));
            int numBathrooms = comboExtract(cmbCBathrooms);
            int numBedrooms = comboExtract(cmbCBedrooms);
            double price = 0.0;
            int parkingSpaces = comboExtract(cmbCParking);
            int numFloors = comboExtract(cmbCFloors);
            double area = Double.valueOf(String.valueOf(txtCArea.getText()));
            
            if(yardArea <= 0 || area <= 0) {
                cBuildFeedback.setText("Area must exceed 0");
                return;
            }
            
            if(cmbCBuildType.getSelectedItem().equals("House")) {
                House house = new House(contractAddress, "HH-" + nextID("HH", residentialBuildings), yardArea, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, area);
                residentialBuildings.add(house);
                roads.add(new Road(contractStart, house, contractDistance));
            } 
            else if (cmbCBuildType.getSelectedItem().equals("Townhouse")) {         
                Townhouse townHouse = new Townhouse(contractAddress, "TH-" + nextID("TH", residentialBuildings), numBathrooms, numBedrooms, 0, price, parkingSpaces, numFloors, area, yardArea);
                residentialBuildings.add(townHouse);
                roads.add(new Road(contractStart, townHouse, contractDistance));

            } else {
                int unitsbyFloor = Integer.valueOf(txtCYardArea.getText());
                Apartment apartment = new Apartment(contractAddress, "AB-" + nextID("AB", residentialBuildings), numBathrooms, numBedrooms, unitsbyFloor, price, parkingSpaces, numFloors, area, chkCOne.isSelected(), chkCTwo.isSelected(), chkCThree.isSelected());
                residentialBuildings.add(apartment);
                roads.add(new Road(contractStart, apartment, contractDistance));
            }

            System.out.println(residentialBuildings.get(residentialBuildings.size()-1).getId() + " " + roads.get(roads.size()-1).toString());
        
        } catch (NumberFormatException e) {
            System.out.println(e);
            cBuildFeedback.setText("Area Input malformed, please retry");
        }
        
    }//GEN-LAST:event_btnCBuildActionPerformed

    private void cmbGDesTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGDesTypeActionPerformed
        cmbGDes.setModel(desModel(cmbGDesType));
    }//GEN-LAST:event_cmbGDesTypeActionPerformed

    private void btnGDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDesActionPerformed
        if((txtGAddress.getText().toLowerCase()).contains("st") || (txtGAddress.getText().toLowerCase()).contains("ave") || (txtGAddress.getText().toLowerCase()).contains("rd") || (txtGAddress.getText().toLowerCase()).contains("ln") || (txtGAddress.getText().toLowerCase()).contains("blvd") || (txtGAddress.getText().toLowerCase()).contains("dr")) {
            govAddress = txtGAddress.getText();
            
            try {
                Integer.valueOf(txtGDistance.getText());
                if(Integer.valueOf(txtGDistance.getText()) > 0) {
                    govDistance = Integer.valueOf(txtGDistance.getText());
                    govStart = String.valueOf(cmbGDesType.getSelectedItem()).equals("Residential") ? addressSearch(String.valueOf(cmbGDes.getSelectedItem()), residentialBuildings): nameSearch(String.valueOf(cmbGDes.getSelectedItem()), places);
                    
                    if(!txtGName.getText().isEmpty() || nameSearch(txtGName.getText(), places) != null) {
                        screenRoute(dGovBuild);
                    } else {
                        gDesFeedback.setText("Invalid Name, Taken or Empty");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
                gDesFeedback.setText("Distance must be a Postiive Number");
            } 

        } else {
            gDesFeedback.setText("Make sure to include a proper short form address suffix (St, Ave, Rd, Ln, Blvd, Dr)");
        }
    }//GEN-LAST:event_btnGDesActionPerformed

    private void btnGBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGBuildActionPerformed
        String type = String.valueOf(cmbGBuildType.getSelectedItem());
        Place landmark;
        
        try {
            if(txtFieldThree.getText().isEmpty()) {
                gBuildFeedback.setText("Fill out all Fields");
                return;
            }
            
            landmark = type.equals("School") ? new School(govAddress, "SS-" + nextID("SS", places), govName, Integer.valueOf((String.valueOf(cmbFieldOne.getSelectedItem())).substring(1)), Boolean.parseBoolean(String.valueOf(cmbFieldTwo.getSelectedItem())), Integer.valueOf(String.valueOf(txtFieldThree.getText())), String.valueOf(cmbFieldFour.getSelectedItem()), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected()) 
                    : type.equals("Store") ? new GroceryStore(govAddress, "GS-" + nextID("GS", places), govName, comboExtract(cmbFieldTwo), Integer.valueOf(String.valueOf(txtFieldThree.getText())), comboExtract(cmbFieldFour), Boolean.parseBoolean(String.valueOf(cmbFieldFive.getSelectedItem())), Boolean.parseBoolean(String.valueOf(cmbFieldFive.getSelectedItem())))
                    : type.equals("Mall") ? new Mall(govAddress, "ML-" + nextID("ML", places), govName, comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), Integer.valueOf(txtFieldThree.getText()), Boolean.parseBoolean(String.valueOf(cmbFieldFour.getSelectedItem())), Boolean.parseBoolean(String.valueOf(cmbFieldFive)))
                    : type.equals("Hospital") ? new Hospital(govAddress, "HP-" + nextID("HP", places), comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), govName, Integer.valueOf(String.valueOf(txtFieldThree.getText())))
                    : type.equals("Emergency Service") ? new EmergencyServiceStation(govAddress, "ES-" + nextID("ES", places), govName, Integer.valueOf(String.valueOf(cmbFieldOne.getSelectedItem())), comboExtract(cmbFieldTwo), String.valueOf(cmbFieldFour.getSelectedItem()))
                    : type.equals("Community Centre") ? new CommunityCentre(govAddress, "CC-" + nextID("CC", places), govName, comboExtract(cmbFieldOne), comboExtract(cmbFieldTwo), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected())
                    : type.equals("Park") ? new Park(govAddress, "PK-" + nextID("PK", places), govName, Double.valueOf(String.valueOf(txtFieldThree.getText())), comboExtract(cmbFieldOne), chkGOne.isSelected(), chkGTwo.isSelected(), chkGThree.isSelected())
                    : type.equals("Disposal Centre") ? new GarbageDisposal(govAddress, "GD-" + nextID("GD", places), govName, comboExtract(cmbFieldOne)) 
                    : type.equals("Bus Stop") ? new BusStop(govAddress, "BS-" + nextID("BS", places), govName, comboExtract(cmbFieldOne))
                    : new SubwayStation(govAddress, "SW-" + nextID("SW", places), govName, comboExtract(cmbFieldOne));

            places.add(landmark);
            roads.add(new Road(govStart, landmark, govDistance));
            System.out.println(places.get(places.size()-1).getId() + " " + roads.get(roads.size()-1).toString());
        } catch (NumberFormatException e) {
            System.out.println(e);
            gBuildFeedback.setText("Input malformed, Numbers only");
        } 
    }//GEN-LAST:event_btnGBuildActionPerformed

    private void cmbGBuildTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGBuildTypeActionPerformed
        cmbFieldFour.setVisible(false);
        cmbFieldFive.setVisible(false);
        chkGOne.setVisible(false);
        chkGTwo.setVisible(false);
        chkGThree.setVisible(false);
        
        if(cmbGBuildType.getSelectedItem().equals("School")) {
            cmbFieldFour.setVisible(true);
            govConfig("Ranking:", "Private:", "Tuition:", "Grade Level", "Special Programs:", new String[]{"+10", "+20", "+50", "+100"}, new String[]{"true", "false"}, new String[] {"Pre School", "Elementary", "Secondary", "Post-Secondary"}, new String[]{"IB", "AP", "Gifted", "French Immersion"});
            
            ameninitySet("iB", "Gifted", "French");
        }
        else if(cmbGBuildType.getSelectedItem().equals("Store")) {
            cmbFieldFour.setVisible(true);
            cmbFieldFive.setVisible(true);
            govConfig("Floors", "Affordability", "Capacity", "Pharmacy", "Bakery", new String[] {"1", "2", "3"}, new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {"true", "false"}, new String[] {"true", "false"});
        } 
        else if(cmbGBuildType.getSelectedItem().equals("Mall")) {
            cmbFieldFour.setVisible(true);
            cmbFieldFive.setVisible(true);
            govConfig("Floors", "Capacity", "Stores", "Cinema", "Food Court", new String[] {"1", "2", "3"}, new String[] {"300", "200", "100", "50", "20"}, new String[] {"true", "false"}, new String[] {"true", "false"});
        } 
        else if(cmbGBuildType.getSelectedItem().equals("Hospital")) {
            govConfig("Sustainability", "Floors", "Capacity", "", "", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {"1", "3", "10", "20"}, new String[] {}, new String[] {});
        }
        else if(cmbGBuildType.getSelectedItem().equals("Emergency Services")) {
            cmbFieldFour.setVisible(true);
            govConfig("Sustainability", "Floors", "", "Service Type", "", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {"1", "3", "10", "20"}, new String[] {"Police", "Fire"}, new String[] {});
        }
        else if(cmbGBuildType.getSelectedItem().equals("Community Centre")) {
            govConfig("Sustainability", "Floors", "", "", "Ammenities", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {"1", "2", "3", "4"}, new String[] {}, new String[] {});
            
            ameninitySet("Pool", "Gym", "Rink");
        }
        else if(cmbGBuildType.getSelectedItem().equals("Park")) {
            govConfig("Clean Rating", "", "Area", "", "Ammenities", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {}, new String[] {}, new String[] {});
            
            ameninitySet("Baseball", "Soccer", "Splash Pad");
        }
        else if(cmbGBuildType.getSelectedItem().equals("Disposal Centre")) {
            govConfig("Pollution", "", "", "", "", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {}, new String[] {}, new String[] {}); 
        }
        else {
            govConfig("Busyness", "", "", "", "", new String[] {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"}, new String[] {}, new String[] {}, new String[] {});
        }
        
    }//GEN-LAST:event_cmbGBuildTypeActionPerformed

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
            ArrayList<String> resList = new ArrayList<String>();
            for(int i = 0; i < residentialBuildings.size(); i++) {
                resList.add(residentialBuildings.get(i).getAddress());
            }

            DefaultComboBoxModel resModel = new DefaultComboBoxModel<>(resList.toArray((String[]::new)));

            return resModel;
        } else {
            ArrayList<String> markList = new ArrayList<String>();
            for(int i = 0; i < places.size(); i++) {
                markList.add(places.get(i).getName());
            }

            DefaultComboBoxModel markModel = new DefaultComboBoxModel<>(markList.toArray((String[]::new)));

            return markModel;
        }
    }
    
    public void govConfig(String one, String two, String three, String four, String five, 
            String[] modelOne, String[] modelTwo, String[] modelFour, String[] modelFive) {
        lblFieldOne.setText(one);
        cmbFieldOne.setModel(new DefaultComboBoxModel<>(modelOne));
        
        lblFieldTwo.setText(two);
        cmbFieldTwo.setModel(new DefaultComboBoxModel<>(modelTwo));
        
        lblFieldThree.setText(three);
        
        lblFieldFour.setText(four);
        cmbFieldFour.setModel(new DefaultComboBoxModel<>(modelFour));
        
        lblFieldFive.setText(five);
        cmbFieldFive.setModel(new DefaultComboBoxModel<>(modelFive));
    }
    
    public void ameninitySet(String first, String second, String third) {
        chkGOne.setVisible(true);
        chkGOne.setText(first);
        chkGTwo.setVisible(true);
        chkGTwo.setText(second);
        chkGThree.setVisible(true);
        chkGThree.setText(third);
    }
    
    public int comboExtract(javax.swing.JComboBox combo) {
        return Integer.valueOf(String.valueOf(combo.getSelectedItem()));
    }
    
    public Place nameSearch(String name, ArrayList<Place> places) {
        for(int i = 0; i < places.size(); i++) {
            if(places.get(i).getName().equals(name)) {
                return places.get(i);
            }
        }
        
        return null;
    }
    
    public Place addressSearch(String address, ArrayList<ResidentialBuilding> residences) {
        for(int i = 0; i < residences.size(); i++) {
            if(residences.get(i).getAddress().equals(address)) {
                return residences.get(i);
            }
        }
        
        return null;
    }
    
    public String nextID(String placeCode, ArrayList<? extends Place> list) {
        String lastID = "";
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().substring(0, 2).equals(placeCode)) {
                lastID = (list.get(i).getId()).substring(3);
            }
        }

        if(!lastID.isEmpty()&& lastID != null) {
            if(Character.getNumericValue(lastID.charAt(0)) == 0) {
                String numId = Integer.valueOf(lastID.charAt(1)) != 9 ?  "0" + (Character.getNumericValue(lastID.charAt(1)) + 1) : "10";
                return numId;
            } else {
                return String.valueOf((Integer.valueOf(lastID)) + 1);
            }
        } else {
            return "01";
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
    private javax.swing.JTextArea cDesFeedback;
    private javax.swing.JCheckBox chkCOne;
    private javax.swing.JCheckBox chkCThree;
    private javax.swing.JCheckBox chkCTwo;
    private javax.swing.JCheckBox chkGOne;
    private javax.swing.JCheckBox chkGThree;
    private javax.swing.JCheckBox chkGTwo;
    private javax.swing.JComboBox<String> cmbCBathrooms;
    private javax.swing.JComboBox<String> cmbCBedrooms;
    private javax.swing.JComboBox<String> cmbCBuildType;
    private javax.swing.JComboBox<String> cmbCDes;
    private javax.swing.JComboBox<String> cmbCDesType;
    private javax.swing.JComboBox<String> cmbCFloors;
    private javax.swing.JComboBox<String> cmbCParking;
    private javax.swing.JComboBox<String> cmbFieldFive;
    private javax.swing.JComboBox<String> cmbFieldFour;
    private javax.swing.JComboBox<String> cmbFieldOne;
    private javax.swing.JComboBox<String> cmbFieldTwo;
    private javax.swing.JComboBox<String> cmbGBuildType;
    private javax.swing.JComboBox<String> cmbGDes;
    private javax.swing.JComboBox<String> cmbGDesType;
    private javax.swing.JDialog dContractBuild;
    private javax.swing.JDialog dContractDes;
    private javax.swing.JDialog dGovBuild;
    private javax.swing.JDialog dGovDes;
    private javax.swing.JDialog dSimModes;
    private javax.swing.JTextArea gBuildFeedback;
    private javax.swing.JTextArea gDesFeedback;
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
    private javax.swing.JLabel lblFieldFive;
    private javax.swing.JLabel lblFieldFour;
    private javax.swing.JLabel lblFieldOne;
    private javax.swing.JLabel lblFieldThree;
    private javax.swing.JLabel lblFieldTwo;
    private javax.swing.JTextField txtCAddress;
    private javax.swing.JTextField txtCArea;
    private javax.swing.JTextField txtCDistance;
    private javax.swing.JTextField txtCYardArea;
    private javax.swing.JTextField txtFieldThree;
    private javax.swing.JTextField txtGAddress;
    private javax.swing.JTextField txtGDistance;
    private javax.swing.JTextField txtGName;
    // End of variables declaration//GEN-END:variables
}
