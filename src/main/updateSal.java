package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class updateSal extends javax.swing.JFrame {

    /**
     * Creates new form updateSal
     */
    login ob = new login();
    String u = ob.us;

    public updateSal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usal = new javax.swing.JTextField();
        sidePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();
        empdes = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        sal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("JOB ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jid.setBackground(new java.awt.Color(255, 255, 255));
        jid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jid.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 140, 30));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 110, 30));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Update Salary");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Update Salary");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        usal.setBackground(new java.awt.Color(255, 255, 255));
        usal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usal.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(usal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 140, 30));

        sidePanel.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_2user.png"))); // NOI18N
        sidePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 130, 67));

        empname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empname.setForeground(new java.awt.Color(255, 255, 255));
        empname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empname.setText(u);
        sidePanel.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 15));

        empdes.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        empdes.setForeground(new java.awt.Color(51, 255, 255));
        empdes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empdes.setText("HRD");
        sidePanel.add(empdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 130, 15));

        btn1.setBackground(new java.awt.Color(0, 51, 102));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        btn1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");
        btn1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 45, 90, -1));

        sidePanel.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 70));

        btn3.setBackground(new java.awt.Color(0, 51, 102));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
        btn3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Employee");
        btn3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        sidePanel.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 70));

        btn4.setBackground(new java.awt.Color(0, 51, 102));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btn4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Leave");
        btn4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

        sidePanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, 70));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn6Layout.setVerticalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, 100, 30));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        getContentPane().add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        dispose();
        mainForm ob = new mainForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btn1MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        dispose();
        employee ob = new employee();
        ob.setVisible(true);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        dispose();
        salary n = new salary();
        n.setVisible(true);
    }//GEN-LAST:event_btn4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String us = usal.getText();
        String jobid = jid.getText();
        try {
            // TODO add your handling code here:
            Connection con = connSignUp.getConnection();
            Statement stmt = con.createStatement();
            String piu = "select * from salary";
            ResultSet r = stmt.executeQuery(piu);
            String q = "UPDATE `salary` SET `sal` = ? WHERE `jid` = ? ";
            PreparedStatement nt;

            while (r.next()) 
            {
                String ji = r.getString("jid");
                if (jobid.equals(ji)) 
                {
                    try 
                    {
                        nt = (PreparedStatement) connSignUp.getConnection().prepareStatement(q);
                        nt.setString(1, us);
                        nt.setString(2, ji);
                        nt.execute();
                    } 
                    
                    catch (SQLException ex) 
                    {
                        Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
             JOptionPane.showMessageDialog(null, "Salary updated successfully for JOB_ID "+jobid);

        } catch (SQLException ex) {
            Logger.getLogger(updateSal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateSal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn6;
    private javax.swing.JLabel empdes;
    private javax.swing.JLabel empname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jid;
    private javax.swing.JLabel sal;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JTextField usal;
    // End of variables declaration//GEN-END:variables

}