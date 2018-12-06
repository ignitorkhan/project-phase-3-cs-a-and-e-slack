/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static slack.Slack.obj;
import static slack.Slack.stack;

/**
 *
 * @author mac
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form SIGHUP
     */
    
    public Signup() {
        
        this.setVisible(true);
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

        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 90, 230, 26);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(50, 150, 230, 26);

        jLabel2.setText("Welcome to Slack Singup");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 10, 170, 16);

        jButton1.setText("Signup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 260, 87, 29);

        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 86, 45, 30);

        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 34, 30);

        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 210, 60, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(60, 210, 220, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 260, 240);

        jLabel6.setText("Already a user? ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 300, 110, 20);

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 300, 80, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 280, 140, 0);

        jLabel8.setText(" ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 270, 140, 16);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/back-button.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 10, 80, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        stack.add(this);
        Login s=new Login();
        s.setTitle("Login");
        stack.add(s);
        s.setLocation(400,150);
            s.setSize(320,350);
            s.setVisible(true);
           s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String n=jTextField1.getText();
        String e=jTextField2.getText();
        String p=jPasswordField1.getText();
        
        User a=null;
        try {
            a = new User(e,p);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean isSignup=false;
        try {
            isSignup=a.Signup(n);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(isSignup==true)
        {
           
         Login s=new Login();
        s.setLocation(400,150);
            s.setSize(320,350);
            s.setVisible(true);
           s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
           
        }
        else
        {
           JOptionPane.showMessageDialog(rootPane, "Signup Failed !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!stack.empty())
        {
            this.dispose();
            JFrame a=stack.pop();
            a.setVisible(true);
           
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
