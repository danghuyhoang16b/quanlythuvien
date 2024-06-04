package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Truyen;

public class TruyenDao extends ketnoi {
    
    public List<Truyen> getAllTruyens() {
        List<Truyen> list = new ArrayList<>();
        String sql = "SELECT * FROM Truyen"; 
        try (Connection con = ketnoi.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                Truyen truyen = new Truyen();
                truyen.setMaTR(rs.getString("MaTR")); 
                truyen.setTenTruyen(rs.getString("TenTruyen")); 
                truyen.setTacGia(rs.getString("TacGia")); 
                truyen.setNhaXB(rs.getString("NhaXB")); 
                truyen.setNamXB(rs.getString("NamXB")); 
                truyen.setDonGia(rs.getString("DonGia")); 
                list.add(truyen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public void addTruyen(Truyen truyen) {
        String sql = "INSERT INTO Truyen (MaTR, TenTruyen, TacGia, NhaXB, NamXB, DonGia) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = ketnoi.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, truyen.getMaTR());
            ps.setString(2, truyen.getTenTruyen());
            ps.setString(3, truyen.getTacGia());
            ps.setString(4, truyen.getNhaXB());
            ps.setString(5, truyen.getNamXB());
            ps.setString(6, truyen.getDonGia());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateTruyen(Truyen truyen) {
    String sql = "UPDATE Truyen SET TenTruyen = ?, TacGia = ?, NhaXB = ?, NamXB = ?, DonGia = ? WHERE MaTR = ?";
    try (Connection con = ketnoi.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, truyen.getTenTruyen());
        ps.setString(2, truyen.getTacGia());
        ps.setString(3, truyen.getNhaXB());
        ps.setString(4, truyen.getNamXB());
        ps.setString(5, truyen.getDonGia());
        ps.setString(6, truyen.getMaTR());
        
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
