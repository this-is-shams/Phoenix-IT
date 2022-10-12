package main;

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

public class addemp extends javax.swing.JFrame {

    login ob = new login();
    String u = ob.us;

    public addemp() {
        initComponents();
        Date da = new Date();
        this.setLocationRelativeTo(null);
        d.setMinSelectableDate(da);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        desig = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ad = new javax.swing.JTextArea();
        nid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        d = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();
        empdes = new javax.swing.JLabel();
        btn1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        fname.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 170, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("E-mail");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        email.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 170, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        lname.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 170, -1));

        desig.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(desig, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Designation");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Salary");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, -1, -1));

        sal.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        ad.setBackground(new java.awt.Color(255, 255, 255));
        ad.setColumns(20);
        ad.setRows(5);
        jScrollPane1.setViewportView(ad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 170, 110));

        nid.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("National ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        p.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 170, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Phone");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Joining Date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        d.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 170, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ADD EMPLOYEE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 260, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Job ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jid.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 170, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 120, 40));

        sidePanel.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_2user.png"))); // NOI18N
        sidePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 5, 130, 67));

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

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        btn1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Dashboard");
        btn1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 45, 90, -1));

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

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salary.png"))); // NOI18N
        btn3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Salary");
        btn3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

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

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        btn4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 110, 40));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Leave");
        btn4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 40, -1, -1));

        sidePanel.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, 70));

        btn6.setBackground(new java.awt.Color(0, 51, 102));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LogOut");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn6Layout = new javax.swing.GroupLayout(btn6);
        btn6.setLayout(btn6Layout);
        btn6Layout.setHorizontalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn6Layout.setVerticalGroup(
            btn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidePanel.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 515, 100, 30));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        // TODO add your handling code here:
        dispose();
        employee n = new employee();
        n.setVisible(true);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        // TODO add your handling code here:
        dispose();
        salary n = new salary();
        n.setVisible(true);
    }//GEN-LAST:event_btn3MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        int f = 0;
        String f1 = fname.getText();
        String l1 = lname.getText();
        String d1 = desig.getText();
        String a1 = ad.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String d2 = null;
        d2 = sdf.format(d.getDate());
        String j1 = jid.getText();
        String n1 = nid.getText();
        String p1 = p.getText();
        String e1 = email.getText();
        int salary = Integer.parseInt(sal.getText());

        try {
            Connection con = connSignUp.getConnection();
            Statement stmt = con.createStatement();
            String query = "select * from addemp";
            ResultSet rs = stmt.executeQuery(query);
            String in = "INSERT INTO `addemp`(`fn`, `ln`, `des`,`a`, `dt`, `ji`,`ni`, `ph`,`em`,`salary`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst;

            while (rs.next()) {
                String ji = rs.getString("ji");

                if (j1.equals(ji)) {
                    JOptionPane.showMessageDialog(null, "This JOB ID is already exist!");
                    f = 1;
                    break;
                }
            }

            if (f == 0) {
                try {
                    pst = (PreparedStatement) connSignUp.getConnection().prepareStatement(in);
                    pst.setString(1, f1);
                    pst.setString(2, l1);
                    pst.setString(3, d1);
                    pst.setString(4, a1);
                    pst.setString(5, d2);
                    pst.setString(6, j1);
                    pst.setString(7, n1);
                    pst.setString(8, p1);
                    pst.setString(9, e1);
                    pst.setInt(10, salary);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Employee added!");
                } catch (SQLException ex) {
                    Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            String from = "phoenix.it.71@gmail.com.com";
            String host = "localhost";
            String content = "Dear " + f1 + " " + l1 + " ," + "\n" + "Congratulations on joining PHOENIX.IT.71. \n"
                    + "\n"
                    + "We believe you had an wonderful journey, with us till now. \n"
                    + "It is a great opportunity for us to work with you. We hereby welcome you , and hope for the best.\n"
                    + "\n"
                    + "A long fascinating journey is awaiting ahead us. \n"
                    + "BEST OF LUCK" + "\n\nShams Farabi       Arnab Barua" + "\nCEO                     Managing Director" + "\n           PHOENIX IT 71";
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");

            Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("phoenix.it.71@gmail.com", "star99MOON");
                }
            });

            try {
                MimeMessage m = new MimeMessage(s);
                m.setFrom(from);
                m.addRecipient(Message.RecipientType.TO, new InternetAddress(e1));
                m.setSubject("Account confirmation from PHOENIX.IT.71");
                m.setText(content);
                Transport.send(m);
                //JOptionPane.showMessageDialog(null, "Success!");
            } 
            
            catch (Exception e) 
            {
                System.out.println("Error");
            }
            
            String piu = "select * from salary";
            ResultSet r = stmt.executeQuery(piu);
            String q = "INSERT INTO `salary`(`jid`,`sal`) VALUES (?,?)";
            PreparedStatement nt;
            
            try 
            {
                nt = (PreparedStatement) connSignUp.getConnection().prepareStatement(q);
                nt.setString(1,j1);
                nt.setInt(2,0);
                nt.execute();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(signUp.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        dispose();
        mainForm ob = new mainForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btn1MouseClicked

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
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ad;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JPanel btn6;
    private com.toedter.calendar.JDateChooser d;
    private javax.swing.JTextField desig;
    private javax.swing.JTextField email;
    private javax.swing.JLabel empdes;
    private javax.swing.JLabel empname;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField p;
    private javax.swing.JTextField sal;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}
