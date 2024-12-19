/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package carsrentalmanagementsystem;

/**
 *
 * @author User
 */
public class ManageCars extends javax.swing.JInternalFrame {

    /**
     * Creates new form ManageCars
     */
    public ManageCars() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_custId = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        btn_viewbyId = new javax.swing.JButton();
        btn_viewAll = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        txt_carId = new javax.swing.JTextField();
        txt_carId10 = new javax.swing.JTextField();
        txt_carId1 = new javax.swing.JTextField();
        txt_carId8 = new javax.swing.JTextField();
        txt_carId2 = new javax.swing.JTextField();
        txt_carId9 = new javax.swing.JTextField();
        txt_carId3 = new javax.swing.JTextField();
        txt_carId4 = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_car = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manage Cars");
        setMinimumSize(new java.awt.Dimension(974, 611));
        setPreferredSize(new java.awt.Dimension(974, 611));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel1.setText("Manage Cars");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 331));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Manage Cars");
        jPanel3.add(jLabel3);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(10, 331));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel5.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        jPanel6.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Car by Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 80));

        jPanel10.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        jPanel11.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        jLabel2.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Car Id:");
        jPanel11.add(jLabel2);

        txt_custId.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        txt_custId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_custId.setToolTipText("");
        txt_custId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_custIdActionPerformed(evt);
            }
        });
        txt_custId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_custIdKeyReleased(evt);
            }
        });
        jPanel11.add(txt_custId);

        jPanel10.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        btn_viewbyId.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_viewbyId.setText("View by Id");
        btn_viewbyId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewbyIdActionPerformed(evt);
            }
        });
        jPanel12.add(btn_viewbyId);

        btn_viewAll.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_viewAll.setText("View All");
        btn_viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewAllActionPerformed(evt);
            }
        });
        jPanel12.add(btn_viewAll);

        jPanel10.add(jPanel12);

        jPanel7.add(jPanel10);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setPreferredSize(new java.awt.Dimension(5, 231));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel9.setPreferredSize(new java.awt.Dimension(5, 231));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9, java.awt.BorderLayout.LINE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(456, 50));
        jPanel13.setLayout(new java.awt.GridLayout(0, 4, 10, 0));

        jButton1.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jButton1.setText("Add Car");
        jPanel13.add(jButton1);

        jButton2.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jButton2.setText("Remove");
        jPanel13.add(jButton2);

        jButton3.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3);

        jButton4.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton4);

        jPanel6.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        txt_carId.setEditable(false);
        txt_carId.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Car Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId);

        txt_carId10.setEditable(false);
        txt_carId10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "is Car Present?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId10);

        txt_carId1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Car Brand", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId1);

        txt_carId8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Car Make", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId8);

        txt_carId2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Car Color", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId2);

        txt_carId9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Passengers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId9);

        txt_carId3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date Added", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId3);

        txt_carId4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txt_carId4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_carId4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rental Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel14.add(txt_carId4);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel20);

        jPanel6.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6);

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17, java.awt.BorderLayout.LINE_END);

        jPanel18.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18, java.awt.BorderLayout.PAGE_END);

        jPanel19.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel19, java.awt.BorderLayout.LINE_START);

        tbl_car.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_car.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Id", "Brand", "Make", "Color", "Passengers", "Date Added", "Rental Price", "isPresent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_car);

        jPanel15.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel15);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_custIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_custIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_custIdActionPerformed

    private void txt_custIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_custIdKeyReleased
        // TODO add your handling code here:
        getCarRecordsById();
    }//GEN-LAST:event_txt_custIdKeyReleased

    private void btn_viewbyIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewbyIdActionPerformed
        // TODO add your handling code here:
        getCarRecordsById();
    }//GEN-LAST:event_btn_viewbyIdActionPerformed

    private void btn_viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewAllActionPerformed
        // TODO add your handling code here:
        getAllCarRecords();
    }//GEN-LAST:event_btn_viewAllActionPerformed

    void getCarRecordsById() {
    }

    void getAllCarRecords() {
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_viewAll;
    private javax.swing.JButton btn_viewbyId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_car;
    private javax.swing.JTextField txt_carId;
    private javax.swing.JTextField txt_carId1;
    private javax.swing.JTextField txt_carId10;
    private javax.swing.JTextField txt_carId2;
    private javax.swing.JTextField txt_carId3;
    private javax.swing.JTextField txt_carId4;
    private javax.swing.JTextField txt_carId8;
    private javax.swing.JTextField txt_carId9;
    private javax.swing.JTextField txt_custId;
    // End of variables declaration//GEN-END:variables
}
