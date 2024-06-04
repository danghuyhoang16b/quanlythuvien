
package view;

import controller.TruyenDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Truyen;


public class FORMTRUYEN extends javax.swing.JFrame {
private TruyenDao truyenDao;
    private DefaultTableModel tableModel;
    
    public FORMTRUYEN() {
        initComponents();
        truyenDao = new TruyenDao();
        tableModel = (DefaultTableModel) jTable1.getModel();
        loadTableData();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex != -1) {
            String maTruyen = jTable1.getValueAt(selectedRowIndex, 0).toString();
            String tenTruyen = jTable1.getValueAt(selectedRowIndex, 1).toString();
            String tacGia = jTable1.getValueAt(selectedRowIndex, 2).toString();
            String nhaXB = jTable1.getValueAt(selectedRowIndex, 3).toString();
            String namXB = jTable1.getValueAt(selectedRowIndex, 4).toString();
            String donGia = jTable1.getValueAt(selectedRowIndex, 5).toString();

            txtmatr.setText(maTruyen);
            txttentr.setText(tenTruyen);
            txttacgia.setText(tacGia);
            txtnhaxb.setText(nhaXB);
            txtnamxb.setText(namXB);
            txtdongia.setText(donGia);
        }
    }
});

        
    }
 private void loadTableData() {
        List<model.Truyen> truyenList = truyenDao.getAllTruyens();
        for (model.Truyen truyen : truyenList) {
            tableModel.addRow(new Object[]{
                truyen.getMaTR(), truyen.getTenTruyen(), truyen.getTacGia(),
                truyen.getNhaXB(), truyen.getNamXB(), truyen.getDonGia()
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btsua = new javax.swing.JButton();
        btthem = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmatr = new javax.swing.JTextField();
        txttentr = new javax.swing.JTextField();
        txttacgia = new javax.swing.JTextField();
        txtnhaxb = new javax.swing.JTextField();
        txtnamxb = new javax.swing.JTextField();
        txtdongia = new javax.swing.JTextField();
        anh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "matr", "tentruyen", "tacgia", "nhaxuatban", "namxb", "dongia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1180, 180));

        btsua.setText("sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });
        getContentPane().add(btsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 90, 50));

        btthem.setText("thêm");
        btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemActionPerformed(evt);
            }
        });
        getContentPane().add(btthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 90, 50));

        btxoa.setText("xóa");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });
        getContentPane().add(btxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 90, 50));

        btluu.setText("lưu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });
        getContentPane().add(btluu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 90, 50));

        btthoat.setText("thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });
        getContentPane().add(btthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 90, 50));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Danh Sách Truyện Tranh");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, -15, -1, 120));

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("matr");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("tentruyen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("tacgia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, 20));

        jLabel5.setBackground(new java.awt.Color(255, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("nha xuất bản");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("năm xuất bản");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("dơn giá");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, -1));

        txtmatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatrActionPerformed(evt);
            }
        });
        getContentPane().add(txtmatr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 260, 30));

        txttentr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttentrActionPerformed(evt);
            }
        });
        getContentPane().add(txttentr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 260, 30));

        txttacgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttacgiaActionPerformed(evt);
            }
        });
        getContentPane().add(txttacgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 260, 30));

        txtnhaxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhaxbActionPerformed(evt);
            }
        });
        getContentPane().add(txtnhaxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 240, 30));

        txtnamxb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamxbActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamxb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 240, 30));

        txtdongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdongiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtdongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 240, 30));

        anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tailieu/pngtree-large-bookcase-with-many-books-and-lots-of-light-picture-image_2658801.jpg"))); // NOI18N
        anh.setText("      ");
        getContentPane().add(anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
         int selectedRowIndex = jTable1.getSelectedRow();
    
  
    if (selectedRowIndex != -1) {
        
        int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        
      
        if (option == JOptionPane.YES_OPTION) {          
            ((DefaultTableModel) jTable1.getModel()).removeRow(selectedRowIndex);
        }
    } else {
        
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btxoaActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
      this.setVisible(false);
    }//GEN-LAST:event_btthoatActionPerformed

    private void txtmatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatrActionPerformed

    private void txttentrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttentrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttentrActionPerformed

    private void txttacgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttacgiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttacgiaActionPerformed

    private void txtnhaxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhaxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhaxbActionPerformed

    private void txtnamxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamxbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamxbActionPerformed

    private void txtdongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdongiaActionPerformed

    private void btthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemActionPerformed
        String maTr = txtmatr.getText();
    String tenTruyen = txttentr.getText();
    String tacGia = txttacgia.getText();
    String nhaXB = txtnhaxb.getText();
    String namXB = txtnamxb.getText();
    String donGia = txtdongia.getText();
    
  
    tableModel.addRow(new Object[]{maTr, tenTruyen, tacGia, nhaXB, namXB, donGia});
    
    txtmatr.setText("");
    txttentr.setText("");
    txttacgia.setText("");
    txtnhaxb.setText("");
    txtnamxb.setText("");
    txtdongia.setText("");
    }//GEN-LAST:event_btthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
       int selectedRowIndex = jTable1.getSelectedRow();
    
  
    if (selectedRowIndex != -1) {
        // Lấy thông tin từ các ô văn bản và cập nhật vào dòng được chọn trong bảng
        jTable1.setValueAt(txtmatr.getText(), selectedRowIndex, 0);
        jTable1.setValueAt(txttentr.getText(), selectedRowIndex, 1);
        jTable1.setValueAt(txttacgia.getText(), selectedRowIndex, 2);
        jTable1.setValueAt(txtnhaxb.getText(), selectedRowIndex, 3);
        jTable1.setValueAt(txtnamxb.getText(), selectedRowIndex, 4);
        jTable1.setValueAt(txtdongia.getText(), selectedRowIndex, 5);
        
        
        txtmatr.setText("");
        txttentr.setText("");
        txttacgia.setText("");
        txtnhaxb.setText("");
        txtnamxb.setText("");
        txtdongia.setText("");
    } else {
        // Hiển thị thông báo nếu người dùng chưa chọn dòng nào trong bảng
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btsuaActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed
String maTr = txtmatr.getText();
String tenTruyen = txttentr.getText();
String tacGia = txttacgia.getText();
String nhaXB = txtnhaxb.getText();
String namXB = txtnamxb.getText();
String donGia = txtdongia.getText();

if (maTr.isEmpty() || tenTruyen.isEmpty() || tacGia.isEmpty() || nhaXB.isEmpty() || namXB.isEmpty() || donGia.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Thông báo", JOptionPane.WARNING_MESSAGE);
    return;
}

Truyen truyen = new Truyen(maTr, tenTruyen, tacGia, nhaXB, namXB, donGia);
TruyenDao truyenDao = new TruyenDao();
truyenDao.updateTruyen(truyen);
loadTableData();
txtmatr.setText("");
txttentr.setText("");
txttacgia.setText("");
txtnhaxb.setText("");
txtnamxb.setText("");
txtdongia.setText("");
    
    }//GEN-LAST:event_btluuActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMTRUYEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh;
    private javax.swing.JButton btluu;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthem;
    private javax.swing.JButton btthoat;
    private javax.swing.JButton btxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdongia;
    private javax.swing.JTextField txtmatr;
    private javax.swing.JTextField txtnamxb;
    private javax.swing.JTextField txtnhaxb;
    private javax.swing.JTextField txttacgia;
    private javax.swing.JTextField txttentr;
    // End of variables declaration//GEN-END:variables
}
