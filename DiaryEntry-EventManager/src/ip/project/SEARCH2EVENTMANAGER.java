

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
public class SEARCH2EVENTMANAGER extends javax.swing.JFrame {

    /**
     * Creates new form SEARCH2EVENTMANAGER
     */
    public SEARCH2EVENTMANAGER() {
        initComponents();
    }
    public String date;
     public SEARCH2EVENTMANAGER(String a) {
        initComponents();
        date=a;
    }

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
        resultta = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        placetf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        starttf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        endtf = new javax.swing.JTextField();
        important1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timelist = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESULTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 11, 149, 47));

        jScrollPane1.setOpaque(false);

        resultta.setEditable(false);
        resultta.setColumns(20);
        resultta.setRows(5);
        jScrollPane1.setViewportView(resultta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 570, 119));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/map.png"))); // NOI18N
        jLabel2.setText("PLACE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 194, 93, 29));

        placetf.setEditable(false);
        placetf.setOpaque(false);
        getContentPane().add(placetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 198, 159, 25));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel3.setText("START TIME: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 26, -1, -1));

        starttf.setEditable(false);
        starttf.setToolTipText("24 hours");
        starttf.setOpaque(false);
        getContentPane().add(starttf, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 230, 159, 24));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel4.setText("END TIME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 230, 92, -1));

        endtf.setEditable(false);
        endtf.setToolTipText("24 hours");
        endtf.setOpaque(false);
        getContentPane().add(endtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 229, 152, 24));

        important1.setBackground(new java.awt.Color(255, 255, 255));
        important1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        important1.setForeground(new java.awt.Color(255, 255, 255));
        important1.setText("FLAGGED AS IMPORTANT");
        important1.setEnabled(false);
        important1.setOpaque(false);
        important1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                important1ActionPerformed(evt);
            }
        });
        getContentPane().add(important1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 24));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 265, 271, 65));

        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("✖\t");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 19));

        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/real-estate.png"))); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, 19));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/left-arrow.png"))); // NOI18N
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, 19));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/analysis.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 62, 47));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/flag.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 265, 43, -1));

        timelist.setOpaque(false);
        timelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timelistActionPerformed(evt);
            }
        });
        getContentPane().add(timelist, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 27, 222, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/clock1.png"))); // NOI18N
        jLabel8.setText("START TIME");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 118, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/variousbackground2.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 410));

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
        new SEARCHEVENTMANAGER().setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
                      rs.close();con.close();stmt.close();
                      
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(timelist.getItemCount() == 0)
        {
                     JOptionPane.showMessageDialog(null, "NO EVENT ON THIS PARTICULAR DATE");
  dispose();
        }       
    }//GEN-LAST:event_formWindowOpened

    private void important1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_important1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_important1ActionPerformed

    private void timelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timelistActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ipproject1","root","123456");
            Statement stmt=con.createStatement();
            String time=timelist.getSelectedItem().toString();
            String s="select * from eventmanager where date="+"\""+date+"\""+" && starttime="+"\""+time+"\""+";";
            ResultSet rs=stmt.executeQuery(s);
             while(rs.next())
            {
                String event=rs.getString("event");
                String place=rs.getString("place");
                String starttime=rs.getString("starttime");
                String endtime=rs.getString("endtime");
                String impor=rs.getString("important");
                resultta.setText(""+event);
                placetf.setText(""+place);
                starttf.setText(""+starttime);
                endtf.setText(""+endtime);
                if(impor.equals("Yes"))
                    important1.setSelected(true);
                else
                    important1.setSelected(false);
            }
             con.close();
             rs.close();
             stmt.close();
        } catch (Exception ex) {
            Logger.getLogger(MODIFYEVENTMANAGER.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(SEARCH2EVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEARCH2EVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEARCH2EVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEARCH2EVENTMANAGER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEARCH2EVENTMANAGER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField endtf;
    private javax.swing.JRadioButton important1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField placetf;
    private javax.swing.JTextArea resultta;
    private javax.swing.JTextField starttf;
    private javax.swing.JComboBox<String> timelist;
    // End of variables declaration//GEN-END:variables
}
