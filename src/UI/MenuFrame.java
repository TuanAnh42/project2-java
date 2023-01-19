/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import unti.Clock;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
    
/**
 *
 * @author admin
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    Color DefaultColor, ClickedColor;

    public MenuFrame() {
        initComponents();
        initCLock();
        DefaultColor = new Color(133, 176, 240);
        ClickedColor = new Color(169, 198, 239);

        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(DefaultColor);
    }

    private void initCLock() {
        Clock clock = new Clock(timeLbl);
        clock.start();
    }

    /**
     *
     * /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanel = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Menu6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Menu7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        timeLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Menu9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Menu2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Menu5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Menu3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Menu4 = new javax.swing.JPanel();
        edit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 1440, 890));

        jPanel1.setBackground(new java.awt.Color(169, 198, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-x-25.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, 22, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 1460, 30));

        jPanel3.setBackground(new java.awt.Color(133, 176, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu6.setBackground(new java.awt.Color(133, 176, 240));
        Menu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu6MousePressed(evt);
            }
        });
        Menu6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(164, 211, 238));
        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-admin-settings-male-24.png"))); // NOI18N
        jLabel17.setText("  Manage Staff");
        Menu6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        jPanel3.add(Menu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 190, 80));

        Menu7.setBackground(new java.awt.Color(133, 176, 240));
        Menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu7MousePressed(evt);
            }
        });
        Menu7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-contact-24.png"))); // NOI18N
        jLabel15.setText("   Contact");
        Menu7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 40));

        jPanel3.add(Menu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 190, 70));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout-24.png"))); // NOI18N
        jLabel14.setText("Log out");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 120, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 10));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/admin-32.png"))); // NOI18N
        jLabel16.setText("Hello ADMIN");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 40));

        timeLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        timeLbl.setForeground(new java.awt.Color(255, 255, 255));
        timeLbl.setText("Time :");
        jPanel3.add(timeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-hotel-30.png"))); // NOI18N
        jLabel2.setText("Novotel Control ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        Menu9.setBackground(new java.awt.Color(133, 176, 240));
        Menu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu9MousePressed(evt);
            }
        });
        Menu9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(164, 211, 238));
        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-admin-settings-male-24.png"))); // NOI18N
        jLabel11.setText("  Manage Customer");
        Menu9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        jPanel3.add(Menu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 190, 80));

        Menu2.setBackground(new java.awt.Color(133, 176, 240));
        Menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu2MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BillManage.png"))); // NOI18N
        jLabel13.setText("  Manage Bill");

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel3.add(Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 190, 80));

        Menu5.setBackground(new java.awt.Color(133, 176, 240));
        Menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu5MousePressed(evt);
            }
        });
        Menu5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-24.png"))); // NOI18N
        jLabel19.setText("Booking Room");
        Menu5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        jPanel3.add(Menu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 190, 80));

        Menu3.setBackground(new java.awt.Color(133, 176, 240));
        Menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu3MousePressed(evt);
            }
        });
        Menu3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-room-24.png"))); // NOI18N
        jLabel12.setText("  Manage Room");
        Menu3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        jPanel3.add(Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 80));

        Menu4.setBackground(new java.awt.Color(133, 176, 240));
        Menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu4MousePressed(evt);
            }
        });
        Menu4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(Menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 190, 10));

        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 51, 153));
        edit.setText("Change Password");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel3.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, 150, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 940));

        jPanel4.setBackground(new java.awt.Color(169, 198, 239));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 920, 1440, 20));

        jPanel5.setBackground(new java.awt.Color(169, 198, 239));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 30, 20, 910));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MouseClicked
        BillManagementJFrame menu1 = new BillManagementJFrame();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(menu1).setVisible(true);
    }//GEN-LAST:event_Menu2MouseClicked

    private void Menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu2MousePressed
        Menu2.setBackground(ClickedColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);

    }//GEN-LAST:event_Menu2MousePressed

    private void Menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MousePressed
        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(ClickedColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);

    }//GEN-LAST:event_Menu3MousePressed

    private void Menu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu6MousePressed
        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(ClickedColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);

    }//GEN-LAST:event_Menu6MousePressed

    private void Menu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MousePressed
        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(ClickedColor);
        Menu9.setBackground(DefaultColor);
        Menu5.setBackground(DefaultColor);

    }//GEN-LAST:event_Menu7MousePressed

    private void Menu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu3MouseClicked
        try {
            RoomManagementJFrame roomJFrame = new RoomManagementJFrame();
            jDesktopPanel.removeAll();
            jDesktopPanel.add(roomJFrame).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Menu3MouseClicked

    private void Menu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu6MouseClicked
        StaffManagementJFrame staff = new StaffManagementJFrame();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(staff).setVisible(true);

    }//GEN-LAST:event_Menu6MouseClicked

    private void Menu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu7MouseClicked
        ContactJFrame contact = new ContactJFrame();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(contact).setVisible(true);
    }//GEN-LAST:event_Menu7MouseClicked

    private void Menu9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu9MousePressed
        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(ClickedColor);
        Menu5.setBackground(DefaultColor);

    }//GEN-LAST:event_Menu9MousePressed

    private void Menu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu9MouseClicked
        // TODO add your handling code here:
        CustomerManagementJFrame cus = new CustomerManagementJFrame();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(cus).setVisible(true);
    }//GEN-LAST:event_Menu9MouseClicked

    private void Menu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu4MouseClicked

    private void Menu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu4MousePressed

    private void Menu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MouseClicked
        // TODO add your handling code here:
        BookingJFrame bk = new BookingJFrame();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(bk).setVisible(true);
    }//GEN-LAST:event_Menu5MouseClicked

    private void Menu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu5MousePressed
        Menu2.setBackground(DefaultColor);
        Menu3.setBackground(DefaultColor);
        Menu6.setBackground(DefaultColor);
        Menu7.setBackground(DefaultColor);
        Menu9.setBackground(DefaultColor);
        Menu5.setBackground(ClickedColor);

    }//GEN-LAST:event_Menu5MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

            ChangePwd form = new ChangePwd();
            form.setVisible(true);

    }//GEN-LAST:event_editActionPerformed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        LoginJFrame frame = new LoginJFrame();
//        frame.setdata(UserManagement.getEmail(email));
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MousePressed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu2;
    private javax.swing.JPanel Menu3;
    private javax.swing.JPanel Menu4;
    private javax.swing.JPanel Menu5;
    private javax.swing.JPanel Menu6;
    private javax.swing.JPanel Menu7;
    private javax.swing.JPanel Menu9;
    private javax.swing.JButton edit;
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel timeLbl;
    // End of variables declaration//GEN-END:variables
}
