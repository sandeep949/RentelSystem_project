/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package carsrentalmanagementsystem;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.print.PrinterException;
import java.io.EOFException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Rent extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    String query;

    ArrayList<String> cars = new ArrayList<>();
    ArrayList<String> carsId = new ArrayList<>();
    ArrayList<String> rentalPrices = new ArrayList<>();
    ArrayList<String> returnDates = new ArrayList<>();
    ArrayList<String> durations = new ArrayList<>();
    ArrayList<String> totalRentalPrices = new ArrayList<>();

    double ttlRentalPrice = 0.0;
    double grandTotals = 0.0;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date;

    String rentDate;
    String returnDate;

    /**
     * Creates new form Rent
     */
    public Rent() {
        initComponents();

        txt_startDate.setText(new CarRentals().setDate());

        genCustomers();
        genCars();

    }

    void genDuration() {
        //txt_duration.setText(Integer.toString(10));
    }

    void genTotalPrice() {
        double rentalPrice = Double.parseDouble(txt_rentalPrice.getText());
        double duration = Double.parseDouble(txt_duration.getText());
        double totalRentalPrice = rentalPrice * duration;

        txt_totalRentalPrice.setText(Double.toString(totalRentalPrice));
    }

    void genCustomers() {
        query = "SELECT `cust_id` FROM `customer`";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                cmb_custId.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    void findCustomer(int id) {
        query = "SELECT `name`, `gender`, `phone`, `email`, `address` FROM `customer` WHERE `cust_id`=?";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, Integer.toString(id));

            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbl_customer.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    void genCars() {
        query = "SELECT `car_id` FROM `car` WHERE  `isPresent`=1";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
                cmb_carId.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);

        }

    }

    void findCar(int id) {
        query = "SELECT `brand`, `make`, `color`, `passengers`, `rental-price` FROM `car` WHERE `car_id` = ?";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, Integer.toString(id));

            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tbl_car.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                txt_rentalPrice.setText(rs.getString(5));
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);

        }

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
        jPanel11 = new javax.swing.JPanel();
        txt_vehiclesRented = new javax.swing.JTextField();
        txt_grandTotals = new javax.swing.JTextField();
        cmb_paymentMode = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        txt_paidAmount = new javax.swing.JTextField();
        txt_balance = new javax.swing.JTextField();
        btn_rent = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_custId = new javax.swing.JComboBox<>();
        btn_genCustomer = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmb_carId = new javax.swing.JComboBox<>();
        btn_genCar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_rentalPrice = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_startDate = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_returnDate = new com.toedter.calendar.JDateChooser();
        jPanel18 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_duration = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_totalRentalPrice = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_car = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        btn_printReceipt = new javax.swing.JButton();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_customerReceipt = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Rent Vehicle");
        setMinimumSize(new java.awt.Dimension(911, 659));
        setPreferredSize(new java.awt.Dimension(911, 659));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 0));

        jLabel1.setFont(new java.awt.Font("Poppins Light", 1, 24)); // NOI18N
        jLabel1.setText("Rent a Vehicle");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 462));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        txt_vehiclesRented.setEditable(false);
        txt_vehiclesRented.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_vehiclesRented.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_vehiclesRented.setText("0");
        txt_vehiclesRented.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicles Rented", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel11.add(txt_vehiclesRented);

        txt_grandTotals.setEditable(false);
        txt_grandTotals.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_grandTotals.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_grandTotals.setText("0.0");
        txt_grandTotals.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grand Totals", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel11.add(txt_grandTotals);

        cmb_paymentMode.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cmb_paymentMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "M-Pesa" }));
        cmb_paymentMode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel11.add(cmb_paymentMode);

        jTextField12.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField12.setText("071234567");
        jTextField12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        jPanel11.add(jTextField12);

        txt_paidAmount.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_paidAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_paidAmount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paid Amount", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        txt_paidAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_paidAmountKeyReleased(evt);
            }
        });
        jPanel11.add(txt_paidAmount);

        txt_balance.setEditable(false);
        txt_balance.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_balance.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_balance.setText("0.0");
        txt_balance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Balance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 12))); // NOI18N
        txt_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_balanceActionPerformed(evt);
            }
        });
        jPanel11.add(txt_balance);

        btn_rent.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        btn_rent.setText("Rent Vehicle");
        btn_rent.setToolTipText("Complete all the fields to enable the button");
        btn_rent.setEnabled(false);
        btn_rent.setPreferredSize(new java.awt.Dimension(150, 35));
        btn_rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rentActionPerformed(evt);
            }
        });
        jPanel11.add(btn_rent);

        jPanel2.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel14.setPreferredSize(new java.awt.Dimension(20, 380));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14, java.awt.BorderLayout.LINE_END);

        jPanel15.setPreferredSize(new java.awt.Dimension(20, 380));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel15, java.awt.BorderLayout.LINE_START);

        jPanel16.setPreferredSize(new java.awt.Dimension(190, 5));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel4.setPreferredSize(new java.awt.Dimension(673, 20));
        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel5.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 3));

        jLabel2.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Customer id:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel7.add(jLabel2);

        cmb_custId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cmb_custId.setToolTipText("Add First to the DB");
        cmb_custId.setFocusCycleRoot(true);
        cmb_custId.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel7.add(cmb_custId);

        btn_genCustomer.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        btn_genCustomer.setText("Gen");
        btn_genCustomer.setPreferredSize(new java.awt.Dimension(60, 35));
        btn_genCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genCustomerActionPerformed(evt);
            }
        });
        jPanel7.add(btn_genCustomer);

        jPanel5.add(jPanel7);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 4));

        jLabel3.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Car id:");
        jPanel9.add(jLabel3);

        cmb_carId.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cmb_carId.setToolTipText("Add First to the DB");
        cmb_carId.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel9.add(cmb_carId);

        btn_genCar.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        btn_genCar.setText("Gen");
        btn_genCar.setPreferredSize(new java.awt.Dimension(60, 35));
        btn_genCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genCarActionPerformed(evt);
            }
        });
        jPanel9.add(btn_genCar);

        jPanel5.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        jLabel4.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Rental Price:");
        jPanel10.add(jLabel4);

        txt_rentalPrice.setEditable(false);
        txt_rentalPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_rentalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_rentalPrice.setText("0.0");
        jPanel10.add(txt_rentalPrice);

        jPanel5.add(jPanel10);

        jPanel12.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Start Date:");
        jPanel12.add(jLabel5);

        txt_startDate.setEditable(false);
        txt_startDate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel12.add(txt_startDate);

        jPanel5.add(jPanel12);

        jPanel17.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        jLabel6.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Return Date:");
        jPanel17.add(jLabel6);
        jPanel17.add(txt_returnDate);

        jPanel5.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        jLabel7.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Duration(days):");
        jPanel18.add(jLabel7);

        txt_duration.setEditable(false);
        txt_duration.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_duration.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_duration.setText("0");
        txt_duration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_durationMouseClicked(evt);
            }
        });
        txt_duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_durationActionPerformed(evt);
            }
        });
        jPanel18.add(txt_duration);

        jPanel5.add(jPanel18);

        jPanel19.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        jLabel8.setFont(new java.awt.Font("Poppins Light", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Total Rental Price");
        jPanel19.add(jLabel8);

        txt_totalRentalPrice.setEditable(false);
        txt_totalRentalPrice.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_totalRentalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_totalRentalPrice.setText("0.0");
        jPanel19.add(txt_totalRentalPrice);

        jPanel5.add(jPanel19);

        jPanel20.setLayout(new java.awt.GridLayout(0, 2, 5, 0));
        jPanel5.add(jPanel20);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        btn_add.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        btn_add.setText("Add");
        btn_add.setPreferredSize(new java.awt.Dimension(90, 30));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel6.add(btn_add);

        jPanel5.add(jPanel6);

        getContentPane().add(jPanel5, java.awt.BorderLayout.WEST);

        jPanel8.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel23.setPreferredSize(new java.awt.Dimension(592, 5));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(592, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel25.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel26.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel26, java.awt.BorderLayout.LINE_START);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 14))); // NOI18N
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel28, java.awt.BorderLayout.LINE_START);

        jPanel30.setPreferredSize(new java.awt.Dimension(572, 5));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel30, java.awt.BorderLayout.PAGE_START);

        jPanel31.setPreferredSize(new java.awt.Dimension(572, 5));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel31, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel32, java.awt.BorderLayout.LINE_END);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 300));

        tbl_customer.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Phone", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_customer);

        jPanel27.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel21);

        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Car Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 14))); // NOI18N
        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel33.setPreferredSize(new java.awt.Dimension(10, 190));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel33, java.awt.BorderLayout.LINE_START);

        jPanel34.setPreferredSize(new java.awt.Dimension(572, 5));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel34, java.awt.BorderLayout.PAGE_START);

        jPanel35.setPreferredSize(new java.awt.Dimension(572, 5));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel35, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel36, java.awt.BorderLayout.LINE_END);

        tbl_car.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_car.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Brand", "Make", "Color", "Passenger"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(tbl_car);

        jPanel29.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jPanel22.add(jPanel29, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel22);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Receipt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins Light", 1, 14))); // NOI18N
        jPanel13.setLayout(new java.awt.BorderLayout(0, 5));

        jPanel24.setPreferredSize(new java.awt.Dimension(5, 5));
        jPanel24.setLayout(new java.awt.GridLayout());
        jPanel13.add(jPanel24, java.awt.BorderLayout.PAGE_START);

        jPanel37.setPreferredSize(new java.awt.Dimension(309, 30));
        jPanel37.setLayout(new java.awt.GridLayout(0, 3));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel37.add(jPanel40);

        btn_printReceipt.setFont(new java.awt.Font("Poppins Light", 1, 12)); // NOI18N
        btn_printReceipt.setText("Print Receipt");
        btn_printReceipt.setEnabled(false);
        btn_printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printReceiptActionPerformed(evt);
            }
        });
        jPanel37.add(btn_printReceipt);

        jPanel13.add(jPanel37, java.awt.BorderLayout.PAGE_END);

        jPanel38.setPreferredSize(new java.awt.Dimension(20, 138));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel38, java.awt.BorderLayout.LINE_END);

        jPanel39.setPreferredSize(new java.awt.Dimension(20, 138));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel39, java.awt.BorderLayout.LINE_START);

        txt_customerReceipt.setEditable(false);
        txt_customerReceipt.setBackground(java.awt.Color.white);
        txt_customerReceipt.setColumns(20);
        txt_customerReceipt.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        txt_customerReceipt.setRows(5);
        txt_customerReceipt.setText("Customer Receipt Generating...");
        jScrollPane2.setViewportView(txt_customerReceipt);

        jPanel13.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel13);

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_genCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genCustomerActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(cmb_custId.getSelectedItem().toString());
        findCustomer(id);

    }//GEN-LAST:event_btn_genCustomerActionPerformed

    private void btn_genCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genCarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(cmb_carId.getSelectedItem().toString());
        findCar(id);

    }//GEN-LAST:event_btn_genCarActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        if (!txt_totalRentalPrice.getText().equals("0.0")) {

            String carName = "Car Name";
            query = "SELECT `brand`, `make`, `color` FROM `car` WHERE `car_id` = ?";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
                pst = con.prepareStatement(query);
                pst.setString(1, cmb_carId.getSelectedItem().toString());
                rs = pst.executeQuery();

                while (rs.next()) {
                    carName = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
            }

            carsId.add(cmb_carId.getSelectedItem().toString());
            cars.add(carName);
            rentalPrices.add(txt_rentalPrice.getText());
            date = sdf.format(txt_returnDate.getDate());

            returnDates.add(date);
            durations.add(txt_duration.getText());
            totalRentalPrices.add(txt_totalRentalPrice.getText());

            
            txt_vehiclesRented.setText(Integer.toString(cars.size()));
            ttlRentalPrice = ttlRentalPrice + Double.parseDouble(txt_totalRentalPrice.getText());
            txt_grandTotals.setText(Double.toString(ttlRentalPrice));

            int index = cmb_carId.getSelectedIndex();
            cmb_carId.removeItemAt(index);

            cmb_custId.setEnabled(false);
            cmb_carId.setSelectedIndex(-1);
            txt_rentalPrice.setText("");
            //txt_returnDate.setDate(sdf.format(date));
            txt_duration.setText("");
            txt_totalRentalPrice.setText("");
        }else{
        System.out.println("Empty Fields");}
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_paidAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_paidAmountKeyReleased
        // TODO add your handling code here:
        double balance = Double.parseDouble(txt_paidAmount.getText()) - Double.parseDouble(txt_grandTotals.getText());

        txt_balance.setText(Double.toString(balance));

        if (balance >= 0) {
            btn_rent.setEnabled(true);
        }

    }//GEN-LAST:event_txt_paidAmountKeyReleased

    private void btn_rentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rentActionPerformed
    /*    try {
            // TODO add your handling code here:
            jTextField12.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Rent.class.getName()).log(Level.SEVERE, null, ex);
        }
     */  
        JOptionPane.showMessageDialog(this, "Car Rented Successfully\nGenerating Receipt...");
        //printRecord(recordPrint());
        txt_customerReceipt.setText(recordPrint());

        String rentQuery = "";

        for (int i = 0; i < cars.size(); i++) {
            query = "UPDATE `car` SET `isPresent`='0' WHERE  `car_id`=?";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
                pst = con.prepareStatement(query);

                pst.setString(1, carsId.get(i));
                pst.executeUpdate();

                //  JOptionPane.showMessageDialog(null, "Vehicle Record Updated  Succesfully");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
            }

            rentQuery = "INSERT INTO `rentals`(`cust_id`, `car_id`, `car_name`, `date_of_rent`, `expected_return_date`, `is_returned`) VALUES (?,?,?,?,?,?)";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
                pst = con.prepareStatement(rentQuery);

                pst.setString(1, cmb_custId.getSelectedItem().toString());
                pst.setString(2, carsId.get(i));
                pst.setString(3, cars.get(i));
                pst.setString(4, txt_startDate.getText());
                pst.setString(5, sdf.format(txt_returnDate.getDate()));
                pst.setString(6, Integer.toString(0));
                pst.executeUpdate();
                
                btn_printReceipt.setEnabled(true);

                //  JOptionPane.showMessageDialog(null, "Vehicle Rent Added Succesfully");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex, "Car Rental Services - Error Message", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_btn_rentActionPerformed

    private void txt_durationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_durationMouseClicked
        // TODO add your handling code here:
        Date rentDate1 = null;
        Date returnDate1 = null;

        try {
            rentDate1 = sdf.parse(txt_startDate.getText());
            returnDate1 = txt_returnDate.getDate();
        } catch (ParseException ex) {
            Logger.getLogger(Rent.class.getName()).log(Level.SEVERE, null, ex);
        }

        Long dur = returnDate1.getTime() - rentDate1.getTime();
        Long duration = TimeUnit.DAYS.convert(dur, TimeUnit.MILLISECONDS);

        if (duration < 0) {
            JOptionPane.showMessageDialog(this, "Change return Date to forward not previous!", "Car Rental Management System", JOptionPane.ERROR_MESSAGE);
        } else {
            txt_duration.setText(Long.toString(duration));

            txt_totalRentalPrice.setText(Double.toString((Double.parseDouble(txt_rentalPrice.getText())) * (Double.parseDouble(txt_duration.getText()))));
        }


    }//GEN-LAST:event_txt_durationMouseClicked

    private void txt_durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_durationActionPerformed

    private void txt_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_balanceActionPerformed

    private void btn_printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printReceiptActionPerformed
        try {
            // TODO add your handling code here:
            txt_customerReceipt.print();
            this.dispose();
        } catch (PrinterException ex) {
            Logger.getLogger(Rent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_printReceiptActionPerformed

    String recordPrint() {
        String data = "";
        String data11 = "";
        String data12 = "";

        String data0 = "------------------------------------\n";
        String data1 = "                          CRMS                        \n";
        data0 = "------------------------------------\n";
        String data2 = "      Car Rental Management System           \n";
        String data3 = "             Group Work Project                \n";
        String data4 = "      Programming Language: Java           \n";
        String data5 = "      Lecturer: Mr. Benjamin Kiprono         \n";
        String data6 = "------------------------------------\n";
        String data7 = "             Customer : " + cmb_custId.getSelectedItem() + "                           \n";
        String data8 = "------------------------------------\n";
        String data9 = " Car                                                  Price\n";
        String data10 = "------------------------------------\n";

        for (int i = 0; i < cars.size(); i++) {
            int carId = i + 1;
            data12 += ("Car 0" + carId + "\n" + " " + cars.get(i) + "\n"
                    + "                  " + returnDates.get(i) + "\n"
                    + "                  " + rentalPrices.get(i) + " * " + durations.get(i) + "               " + totalRentalPrices.get(i) + "\n");

        }
        String data13 = "------------------------------------\n";
        String data14 = " Total Amount:                            " + txt_grandTotals.getText() + "    \n";
        String data15 = "------------------------------------\n";
        String data16 = " Cash                  :            " + cmb_paymentMode.getSelectedItem().toString() + "- " + txt_paidAmount.getText() + "    \n";
        String data17 = "------------------------------------\n";
        String data18 = " Balance           :                       " + txt_balance.getText() + "    \n";
        String data19 = "**********************************************\n";
        String data20 = "             THANK YOU COME AGAIN                        \n";
        String data21 = "**********************************************\n";
        String data22 = " SOFTWARE BY:                                                  \n";
        String data23 = " SIT/0000/2021                                                 \n";
        String data24 = " SIT/0000/2021                                                 \n";
        String data25 = " SIT/0000/2021                                                 \n";
        String data26 = " SIT/0000/2021                                                 \n";
        String data27 = " SIT/0000/2021                                                 \n";
        String data28 = " SIT/0000/2021                                                 \n";
        String data29 = " SIT/0000/2021                                                 \n";
        String data30 = "------------------------------------\n";

        data = data0 + data1 + data0 + data2 + data3 + data4 + data5 + data6 + data7
                + data8 + data9 + data10 + data12 + data13 + data14
                + data15 + data16 + data17 + data18 + data19 + data20 + data21
                + data22 + data23 + data24 + data25 + data26 + data27 + data28
                + data29 + data30;

        return data;

    }

    void printRecord(String rec) {
        StringReader sr = new StringReader(rec);
        LineNumberReader lnr = new LineNumberReader(sr);
        Font typeface = new Font("Dosis", Font.PLAIN, 12);
        Properties p = new Properties();
        PrintJob pJob = getToolkit().getPrintJob(new JFrame(), "Print Customer Receipt Car Rentals", p);

        if (pJob != null) {
            Graphics gr = pJob.getGraphics();
            if (gr != null) {
                FontMetrics fm = gr.getFontMetrics(typeface);
                int margin = 20;
                int pageHeight = pJob.getPageDimension().height - margin;
                int fontHeight = fm.getHeight();
                int fontDescent = fm.getDescent();
                int curHeight = margin;
                String nextLine;
                gr.setFont(typeface);

                try {
                    do {
                        nextLine = lnr.readLine();
                        if (nextLine != null) {
                            if ((curHeight + fontHeight) > pageHeight) {	//New Page.
                                gr.dispose();
                                gr = pJob.getGraphics();
                                curHeight = margin;
                            }
                            curHeight += fontHeight;
                            if (gr != null) {
                                gr.setFont(typeface);
                                gr.drawString(nextLine, margin, curHeight - fontDescent);
                            }
                        }
                    } while (nextLine != null);
                } catch (EOFException eof) {
                } catch (Throwable t) {
                }
            }
            gr.dispose();
        }
        if (pJob != null) {
            pJob.end();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_genCar;
    private javax.swing.JButton btn_genCustomer;
    private javax.swing.JButton btn_printReceipt;
    private javax.swing.JButton btn_rent;
    private javax.swing.JComboBox<String> cmb_carId;
    private javax.swing.JComboBox<String> cmb_custId;
    private javax.swing.JComboBox<String> cmb_paymentMode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTable tbl_car;
    private javax.swing.JTable tbl_customer;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextArea txt_customerReceipt;
    private javax.swing.JTextField txt_duration;
    private javax.swing.JTextField txt_grandTotals;
    private javax.swing.JTextField txt_paidAmount;
    private javax.swing.JTextField txt_rentalPrice;
    private com.toedter.calendar.JDateChooser txt_returnDate;
    private javax.swing.JTextField txt_startDate;
    private javax.swing.JTextField txt_totalRentalPrice;
    private javax.swing.JTextField txt_vehiclesRented;
    // End of variables declaration//GEN-END:variables
}
