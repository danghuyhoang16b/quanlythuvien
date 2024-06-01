/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 0332255638
 */
public class ketnoi {
    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost;databaseName=quanlychothuetruyen;user=sa;password=123456;encrypt=false";
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url);
            System.out.println("ket noi thanh cong");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("loi ket noi: " + ex.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
    Connection connection = getConnection();
        if (connection != null) {
           
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("loi dong ket noi: " + e.getMessage());
            }
        }
    }
}
