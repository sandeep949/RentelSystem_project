/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class AdminLogin extends javax.swing.JFrame {

    static String userId;

    /**
     * Creates new form AdminLoginForm
     */
    public AdminLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_username1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_password1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        login_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin Login");
        setMaximumSize(new java.awt.Dimension(442, 323));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(442, 323));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Login");
        jLabel1.setPreferredSize(new java.awt.Dimension(152, 40));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("Rem. only admins allowed!");
        jLabel2.setPreferredSize(new java.awt.Dimension(161, 40));
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setPreferredSize(new java.awt.Dimension(10, 355));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, java.awt.BorderLayout.LINE_START);

        jPanel11.setPreferredSize(new java.awt.Dimension(10, 355));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel11, java.awt.BorderLayout.LINE_END);

        jPanel12.setPreferredSize(new java.awt.Dimension(345, 10));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setPreferredSize(new java.awt.Dimension(345, 10));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel14.setLayout(new java.awt.GridLayout(0, 1));

        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel6.setText("Username:");
        jPanel14.add(jLabel6);

        txt_username1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel14.add(txt_username1);

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        jLabel7.setText("Password:");
        jPanel14.add(jLabel7);

        txt_password1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel14.add(txt_password1);
        jPanel14.add(jLabel8);

        login_btn1.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        login_btn1.setText("Login");
        login_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btn1ActionPerformed(evt);
            }
        });
        jPanel14.add(login_btn1);

        jPanel9.add(jPanel14, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel9, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btn1ActionPerformed
        // TODO add your handling code here:

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            String query = "SELECT `emp_id`, `username`, `password`  FROM `admin` WHERE `username`=? and `password`=?";
            PreparedStatement pst = con.prepareStatement(query);
            try {
                pst.setString(1, txt_username1.getText());
                pst.setString(2, txt_password1.getText());

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    AdminLogin.userId = rs.getString(1);
                    System.out.println(userId + "\nOops\n" + rs.getString(1));

                    JOptionPane.showMessageDialog(this, "Login Successfull");
                    this.dispose();
                    new AdminDashboard().setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                    //new Main().setVisible(true);
                }

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_login_btn1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        new Main().setVisible(true);


    }//GEN-LAST:event_formWindowClosing

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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton login_btn1;
    private javax.swing.JPasswordField txt_password1;
    private javax.swing.JTextField txt_username1;
    // End of variables declaration//GEN-END:variables
}
