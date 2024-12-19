/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class UserDashboard extends javax.swing.JFrame {

    static String userId;

    /**
     * Creates new form UserDashboard
     */

    public UserDashboard() {
        initComponents();
        txt_userId.setText(Main.userId);
        userId = txt_userId.getText();

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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_viewCustomers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_addNewCars = new javax.swing.JButton();
        btn_viewCars = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_myProfile = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_rent = new javax.swing.JButton();
        btn_returnRent = new javax.swing.JButton();
        btn_rentalRecords = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_position = new javax.swing.JLabel();
        txt_userId = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Dashboard");
        setMinimumSize(new java.awt.Dimension(976, 570));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 36)); // NOI18N
        jLabel2.setText("Employee Dashboard");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(220, 356));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.LINE_START);

        jPanel6.setPreferredSize(new java.awt.Dimension(290, 10));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel7.setPreferredSize(new java.awt.Dimension(290, 10));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, java.awt.BorderLayout.LINE_END);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 14))); // NOI18N
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 190));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(10, 161));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel11.setPreferredSize(new java.awt.Dimension(10, 161));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, java.awt.BorderLayout.LINE_START);

        jPanel12.setPreferredSize(new java.awt.Dimension(260, 10));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(260, 10));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel1.setText("Customer");
        jPanel14.add(jLabel1);

        btn_add.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_add.setText("Add New Customer");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel14.add(btn_add);

        btn_viewCustomers.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_viewCustomers.setText("View Customers");
        btn_viewCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCustomersActionPerformed(evt);
            }
        });
        jPanel14.add(btn_viewCustomers);

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel3.setText("Cars");
        jPanel14.add(jLabel3);

        btn_addNewCars.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_addNewCars.setText("Add New Car");
        btn_addNewCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addNewCarsActionPerformed(evt);
            }
        });
        jPanel14.add(btn_addNewCars);

        btn_viewCars.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_viewCars.setText("View Cars");
        btn_viewCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewCarsActionPerformed(evt);
            }
        });
        jPanel14.add(btn_viewCars);

        jLabel4.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel4.setText("Manage My Profile");
        jPanel14.add(jLabel4);

        btn_myProfile.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_myProfile.setText("My Profile");
        btn_myProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_myProfileActionPerformed(evt);
            }
        });
        jPanel14.add(btn_myProfile);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel16);

        jPanel15.setLayout(new java.awt.GridLayout(0, 2));

        btn_logout.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel15.add(btn_logout);

        jPanel14.add(jPanel15);

        jPanel9.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel4.setPreferredSize(new java.awt.Dimension(220, 433));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 14))); // NOI18N
        jPanel17.setPreferredSize(new java.awt.Dimension(150, 190));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel18.setPreferredSize(new java.awt.Dimension(10, 161));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18, java.awt.BorderLayout.LINE_END);

        jPanel19.setPreferredSize(new java.awt.Dimension(10, 161));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel19, java.awt.BorderLayout.LINE_START);

        jPanel20.setPreferredSize(new java.awt.Dimension(260, 10));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setPreferredSize(new java.awt.Dimension(260, 10));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel21, java.awt.BorderLayout.PAGE_END);

        jPanel22.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel7.setText("Rental Services");
        jPanel22.add(jLabel7);

        btn_rent.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_rent.setText("Rent a Car");
        btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentActionPerformed(evt);
            }
        });
        jPanel22.add(btn_rent);

        btn_returnRent.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_returnRent.setText("Return Car(s)");
        btn_returnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnRentActionPerformed(evt);
            }
        });
        jPanel22.add(btn_returnRent);

        btn_rentalRecords.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_rentalRecords.setText("Rental Records");
        btn_rentalRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentalRecordsActionPerformed(evt);
            }
        });
        jPanel22.add(btn_rentalRecords);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel27);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel24);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel25);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel26);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23);

        jPanel17.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel17, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jLabel5.setFont(new java.awt.Font("Poor Story", 0, 18)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel3.add(jLabel5);

        txt_position.setFont(new java.awt.Font("Poor Story", 0, 18)); // NOI18N
        txt_position.setText("employee");
        jPanel3.add(txt_position);

        txt_userId.setFont(new java.awt.Font("Poor Story", 1, 18)); // NOI18N
        txt_userId.setText("001");
        jPanel3.add(txt_userId);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        AddCustomer addNew = new AddCustomer();
        desktop.add(addNew);
        addNew.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_viewCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewCustomersActionPerformed
        // TODO add your handling code here:
        ViewCustomers viewCust = new ViewCustomers();
        desktop.add(viewCust);
        viewCust.setVisible(true);
    }//GEN-LAST:event_btn_viewCustomersActionPerformed

    private void btn_addNewCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addNewCarsActionPerformed
        // TODO add your handling code here:
        AddCars addCars = new AddCars();
        desktop.add(addCars);
        addCars.setVisible(true);
    }//GEN-LAST:event_btn_addNewCarsActionPerformed

    private void btn_viewCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewCarsActionPerformed
        // TODO add your handling code here:
        ViewCars viewCars = new ViewCars();
        desktop.add(viewCars);
        viewCars.setVisible(true);
    }//GEN-LAST:event_btn_viewCarsActionPerformed

    private void btn_myProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myProfileActionPerformed
        // TODO add your handling code here:
        ViewMyProfile viewMyProfile = new ViewMyProfile();
        desktop.add(viewMyProfile);
        viewMyProfile.setVisible(true);
    }//GEN-LAST:event_btn_myProfileActionPerformed

    private void btn_rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentActionPerformed
        // TODO add your handling code here:
        Rent rent = new Rent();
        desktop.add(rent);
        rent.setVisible(true);
    }//GEN-LAST:event_btn_rentActionPerformed

    private void btn_returnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnRentActionPerformed
        // TODO add your handling code here:
        ReturnRent returnRent = new ReturnRent();
        desktop.add(returnRent);
        returnRent.setVisible(true);
    }//GEN-LAST:event_btn_returnRentActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Are your sure you want to Exit the System?");
        if (response == JOptionPane.YES_OPTION) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
                String query = "SELECT `password`  FROM `admin` WHERE `password`=?";
                PreparedStatement pst = con.prepareStatement(query);
                try {
                    pst.setString(1, JOptionPane.showInputDialog(this, "Enter admin password:"));

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        System.exit(0);
                    } else {
                        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                        JOptionPane.showMessageDialog(null, "Incorrect Password");
                    }

                    con.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btn_rentalRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentalRecordsActionPerformed
        // TODO add your handling code here:
        RentalRecords rentalRecords = new RentalRecords();
        desktop.add(rentalRecords);
        rentalRecords.setVisible(true);
    }//GEN-LAST:event_btn_rentalRecordsActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to Logout?");
        if (response == JOptionPane.YES_OPTION) {
            new Main().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

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

            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addNewCars;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_myProfile;
    private javax.swing.JButton btn_rent;
    private javax.swing.JButton btn_rentalRecords;
    private javax.swing.JButton btn_returnRent;
    private javax.swing.JButton btn_viewCars;
    private javax.swing.JButton btn_viewCustomers;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel txt_position;
    public static javax.swing.JLabel txt_userId;
    // End of variables declaration//GEN-END:variables
}