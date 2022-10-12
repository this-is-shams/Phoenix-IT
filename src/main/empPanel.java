package main;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class empPanel extends javax.swing.JFrame {

    login ob = new login();
    String user = ob.us;
    String d = ob.desig;
    String job = ob.jid;

    public empPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btn10 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btn11 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btn12 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn9.setBackground(new java.awt.Color(0, 51, 102));
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        btn9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\img.png")); // NOI18N
        btn9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 40));

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("  Notification");
        btn9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 20));

        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 240, 140));

        btn10.setBackground(new java.awt.Color(0, 51, 102));
        btn10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn10MouseClicked(evt);
            }
        });
        btn10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_cash-payment.png")); // NOI18N
        btn10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 50));

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("     Balance");
        btn10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 30));

        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 240, 140));

        btn11.setBackground(new java.awt.Color(0, 51, 102));
        btn11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn11MouseClicked(evt);
            }
        });
        btn11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_immigration.png")); // NOI18N
        btn11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 40));

        jLabel41.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("  Attendance");
        btn11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 20));

        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 240, 130));

        btn12.setBackground(new java.awt.Color(0, 51, 102));
        btn12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn12MouseClicked(evt);
            }
        });
        btn12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\rsz_to-do-list.png")); // NOI18N
        btn12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 40));

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("    To-Do List");
        btn12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 20));

        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 240, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 760, 600));

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

        empname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empname.setForeground(new java.awt.Color(255, 255, 255));
        empname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empname.setText(user);
        sidePanel.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 15));

        getContentPane().add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseClicked
        // TODO add your handling code here:
        String curr = ob.ndate;
        String join = "";
        String Cd = "", jd = "";
        int mainSal=0;
        try {
            Connection con = connSignUp.getConnection();
            Statement stmt = con.createStatement();
            String check = "select * from addemp";
            ResultSet point = stmt.executeQuery(check);

            while (point.next()) 
            {
                String uid = point.getString("ji");

                if (uid.equals(job)) 
                {
                    join = point.getString("dt");
                    mainSal = point.getInt("salary");
                }
            }

            Cd = curr;
            jd = join;
            int d1 = Character.getNumericValue(jd.charAt(0));
            d1 = d1 * 10 + Character.getNumericValue(jd.charAt(1));
            int d2 = Character.getNumericValue(Cd.charAt(0));
            d2 = d2 * 10 + Character.getNumericValue(Cd.charAt(1));

            int m1 = Character.getNumericValue(jd.charAt(3));
            m1 = m1 * 10 + Character.getNumericValue(jd.charAt(4));
            int m2 = Character.getNumericValue(Cd.charAt(3));
            m2 = m2 * 10 + Character.getNumericValue(Cd.charAt(4));

            int y1 = Character.getNumericValue(jd.charAt(6));
            y1 = y1 * 10 + Character.getNumericValue(jd.charAt(7));
            y1 = y1 * 10 + Character.getNumericValue(jd.charAt(8));
            y1 = y1 * 10 + Character.getNumericValue(jd.charAt(9));

            int y2 = Character.getNumericValue(Cd.charAt(6));
            y2 = y2 * 10 + Character.getNumericValue(Cd.charAt(7));
            y2 = y2 * 10 + Character.getNumericValue(Cd.charAt(8));
            y2 = y2 * 10 + Character.getNumericValue(Cd.charAt(9));

            if (y2 >= y1) 
            {
                if (m2 > m1) 
                {
                    if (d2 >= d1) 
                    {
                        try 
                        {
                            String r = "select * from salary";
                            ResultSet star = stmt.executeQuery(r);

                            while (star.next()) 
                            {
                                String sid = star.getString("jid");
                                int oldSal =  star.getInt("sal");
                                if (sid.equals(job)) 
                                {
                                    String up = "UPDATE `salary` SET `sal` = ? WHERE `jid` = ?";
                                    PreparedStatement pst;

                                    try 
                                    {
                                        pst = (PreparedStatement) connSignUp.getConnection().prepareStatement(up);
                                        pst.setInt(1,(oldSal+mainSal));
                                        pst.setString(2, job);
                                        pst.execute();
                                    } 
                                    catch (SQLException ex) 
                                    {
                                        Logger.getLogger(connSignUp.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }

                        } 
                        
                        catch (SQLException ex) 
                        {
                            System.out.println("Error");
                        }
                    }
                }
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        Cd = curr;
        jd = join;
        
        dispose();
        balanceEmp ob = new balanceEmp();
        ob.setVisible(true);
    }//GEN-LAST:event_btn10MouseClicked

    private void btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseClicked
        // TODO add your handling code here:
        dispose();
        attendance ob = new attendance();
        ob.setVisible(true);
    }//GEN-LAST:event_btn11MouseClicked

    private void btn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12MouseClicked


    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked

        dispose();
        NotiPanel ob = new NotiPanel();
        ob.setVisible(true);
        //JOptionPane.showMessageDialog(null,job);
    }//GEN-LAST:event_btn9MouseClicked

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
            java.util.logging.Logger.getLogger(empPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn10;
    private javax.swing.JPanel btn11;
    private javax.swing.JPanel btn12;
    private javax.swing.JPanel btn6;
    private javax.swing.JPanel btn9;
    private javax.swing.JLabel empname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
