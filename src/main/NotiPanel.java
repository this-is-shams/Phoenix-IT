/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHAMS
 */
public class NotiPanel extends javax.swing.JFrame {

    login ob = new login();
    String u = ob.us;
    String job = ob.jid;
    String des = ob.desig;
    public NotiPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sidePanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btn14 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        btn15 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        btn16 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Reload = new javax.swing.JButton();
        meetingalert = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Notification Panel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, -1));

        sidePanel.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_2user.png"))); // NOI18N
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 67));

        btn6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LogOut");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn6Layout = new javax.swing.GroupLayout(btn6);
        btn6.setLayout(btn6Layout);
        btn6Layout.setHorizontalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn6Layout.setVerticalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 100, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        sidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 600));

        sidePanel1.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel1.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setBackground(new java.awt.Color(0, 51, 102));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("LogOut");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn7Layout = new javax.swing.GroupLayout(btn7);
        btn7.setLayout(btn7Layout);
        btn7Layout.setHorizontalGroup(
            btn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btn7Layout.setVerticalGroup(
            btn7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePanel1.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 100, 30));

        btn8.setBackground(new java.awt.Color(0, 51, 102));
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        btn8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\exit.png")); // NOI18N
        btn8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel44.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("       Leave");
        btn8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel1.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 60));

        btn14.setBackground(new java.awt.Color(0, 51, 102));
        btn14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn14MouseClicked(evt);
            }
        });
        btn14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_cash-payment.png")); // NOI18N
        btn14.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel48.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("     Balance");
        btn14.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel1.add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 60));

        btn15.setBackground(new java.awt.Color(0, 51, 102));
        btn15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn15MouseClicked(evt);
            }
        });
        btn15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_immigration.png")); // NOI18N
        btn15.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel50.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("  Attendance");
        btn15.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel1.add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 60));

        btn16.setBackground(new java.awt.Color(0, 51, 102));
        btn16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn16MouseClicked(evt);
            }
        });
        btn16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_to-do-list.png")); // NOI18N
        btn16.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel52.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("    To-Do List");
        btn16.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel1.add(btn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 60));

        empname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empname.setForeground(new java.awt.Color(255, 255, 255));
        empname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empname.setText(u);
        sidePanel1.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 15));

        sidePanel.add(sidePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Messages"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setRowHeight(40);
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 620, 380));

        Reload.setBackground(new java.awt.Color(255, 255, 255));
        Reload.setForeground(new java.awt.Color(102, 0, 51));
        Reload.setText("Show");
        Reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReloadMouseClicked(evt);
            }
        });
        getContentPane().add(Reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        meetingalert.setBackground(new java.awt.Color(255, 153, 153));
        meetingalert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        meetingalert.setForeground(new java.awt.Color(0, 0, 0));
        meetingalert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        getContentPane().add(meetingalert, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 620, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn15MouseClicked

    private void btn16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16MouseClicked

    private void btn14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        // TODO add your handling code here:
        dispose();
        empPanel ob = new empPanel();
        ob.setVisible(true);
    }//GEN-LAST:event_btn8MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked
    boolean ab=true;
    private void ReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadMouseClicked
        // TODO add your handling code here:
        
        if(ab)
        {
        
        try
        {
          Connection con = connSignUp.getConnection();
          Statement stmt = con.createStatement();
          String check = "select * from notification";
          ResultSet point = stmt.executeQuery(check);
          
          while(point.next())
          {
              String uid = point.getString("jobID");
              String mess = point.getString("noti");
              
              if(uid.equals(job))
              {
                  DefaultTableModel model = (DefaultTableModel)table.getModel();
                  model.addRow(new Object[]{mess});
              }
          }
          
          String c = "select * from meeting";
          ResultSet p = stmt.executeQuery(c);
          
          while(p.next())
          {

             meetingalert.setText("    Next scheduled meeting on "+p.getString("date")+" & "+p.getString("time")+" at room "+p.getString("room")+" for "+p.getString("desig"));

          }
        }
     
        catch (SQLException ex) 
        {
          JOptionPane.showMessageDialog(null, "Error");
        }
        
        Reload.setEnabled(false);
        ab=false;
            
        }
        
        
      //  Reload.setActionCommand(disable);
           //JOptionPane.showMessageDialog(null, job);
    }//GEN-LAST:event_ReloadMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotiPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotiPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JPanel btn14;
    private javax.swing.JPanel btn15;
    private javax.swing.JPanel btn16;
    private javax.swing.JPanel btn6;
    private javax.swing.JPanel btn7;
    private javax.swing.JPanel btn8;
    private javax.swing.JLabel empname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel meetingalert;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPanel sidePanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
