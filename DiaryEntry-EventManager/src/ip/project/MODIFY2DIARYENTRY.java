/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.project;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class MODIFY2DIARYENTRY extends javax.swing.JFrame {

    /**
     * Creates new form MODIFY2DIARYENTRY
     */
    public MODIFY2DIARYENTRY() {
        initComponents();
    }
    public String date;
     public MODIFY2DIARYENTRY(String a) {
        initComponents();
        date =a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        entryta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        placetf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timetf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        happyrdb = new javax.swing.JRadioButton();
        avgrdb = new javax.swing.JRadioButton();
        sadrdb = new javax.swing.JRadioButton();
        modify = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("MODIFICATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 11, 205, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/school.png"))); // NOI18N
        jLabel2.setText("ENTRY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 76, 29));

        entryta.setColumns(20);
        entryta.setRows(5);
        jScrollPane1.setViewportView(entryta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 535, 163));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/map.png"))); // NOI18N
        jLabel3.setText("PLACE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 267, 124, 28));
        getContentPane().add(placetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 266, 140, 28));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock.png"))); // NOI18N
        jLabel4.setText("TIME ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 124, 25));

        timetf.setToolTipText("24 hours");
        getContentPane().add(timetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 301, 140, 25));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/satisfaction.png"))); // NOI18N
        jLabel5.setText("MOOD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, 124, -1));

        buttonGroup1.add(happyrdb);
        happyrdb.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        happyrdb.setText("HAPPY");
        happyrdb.setOpaque(false);
        getContentPane().add(happyrdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 339, -1, -1));

        buttonGroup1.add(avgrdb);
        avgrdb.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        avgrdb.setText("AVERAGE");
        avgrdb.setOpaque(false);
        getContentPane().add(avgrdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 339, -1, -1));

        buttonGroup1.add(sadrdb);
        sadrdb.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        sadrdb.setText("SAD");
        sadrdb.setOpaque(false);
        getContentPane().add(sadrdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 339, -1, -1));

        modify.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        modify.setForeground(new java.awt.Color(0, 51, 153));
        modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/update1.png"))); // NOI18N
        modify.setText("MODIFY");
        modify.setOpaque(false);
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });
        getContentPane().add(modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 383, -1, -1));

        delete.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 51));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/delete1.png"))); // NOI18N
        delete.setText("DELETE");
        delete.setBorderPainted(false);
        delete.setFocusPainted(false);
        delete.setOpaque(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 383, 131, 41));

        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("✖\t");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 474, -1, 19));

        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/real-estate.png"))); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 474, -1, 19));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/left-arrow.png"))); // NOI18N
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 474, -1, 19));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 11, 54, 35));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/update1.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 50, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jButton1.setToolTipText("click here to update to current time (24 hours)");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 301, 26, 25));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/variousbackground1.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"CLOSE?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
            
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     new WELCOME().setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
               int result = JOptionPane.showConfirmDialog(null,"Sure? You want to DELETE?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            String query = "DELETE FROM diaryentry1 WHERE date="+"\""+date+"\""+";";
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       new MODIFYDIARYENTRY().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            String s="Select * from diaryentry1 where date="+"\""+date+"\""+";";
            ResultSet rs=stmt.executeQuery(s);
            while(rs.next())
            {
                String entry1=rs.getString("entry");
                String place=rs.getString("place");
                String date11=rs.getString("date");
                String time=rs.getString("time");
                String mood=rs.getString("mood");
                entryta.setText(""+entry1);
                placetf.setText(""+place);
                timetf.setText(""+time);
                if(mood.equals("Average"))
                    avgrdb.setSelected(true);
                else if(mood.equals("Sad"))
                    sadrdb.setSelected(true);
                else if(mood.equals("Happy"))
                happyrdb.setSelected(true);
                          
          }
             stmt.close();
                con.close();
                 rs.close();
                 if(entryta.getText().equals(""))
                 {
                     JOptionPane.showMessageDialog(null, "NO ENTRIES !");
                     dispose();
                 }

        } catch (Exception ex) {
            Logger.getLogger(MODIFY2DIARYENTRY.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        {{ try {
            Class.forName("java.sql.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            String event=entryta.getText();
            String place=placetf.getText();
               String time =timetf.getText();
                String z = null;
            if(happyrdb.isSelected()==true)
                z="Happy";
            else if(avgrdb.isSelected()==true)
                z="Average";
            else if(sadrdb.isSelected()==true)
                z="Sad";
            String s="Update diaryentry1 set entry="+"\""+event+"\""+",place="+"\""+place+"\""+",time="+"\""+time+"\""+",mood="+"\""+z+"\""+"where date="+"\""+date+"\""+";";
            int n=stmt.executeUpdate(s);
            System.out.println(n+"rows affected");
              entryta.setText("");
              con.close(); stmt.close();
               JOptionPane.showMessageDialog(rootPane, "Modification successfull!");
        {
           new MODIFYDIARYENTRY().setVisible(true);
              dispose();
            
             
              
        }
             } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,"Unsupported character(s) or Unidentified logical error!");
        }
        }
        }
        
    }//GEN-LAST:event_modifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Calendar cal = Calendar.getInstance(); 
cal.getTime(); 
SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); 
timetf.setText(sdf.format(cal.getTime()));
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MODIFY2DIARYENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MODIFY2DIARYENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MODIFY2DIARYENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MODIFY2DIARYENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFY2DIARYENTRY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avgrdb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea entryta;
    private javax.swing.JRadioButton happyrdb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modify;
    private javax.swing.JTextField placetf;
    private javax.swing.JRadioButton sadrdb;
    private javax.swing.JTextField timetf;
    // End of variables declaration//GEN-END:variables
}