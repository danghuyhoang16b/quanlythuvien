/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 0332255638
 */
public class Truyen {
    private String MaTR;
     private String TenTruyen;
      private String TacGia;
       private String NhaXB;
        private String NamXB;
         private String DonGia;
    public Object getMa;

    public Truyen() {
    }

    public Truyen(String MaTR, String TenTruyen, String TacGia, String NhaXB, String NamXB, String DonGia) {
        this.MaTR = MaTR;
        this.TenTruyen = TenTruyen;
        this.TacGia = TacGia;
        this.NhaXB = NhaXB;
        this.NamXB = NamXB;
        this.DonGia = DonGia;
    }

    public String getMaTR() {
        return MaTR;
    }

    public void setMaTR(String MaTR) {
        this.MaTR = MaTR;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String TenTruyen) {
        this.TenTruyen = TenTruyen;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNhaXB() {
        return NhaXB;
    }

    public void setNhaXB(String NhaXB) {
        this.NhaXB = NhaXB;
    }

    public String getNamXB() {
        return NamXB;
    }

    public void setNamXB(String NamXB) {
        this.NamXB = NamXB;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }
         
}
