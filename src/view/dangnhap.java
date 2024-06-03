/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.DangNhapDao;
import javax.swing.JOptionPane;
import model.user;

/**
 *
 * @author 0332255638
 */
public class dangnhap extends javax.swing.JFrame {

    /**
     * Creates new form dangnhap
     */
    public dangnhap() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        btvao = new javax.swing.JButton();
        bthuy = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btdangky = new javax.swing.JButton();
        bthoat = new javax.swing.JButton();
        anhnen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dang nhap");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP THUÊ TRUYỆN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 250, 60));

        jLabel2.setText("USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel3.setText("PASSW0RD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, -1));

        btvao.setText("DĂNG NHẬP");
        btvao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvaoActionPerformed(evt);
            }
        });
        getContentPane().add(btvao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        bthuy.setText("HỦY");
        bthuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthuyActionPerformed(evt);
            }
        });
        getContentPane().add(bthuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 330, 100, -1));

        pass.setText("jPasswordField1");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("ban chua có tài khoản đăng nhập");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 610, -1, -1));

        btdangky.setText("đăng ký");
        btdangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdangkyActionPerformed(evt);
            }
        });
        getContentPane().add(btdangky, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 90, 30));

        bthoat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bthoat.setText("x");
        bthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthoatActionPerformed(evt);
            }
        });
        getContentPane().add(bthoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 50, 40));

        anhnen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tailieu/thiet-ke-bia-sach-chuyen-nghep-baabrand-3.jpg"))); // NOI18N
        anhnen.setText("jLabel2");
        getContentPane().add(anhnen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 992, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bthuyActionPerformed

    private void btvaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvaoActionPerformed
        String tenKH = user.getText();
        String maKH = new String(pass.getPassword());

        DangNhapDao dangNhapDao = new DangNhapDao();
        user u = dangNhapDao.checkLogin(tenKH, maKH);

        if (u != null) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
            // Chuyển hướng sang giao diện chính hoặc thực hiện các hành động tiếp theo
            this.setVisible(false);
            new ThueTruyen().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Tên người dùng hoặc mật khẩu không đúng!");
        }
    }//GEN-LAST:event_btvaoActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void btdangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdangkyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdangkyActionPerformed

    private void bthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthoatActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_bthoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anhnen;
    private javax.swing.JButton btdangky;
    private javax.swing.JButton bthoat;
    private javax.swing.JButton bthuy;
    private javax.swing.JButton btvao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
