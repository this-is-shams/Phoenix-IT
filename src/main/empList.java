/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHAMS
 */
public class empList extends javax.swing.JFrame {

    login ob = new login();
    String u = ob.us;
    String d = ob.desig;
    String job = ob.jid;
    public empList() {
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

        jPanel1 = new javax.swing.JPanel();
        Reload = new javax.swing.JButton();
        sidePanel = new javax.swing.JPanel();
        empname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btn5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btn10 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btn11 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btn12 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reload.setBackground(new java.awt.Color(255, 255, 255));
        Reload.setForeground(new java.awt.Color(102, 0, 51));
        Reload.setText("Show");
        Reload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReloadMouseClicked(evt);
            }
        });
        jPanel1.add(Reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        sidePanel.setBackground(new java.awt.Color(0, 51, 51));
        sidePanel.setPreferredSize(new java.awt.Dimension(130, 600));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empname.setForeground(new java.awt.Color(255, 255, 255));
        empname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empname.setText(u);
        sidePanel.add(empname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 140, 15));

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

        btn5.setBackground(new java.awt.Color(0, 51, 102));
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Documents\\NetBeansProjects\\EmployeeManagement\\src\\icons\\exit.png")); // NOI18N
        btn5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("       Leave");
        btn5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 100, 60));

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
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/employee.png"))); // NOI18N
        btn10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("   Employee");
        btn10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 60));

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
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salary.png"))); // NOI18N
        btn11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel41.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("       Salary");
        btn11.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        sidePanel.add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 60));

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
        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHAMS\\Downloads\\ekdom new.png")); // NOI18N
        btn12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 40));

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("      Meeting");
        btn12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 20));

        sidePanel.add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 60));

        jPanel1.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Designation", "Job ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(list);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 720, 380));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Employee List");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_wp2590323-light-blue-background.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

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

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        login n = new login();
        n.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        dispose();
        mainForm ob = new mainForm();
        ob.setVisible(true);
    }//GEN-LAST:event_btn5MouseClicked

    private void btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseClicked
        // TODO add your handling code here:
        dispose();
        employee ob = new employee();
        ob.setVisible(true);
    }//GEN-LAST:event_btn10MouseClicked

    private void btn11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn11MouseClicked
        // TODO add your handling code here:
        dispose();
        salary ob = new salary();
        ob.setVisible(true);
    }//GEN-LAST:event_btn11MouseClicked

    private void btn12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12MouseClicked
        // TODO add your handling code here:
        dispose();
        meeting ob = new meeting();
        ob.setVisible(true);
    }//GEN-LAST:event_btn12MouseClicked
    boolean ab=true;
    private void ReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReloadMouseClicked
        // TODO add your handling code here:
        
        if(ab){
            try
            {
                Connection con = connSignUp.getConnection();
                Statement stmt = (Statement) con.createStatement();
                String check = "select * from addemp";
                ResultSet point = stmt.executeQuery(check);

                while(point.next())
                {
                    String fname = point.getString("fn");
                    String lname = point.getString("ln");
                    String desg = point.getString("des");
                    String id = point.getString("ji");


                    DefaultTableModel model = (DefaultTableModel)list.getModel();
                    model.addRow(new Object[]{fname,lname,desg,id});
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
            java.util.logging.Logger.getLogger(empList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reload;
    private javax.swing.JPanel btn10;
    private javax.swing.JPanel btn11;
    private javax.swing.JPanel btn12;
    private javax.swing.JPanel btn5;
    private javax.swing.JPanel btn6;
    private javax.swing.JLabel empname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable list;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables
}