/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MODIFYEVENTMANAGER extends javax.swing.JFrame {

    /**
     * Creates new form MODIFYEVENTMANAGER
     */
    
    public MODIFYEVENTMANAGER() {
        initComponents();
    }
     public String date;
     public MODIFYEVENTMANAGER(String a) {
        initComponents();
        date=a;}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        placetf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        endtf = new javax.swing.JTextField();
        imrdb = new javax.swing.JRadioButton();
        modify = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        timelist = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        starttf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 11, 200, -1));

        jScrollPane1.setOpaque(false);

        eventta.setColumns(20);
        eventta.setRows(5);
        jScrollPane1.setViewportView(eventta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 69, 523, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/map.png"))); // NOI18N
        jLabel2.setText("PLACE :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 176, 147, -1));

        placetf.setOpaque(false);
        getContentPane().add(placetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 179, 163, 25));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel5.setText("END TIME     :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 244, 147, -1));

        endtf.setToolTipText("24 hours");
        endtf.setOpaque(false);
        getContentPane().add(endtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 245, 126, -1));

        imrdb.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        imrdb.setText("IMPORTANT");
        imrdb.setOpaque(false);
        getContentPane().add(imrdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 279, -1, 24));

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
        getContentPane().add(modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 309, -1, -1));

        delete.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 0, 51));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/delete1.png"))); // NOI18N
        delete.setText("DELETE");
        delete.setOpaque(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 311, 132, 39));

        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("✖\t");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, -1, 19));

        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/real-estate.png"))); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, 19));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/left-arrow.png"))); // NOI18N
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, 19));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/update1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 11, 41, 35));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/red-flag.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 279, -1, -1));

        timelist.setOpaque(false);
        timelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelistActionPerformed(evt);
            }
        });
        getContentPane().add(timelist, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 174, 23));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel7.setText("START TIME :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 214, 147, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel8.setText("START TIME : (24hrs format)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 23, 200, -1));

        starttf.setToolTipText("24 hours");
        starttf.setOpaque(false);
        getContentPane().add(starttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 215, 163, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/variousbackground1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new MODIFYEVENTMANAGER1().setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      String time=timelist.getSelectedItem().toString();
        int result = JOptionPane.showConfirmDialog(null,"Sure? You want to DELETE?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            
            String query = "DELETE FROM eventmanager WHERE date="+"\""+date+"\""+" && starttime="+"\""+time+"\""+";";
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
            
        } catch (Exception ex) {
            Logger.getLogger(DELETEDIARYENTRY.class.getName()).log(Level.SEVERE, null, ex);
        }
        timelist.removeAllItems();
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
             Statement stmt=con.createStatement();
                      String s="select starttime from eventmanager where date="+"\""+date+"\""+";";
                      ResultSet rs=stmt.executeQuery(s);
                       while(rs.next())
                      {
                      String time1=rs.getString(1);                    
                      timelist.addItem(time1);
                      }
                      rs.close();
                      
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
             Statement stmt=con.createStatement();
                      String s="select starttime from eventmanager where date="+"\""+date+"\""+";";
                      ResultSet rs=stmt.executeQuery(s);
                       while(rs.next())
                      {
                      String time=rs.getString(1);                    
                      timelist.addItem(time);
                      }
                      rs.close();
                      
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(timelist.getItemCount() == 0)
            
       
        {

    
         JOptionPane.showMessageDialog(null, "NO EVENT ON THIS PARTICULAR DATE");
       dispose();
          new MODIFYEVENTMANAGER1().setVisible(true);
        }

   
        
    }//GEN-LAST:event_formWindowOpened

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed

String time=timelist.getSelectedItem().toString();

        int result = JOptionPane.showConfirmDialog(null,"Sure? You want to MODIFY?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)


        { try {
            Class.forName("java.sql.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            String event=eventta.getText();
              String place=placetf.getText();
              String time1=starttf.getText();
              String end=endtf.getText();
            String s="Update eventmanager set event="+"\""+event+"\""+",place="+"\""+place+"\""+",starttime="+"\""+time1+"\""+",endtime="+"\""+end+"\""+"where date="+"\""+date+"\""+" && starttime="+"\""+time+"\""+";";
            int n=stmt.executeUpdate(s);
            System.out.println(n+"rows affected");con.close(); stmt.close();
            JOptionPane.showMessageDialog(rootPane, "Modification successfull!");
             } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Unsupported character(s) or unidentified logical error! ");
        }
        }
        
        timelist.removeAllItems();
          try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
             Statement stmt=con.createStatement();
                      String s="select starttime from eventmanager where date="+"\""+date+"\""+";";
                      ResultSet rs=stmt.executeQuery(s);
                       while(rs.next())
                      {
                       time=rs.getString(1);                    
                      timelist.addItem(time);
                      }
                      rs.close();
                      
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_modifyActionPerformed

    private void timelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelistActionPerformed
       if(timelist.getItemCount() != 0)
       { try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            
            String time=timelist.getSelectedItem().toString();
            String s="select * from eventmanager where date="+"\""+date+"\""+"&& starttime="+"\""+time+"\""+";";
            ResultSet rs=stmt.executeQuery(s);
             while(rs.next())
            {
                String event=rs.getString("event");
                String place=rs.getString("place");
                String starttime=rs.getString("starttime");
                String endtime=rs.getString("endtime");
                String important=rs.getString("important");
                eventta.setText(""+event);
                placetf.setText(""+place);
                endtf.setText(""+endtime);
                starttf.setText(""+starttime);
                if(important.equals("Yes"))
                    imrdb.setSelected(true);
               else
                    imrdb.setSelected(false);
            }
             con.close();
             rs.close();
             stmt.close();
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       }
    }//GEN-LAST:event_timelistActionPerformed

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
            java.util.logging.Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MODIFYEVENTMANAGER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JTextField endtf;
    private javax.swing.JTextArea eventta;
    private javax.swing.JRadioButton imrdb;
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
    private javax.swing.JTextField starttf;
    private javax.swing.JComboBox<String> timelist;
    // End of variables declaration//GEN-END:variables
}
