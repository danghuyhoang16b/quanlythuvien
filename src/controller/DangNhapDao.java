package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.user;

public class DangNhapDao {
    
    public user checkLogin(String tenKH, String maKH) {
        Connection connection = ketnoi.getConnection();
        String sql = "SELECT * FROM KhachHang WHERE TenKH = ? AND MaKH = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tenKH);
            preparedStatement.setString(2, maKH);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                user u = new user();
                u.setMaKH(resultSet.getString("MaKH"));
                u.setTenKH(resultSet.getString("TenKH"));
                u.setSDT(resultSet.getString("SDT"));
                u.setDiaChi(resultSet.getString("DiaChi"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println("Lỗi truy vấn: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Lỗi đóng kết nối: " + e.getMessage());
                }
            }
        }
        return null;
    }
}
