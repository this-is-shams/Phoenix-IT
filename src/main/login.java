package main;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;


public class login extends javax.swing.JFrame {


    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     int hrd=0,emp=0;
     public static String us;
     public static String pa;
     public static String jid;
     public static String desig;
     public static String ndate;
     public static String ntime;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        empb = new javax.swing.JButton();
        loginb = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hrdb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Phoenix IT Internal Network");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LOGIN PANEL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Sign Up for Employee");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, 30));

        lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 220, 20));

        empb.setBackground(new java.awt.Color(153, 204, 255));
        empb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        empb.setForeground(new java.awt.Color(0, 0, 0));
        empb.setText("Employee Login");
        empb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbActionPerformed(evt);
            }
        });
        jPanel2.add(empb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 474, 218, -1));

        loginb.setBackground(new java.awt.Color(255, 255, 255));
        loginb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginb.setForeground(new java.awt.Color(0, 0, 0));
        loginb.setText("Login");
        loginb.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        loginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbActionPerformed(evt);
            }
        });
        jPanel2.add(loginb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USER ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setForeground(new java.awt.Color(0, 0, 0));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 180, 230, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PASSWORD");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        hrdb.setBackground(new java.awt.Color(153, 204, 255));
        hrdb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hrdb.setForeground(new java.awt.Color(0, 0, 0));
        hrdb.setText("HRD Login");
        hrdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrdbActionPerformed(evt);
            }
        });
        jPanel2.add(hrdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 218, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 310, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Phoenix Mascot Logo final final.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 500));

        jLabel7.setBackground(new java.awt.Color(0, 102, 0));
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/green background.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

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

    private void empbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbActionPerformed
        // TODO add your handling code here:
        if(emp==0)
        {
            lab.setText("  ");
            emp=1;
            empb.setBackground(new Color(166, 89, 92).brighter());
            hrd=0;
            hrdb.setBackground(new Color(255, 255, 255).brighter());
        }
        else
        {
            emp=0;
            empb.setBackground(new Color(255, 255, 255).brighter());
        }
    }//GEN-LAST:event_empbActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbActionPerformed

        us = user.getText();
        pa = pass.getText();
           
        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat ndf  = new SimpleDateFormat("HH:mm:ss");
        
        Date cdate = java.util.Calendar.getInstance().getTime();
        ndate = sdf.format(cdate);
        Date pdate = java.util.Calendar.getInstance().getTime();
        ntime = ndf.format(pdate);
        
        if(user.getText().equals("shams") && pass.getText().equals("9324") && hrd==1)
        {
           label.setText("Login Successful");
           JOptionPane.showMessageDialog(null, "Login Time: "+ndate+" "+ntime);
           dispose();
           mainForm home = new mainForm();
           home.setVisible(true);
        }
        else if(emp==1)
        {
           try
           {
           Connection con = connSignUp.getConnection();
           Statement stmt = con.createStatement();
           String check = "select * from login";
           ResultSet point = stmt.executeQuery(check);
                
           while(point.next())
           {
               String uid = point.getString("userid");
               String pas = point.getString("password");
               jid = point.getString("jobID");
    
               if(us.equals(uid) && pa.equals(pas))
               {
                  label.setText("Login Successful");
                  JOptionPane.showMessageDialog(null, "Login Time: "+ndate);
                  dispose();
                  empPanel home = new empPanel();
                  home.setVisible(true);
                  
                  break;
               }
               else
               {
                  label.setForeground(Color.RED);
                  label.setText("Wrong USER/PASSWORD"); 
               }
           }
           
           String d = "select * from addemp";
           ResultSet r = stmt.executeQuery(d);
           
           while(r.next())
           {
               String j = r.getString("ji");
               
               if(jid.equals(j))
               {
                   desig = r.getString("des");
               }
           }
           
           }
           
           catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Error");
            }

        }
        else if(emp==0 && hrd==0)
        {
            lab.setForeground(Color.RED);
            lab.setText("Please select HRD/Employee");
        }
        else
        {
            label.setForeground(Color.RED);
            label.setText("Wrong USER/PASSWORD");        
        }
        
    }//GEN-LAST:event_loginbActionPerformed

    private void hrdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrdbActionPerformed
        // TODO add your handling code here:
        if(hrd==0)
        {
            lab.setText("  ");
            hrd=1;
            hrdb.setBackground(new Color(166, 89, 92).brighter());
            emp=0;
            empb.setBackground(new Color(255, 255, 255).brighter());
        }
        else
        {
            lab.setText("  ");
            hrd=0;
            hrdb.setBackground(new Color(255, 255, 255).brighter());
        }
    }//GEN-LAST:event_hrdbActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        dispose();
        signUp n = new signUp();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empb;
    private javax.swing.JButton hrdb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel label;
    private javax.swing.JButton loginb;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
