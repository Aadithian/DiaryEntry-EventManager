/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.project;
import javax.swing.JOptionPane;
/**
 *
 * @author admin
 */
public class EVENTMANAGERMAIN extends javax.swing.JFrame {

    /**
     * Creates new form EVENTMANAGERMAIN
     */
     
    public EVENTMANAGERMAIN() {
        initComponents();
        
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
        newbtn = new javax.swing.JButton();
        modifybtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("EVENT MANAGER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 333, 51));

        newbtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        newbtn.setForeground(new java.awt.Color(255, 153, 0));
        newbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/add.png"))); // NOI18N
        newbtn.setText("NEW");
        newbtn.setOpaque(false);
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });
        getContentPane().add(newbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 132, 117));

        modifybtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        modifybtn.setForeground(new java.awt.Color(0, 51, 153));
        modifybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/update1.png"))); // NOI18N
        modifybtn.setText("MODIFY");
        modifybtn.setOpaque(false);
        modifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybtnActionPerformed(evt);
            }
        });
        getContentPane().add(modifybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 125, 117));

        searchbtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(255, 0, 153));
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/seo.png"))); // NOI18N
        searchbtn.setText("SEARCH");
        searchbtn.setOpaque(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 117));

        deletebtn.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 0, 51));
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/delete1.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.setOpaque(false);
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 132, 117));

        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("???\t");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, 19));

        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/real-estate.png"))); // NOI18N
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, 19));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/upcoming (2).png"))); // NOI18N
        jButton3.setText("UPCOMING EVENT!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ip/project/background.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"CLOSE?", "",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION)
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
      new NEWEVENTMANAGER().setVisible(true);
      dispose();
    }//GEN-LAST:event_newbtnActionPerformed

    private void modifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybtnActionPerformed
       new MODIFYEVENTMANAGER1().setVisible(true);
      dispose();
    }//GEN-LAST:event_modifybtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        new SEARCHEVENTMANAGER().setVisible(true);
      dispose();
    }//GEN-LAST:event_searchbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
      new DELETEEVENTMANAGER().setVisible(true);
      dispose();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       new WELCOME().setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            new UPCOMINGEVENT().setVisible(true);
          dispose();
        
       

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EVENTMANAGERMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EVENTMANAGERMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EVENTMANAGERMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EVENTMANAGERMAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EVENTMANAGERMAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton modifybtn;
    private javax.swing.JButton newbtn;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
