/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static slack.Login.user;
import static slack.Slack.stack;


/**
 *
 * @author mac
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public static String CurrentWorkspace=null;
    public static Workspace wsp=null;
    
    private Slack obj;
    public MainMenu(Slack a) {
        obj=a;
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
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Main Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 0, 98, 16);

        jButton1.setText("Create Workspace");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 280, 140, 29);

        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(60, 90, 190, 29);

        jLabel3.setText("Select a Workspace");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 60, 140, 16);

        jButton2.setText("Join a Workspace");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 280, 130, 30);

        jButton3.setText("Open");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 130, 97, 29);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/back-button.png"))); // NOI18N
        jButton4.setBorder(null);
        getContentPane().add(jButton4);
        jButton4.setBounds(-20, 0, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 250, 284);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         
         String Wname=null;
         boolean flag=false;
         String pass=null;
         
         while(Wname==null)
         {
             Wname=JOptionPane.showInputDialog(rootPane, "Please input the name of workspace");
             if("".equals(Wname))
                 Wname=null;
         }
         
         while(pass==null)
         {
             pass=JOptionPane.showInputDialog(rootPane, "Create a password for this workspace");
             if("".equals(pass))
                 pass=null;
         }
         
         int x=JOptionPane.showConfirmDialog(null, "Do you accept the License agreement?","License Agreement",JOptionPane.YES_NO_OPTION);
       
         
         
         if(x==0)
         {
             Workspace ws=null;
             try {
                 ws = new Workspace(Wname,user.getName(),pass);
             } catch (SQLException ex) {
                 Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
             }
             try {
                 flag=ws.createWorkspace();
             } catch (SQLException ex) {
                 Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
             }
        
        if(flag==true)
        {
            JOptionPane.showMessageDialog(rootPane, "Your Workspace : "+Wname+", has been created" );
            
            
            int yes=JOptionPane.showConfirmDialog(null, "Would you like to invite users?","Invite Users",JOptionPane.YES_NO_OPTION);
            
            String name=null;
            if(yes==0)
            {
                while(name==null)
                {
                    name=JOptionPane.showInputDialog(rootPane, "Add email to onvite user");
                }
                
                boolean f=false;
                
                try {
                    f=obj.SendInvite(obj.IDbyName(Wname),Wname,name);
                } catch (SQLException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(f==true)
                    JOptionPane.showMessageDialog(rootPane, "Invitation Sent !");
                else
                    JOptionPane.showMessageDialog(rootPane, "Invalid Email !");
            }
            
        }
        else
        {
                  JOptionPane.showMessageDialog(rootPane, "An error occurred, retry later" );
        }
        }
         else
         {
             JOptionPane.showMessageDialog(rootPane, "You need to accept License in order to process, try again");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        ArrayList<String> arr =null;
        try {
            arr = user.myWorkspace();
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            for (int i = 0; i < arr.size(); i++) 
            {
            jComboBox1.addItem(arr.get(i));
            }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String wname=(String)jComboBox1.getSelectedItem();
         CurrentWorkspace=wname;
         String pass=null;
         boolean flag=false;
         while(pass==null)
         {
             pass=JOptionPane.showInputDialog(rootPane, "Enter password for this workspace");
         }
         
        try {
           flag= obj.WSLogin(CurrentWorkspace, user.getName(), pass);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        if(flag==true)
        {
         WSpace mainFrame=new WSpace();
            mainFrame.setTitle(wname);
            mainFrame.setLocation(400,150);
            mainFrame.setSize(320,350);
            mainFrame.setVisible(true);
            
            this.setVisible(false);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Incorrect password");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            stack.add(this);
            JoinWorkspace mainFrame=new JoinWorkspace();
            mainFrame.setTitle("Join a Workspace");
            mainFrame.setLocation(400,150);
            mainFrame.setSize(320,350);
            mainFrame.setVisible(true);

            this.setVisible(false);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
