/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class RentalRecords extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String query;

    DefaultTableModel model;

    /**
     * Creates new form RentalRecords
     */
    public RentalRecords() {
        initComponents();
        model = (DefaultTableModel) tbl_cust.getModel();
        getAllCustRecords();

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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_custId = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btn_viewbyId = new javax.swing.JButton();
        btn_viewAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cust = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Rental Records");
        setMinimumSize(new java.awt.Dimension(929, 503));
        setPreferredSize(new java.awt.Dimension(929, 503));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanel1.setPreferredSize(new java.awt.Dimension(10, 324));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel1.setText("Rental Records");
        jPanel5.add(jLabel1);

        jPanel2.add(jPanel5);

        jPanel7.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        jPanel6.setLayout(new java.awt.GridLayout(0, 3, 10, 0));
        jPanel6.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cutomer Id:");
        jPanel6.add(jLabel2);

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
        jPanel6.add(txt_custId);

        jPanel7.add(jPanel6);

        jPanel8.setLayout(new java.awt.GridLayout(0, 4, 10, 0));

        btn_viewbyId.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_viewbyId.setText("View by Id");
        btn_viewbyId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewbyIdActionPerformed(evt);
            }
        });
        jPanel8.add(btn_viewbyId);

        btn_viewAll.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_viewAll.setText("View All");
        btn_viewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewAllActionPerformed(evt);
            }
        });
        jPanel8.add(btn_viewAll);

        jPanel7.add(jPanel8);

        jPanel2.add(jPanel7);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(10, 324));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_START);

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Customers Rental Records");
        jPanel4.add(jLabel4);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        tbl_cust.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_cust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rental Id", "Customer Id", "Car Id", "Car Name", "Date of Rent", "Expected Return Date", "Return Date", "isReturned", "Overdue", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_cust);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewAllActionPerformed
        // TODO add your handling code here:
        getAllCustRecords();

    }//GEN-LAST:event_btn_viewAllActionPerformed

    private void txt_custIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_custIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_custIdActionPerformed

    private void btn_viewbyIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewbyIdActionPerformed
        // TODO add your handling code here:
        getCustRecordsById();
    }//GEN-LAST:event_btn_viewbyIdActionPerformed

    private void txt_custIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_custIdKeyReleased
        // TODO add your handling code here:
        getCustRecordsById();
    }//GEN-LAST:event_txt_custIdKeyReleased

    void getAllCustRecords() {

        query = "SELECT * FROM `rentals`";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);

            rs = pst.executeQuery();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);

        }
    }

    void getCustRecordsById() {

        query = "SELECT * FROM `rentals` WHERE `cust_id`=?";
        String id = txt_custId.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "Please input first the customer Id");
        } else {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
                pst = con.prepareStatement(query);
                pst.setString(1, txt_custId.getText());

                rs = pst.executeQuery();
                model.setRowCount(0);

                while (rs.next()) {
                    model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_viewAll;
    private javax.swing.JButton btn_viewbyId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_cust;
    private javax.swing.JTextField txt_custId;
    // End of variables declaration//GEN-END:variables
}
