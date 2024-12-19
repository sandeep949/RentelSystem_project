/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carsrentalmanagementsystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class CarRentals {

  
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    String query;
    

    public String setDate() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String dateString = (year + "-" + (month + 1) + "-" + day);

        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String dateString2 = df.format(currentDate);

        return dateString;
    }

    public String setTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(date);

        return (timeString);
    }

    public void addNewEmployee(String name, String gender, String phone, String email, String address, String date, String username, String password) {
        query = "INSERT INTO `employee`(`name`, `gender`, `phone`, `email`, `address`, `date`, `username`, `password`) VALUES (?,?,?,?,?,?,?,?)";
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setString(3, phone);
            pst.setString(4, email);
            pst.setString(5, address);
            pst.setString(6, date);
            pst.setString(7, username);
            pst.setString(8, password);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Employee Registered Succesfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void addAdmin(String name, String gender, String phone, String email, String address, String date, String username, String password) {
        query = "INSERT INTO `admin`(`name`, `gender`, `phone`, `email`, `address`, `date`, `username`, `password`) VALUES (?,?,?,?,?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setString(3, phone);
            pst.setString(4, email);
            pst.setString(5, address);
            pst.setString(6, date);
            pst.setString(7, username);
            pst.setString(8, password);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Admin Registered Succesfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void addNewCustomer(String name, String gender, String phone, String email, String address, String date) {
        query = "INSERT INTO `customer`(`name`, `gender`, `phone`, `email`, `address`, `date`) VALUES (?,?,?,?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, gender);
            pst.setString(3, phone);
            pst.setString(4, email);
            pst.setString(5, address);
            pst.setString(6, date);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Customer Registered Succesfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void addCars(String brand, String make, String color, String passengers, String date, String rentalPrice) {
        query = "INSERT INTO `car`(`brand`, `make`, `color`,`passengers`, `date`, `rental-price`, `isPresent`) VALUES (?,?,?,?,?,?,?)";
        String isPresent = Integer.toString(1);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrentalmanagementsystem", "root", "root");
            pst = con.prepareStatement(query);
            pst.setString(1, brand);
            pst.setString(2, make);
            pst.setString(3, color);
            pst.setString(4, passengers);
            pst.setString(5, date);
            pst.setString(6, rentalPrice);
            pst.setString(7, isPresent);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Car Registered Succesfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
