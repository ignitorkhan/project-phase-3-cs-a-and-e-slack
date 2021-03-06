/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static slack.Login.user;
import static slack.MainMenu.wsp;
import static slack.Slack.obj;
import static slack.Slack.stack;
import static slack.MainMenu.color;
/**
 *
 * @author mac
 */
public class JoinWorkspace extends javax.swing.JFrame {

    /**
     * Creates new form JoinWorkspace
     */
    public JoinWorkspace() {
        initComponents();
        if(color != null){
            this.getContentPane().setBackground(color);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(70, 90, 160, 20);

        jButton1.setText("Accept");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 130, 60, 20);

        jButton2.setText("Reject");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 130, 60, 20);

        jTextField1.setText("Enter Access Code");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(60, 200, 180, 20);

        jButton3.setText("Join");
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 230, 51, 23);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/back-button.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 10, 40, 17);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/icons8-refresh-50.png"))); // NOI18N
        jButton5.setBorder(null);
        getContentPane().add(jButton5);
        jButton5.setBounds(270, 0, 51, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 0, 260, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(" ");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         if(!stack.empty())
        {
            this.dispose();
            JFrame a=stack.pop();
            a.setVisible(true);
           
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean check=false;
        
        String workspacename=(String)jComboBox1.getSelectedItem();
        Workspace w=null;
        try {
            w = new Workspace(workspacename);
        } catch (SQLException ex) {
            Logger.getLogger(JoinWorkspace.class.getName()).log(Level.SEVERE, null, ex);
        }
        String pass=null;
        while(pass==null)
         {
             pass=JOptionPane.showInputDialog(rootPane, "Create a password for this workspace");
             if("".equals(pass))
                 pass=null;
         }
        
        try {
                 check=w.addUser(user.getName(),workspacename,pass);
        } catch (SQLException ex) {
            Logger.getLogger(JoinWorkspace.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(check=true)
        {
            JOptionPane.showConfirmDialog(rootPane, "Workspace added");
        }
        else
        {
            JOptionPane.showConfirmDialog(rootPane, "Cannot Add Workspace");

        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        
        ArrayList<String> arr =new ArrayList<> ();
        ResultSet rs=null;
        try {
            rs=obj.getinvites(user.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(JoinWorkspace.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next())
            {
                try {
                    jComboBox1.addItem(rs.getString("WSNAME"));
                } catch (SQLException ex) {
                    Logger.getLogger(JoinWorkspace.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (SQLException ex) {           
            Logger.getLogger(JoinWorkspace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JoinWorkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinWorkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinWorkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinWorkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinWorkspace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
