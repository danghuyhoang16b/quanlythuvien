package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.user;

public class DangKyDao {

    public boolean addUser(user newUser) {
        Connection connection = ketnoi.getConnection();
        String sql = "INSERT INTO KhachHang (MaKH, TenKH, SDT, DiaChi) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, newUser.getMaKH());
            ps.setString(2, newUser.getTenKH());
            ps.setString(3, newUser.getSDT());
            ps.setString(4, newUser.getDiaChi());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
