/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import static slack.Login.user;
import static slack.Slack.stack;
import javax.swing.JOptionPane;


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
    public static Color color;
    private Slack obj;
    public MainMenu(Slack a) {
        obj=a;
        initComponents();
        red.setVisible(false);
        blue.setVisible(false);
        yellow.setVisible(false);
        orange.setVisible(false);
        green.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        orange = new javax.swing.JButton();
        red = new javax.swing.JButton();
        yellow = new javax.swing.JButton();
        blue = new javax.swing.JButton();
        green = new javax.swing.JButton();

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
        jComboBox1.setBounds(60, 90, 190, 28);

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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(-20, 0, 90, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 250, 284);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/icons8-refresh-50.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(250, 0, 97, 60);

        update.setText("Update Profile");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(190, 250, 130, 28);

        jButton6.setText("Settings");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 310, 140, 28);

        orange.setBackground(new java.awt.Color(255, 102, 0));
        orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orangeMouseClicked(evt);
            }
        });
        getContentPane().add(orange);
        orange.setBounds(310, 320, 30, 25);

        red.setBackground(new java.awt.Color(255, 0, 0));
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redMouseClicked(evt);
            }
        });
        getContentPane().add(red);
        red.setBounds(190, 320, 30, 25);

        yellow.setBackground(new java.awt.Color(255, 255, 0));
        yellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yellowMouseClicked(evt);
            }
        });
        getContentPane().add(yellow);
        yellow.setBounds(220, 320, 30, 25);

        blue.setBackground(new java.awt.Color(102, 102, 255));
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueMouseClicked(evt);
            }
        });
        getContentPane().add(blue);
        blue.setBounds(250, 320, 30, 25);

        green.setBackground(new java.awt.Color(0, 204, 51));
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                greenMouseClicked(evt);
            }
        });
        getContentPane().add(green);
        green.setBounds(280, 320, 30, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         
         String Wname=null;
         boolean flag=false;
         String pass=null;
         String acode=null;
         
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
         
         while(acode==null)
         {
             acode=JOptionPane.showInputDialog(rootPane, "Create an access code for this workspace");
             if("".equals(pass))
                 acode=null;
         }
         
         
         int x=JOptionPane.showConfirmDialog(null, "Do you accept the License agreement?","License Agreement",JOptionPane.YES_NO_OPTION);
       
         
         
         if(x==0)
         {
             Workspace ws=null;
             try {
                 ws = new Workspace(Wname,user.getName(),pass,acode);
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
                {
                    JOptionPane.showMessageDialog(rootPane, "Invitation Sent !");
                     Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("crickethowzat7@gmail.com","howzathowzat");
				}
			});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("crickethowzat7@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(name));
			message.setSubject("Invitation to Slack");
			message.setText("Dear "+ name +
					"You have been invited to Workspace : "+wsp.getName()+" by : "+wsp.getCreator());

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
                }
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
            try {
                wsp=new Workspace(CurrentWorkspace);
            } catch (SQLException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            stack.add(this);
                    
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jComboBox1.removeAllItems();
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(!stack.empty())
        {
            this.dispose();
            JFrame a=stack.pop();
            a.setVisible(true);
           
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        UpdateProfile p = new UpdateProfile(user);
        p.setSize(600, 500);
        p.setTitle("Update Profile");
        this.setVisible(false);
        p.setVisible(true);
    }//GEN-LAST:event_updateMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        //this.getContentPane().setBackground(Color.yellow);
        red.setVisible(true);
        blue.setVisible(true);
        yellow.setVisible(true);
        orange.setVisible(true);
        green.setVisible(true);
        
    }//GEN-LAST:event_jButton6MouseClicked
    public void changeBackground(Color r){
        //JOptionPane.showMessageDialog(null,stack.size());
        ArrayList<JFrame> f= new ArrayList();
        int i = 0;
        while(!stack.empty()){
            //JOptionPane.showMessageDialog(null, "in");
            f.add(stack.pop());
        }
        JFrame p = new JFrame();
        for(i = f.size()-1;i>=0;i++){
            p = f.get(i);
            p.getContentPane().setBackground(r);
            stack.push(p);
        }
        
    }
    private void redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseClicked
        Color r = Color.red;
        this.getContentPane().setBackground(r);
        color = r;
        changeBackground(r);
    }//GEN-LAST:event_redMouseClicked

    private void yellowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yellowMouseClicked
        this.getContentPane().setBackground(Color.YELLOW);
        color = Color.yellow;
        changeBackground(color);
    }//GEN-LAST:event_yellowMouseClicked

    private void blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueMouseClicked
        this.getContentPane().setBackground(Color.BLUE);
        color = Color.blue;
        changeBackground(color);
    }//GEN-LAST:event_blueMouseClicked

    private void greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenMouseClicked
        this.getContentPane().setBackground(Color.GREEN);
        color = Color.green;
        changeBackground(color);
    }//GEN-LAST:event_greenMouseClicked

    private void orangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orangeMouseClicked
        this.getContentPane().setBackground(Color.ORANGE);
        color = Color.ORANGE;
        changeBackground(color);
    }//GEN-LAST:event_orangeMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blue;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton green;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton orange;
    private javax.swing.JButton red;
    private javax.swing.JButton update;
    private javax.swing.JButton yellow;
    // End of variables declaration//GEN-END:variables
}
