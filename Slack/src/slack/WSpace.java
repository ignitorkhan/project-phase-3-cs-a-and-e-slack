/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static slack.Login.user;
import static slack.MainMenu.CurrentWorkspace;
import static slack.MainMenu.color;
import static slack.Slack.obj;

import static slack.MainMenu.wsp;

import static slack.Slack.stack;
import static slack.Slack.obj;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;

/**
 *
 * @author mac
 */
public class WSpace extends javax.swing.JFrame {

    /**
     * Creates new form WSpace
     */
    public static String CurrentChat;
    public static String CurrentChannel;
    //public static String CurrentUser;
    public WSpace() 
    {
        CurrentChannel = " ";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N

        jLabel5.setText("jLabel5");

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
        jComboBox1.setBounds(0, 60, 80, 80);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Private Chat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 40, 80, 16);

        jButton1.setText("Open");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 140, 80, 29);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Channel Chat");
        jLabel4.setAlignmentY(0.0F);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 180, 80, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Private" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(0, 200, 80, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/back-button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, -1, 80, 40);

        jButton4.setText("Open");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 280, 80, 30);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 0, 45, 16);

        jButton5.setText("My files");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(220, 190, 100, 40);

        jButton7.setText("Invite User");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(215, 240, 110, 29);

        jButton6.setText("Add Channel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(217, 270, 110, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slack/Slack_Icon.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 320, 270);

        jButton9.setText("Show Activity");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(210, 320, 180, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            ArrayList<String> arr =null;
            Workspace ws=null;
            arr = wsp.getUsers();
             
            for (int i = 0; i < arr.size(); i++)
            {
                jComboBox1.addItem(arr.get(i));
            }
             jComboBox2.removeAllItems();
            jComboBox2.addItem("public");
            jComboBox2.addItem("private");
//            arr.clear();
//            jComboBox2.removeAllItems();
//            arr = ws.getChannels();
//            for (int i = 0; i < arr.size(); i++) 
//            {
//                jComboBox2.addItem(arr.get(i));
//            }
        } catch (SQLException ex) {
            Logger.getLogger(WSpace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CurrentChat=(String)jComboBox1.getSelectedItem();
        stack.add(this);
        PmFrame mainFrame=new PmFrame(user.getName(), CurrentChat);
            mainFrame.setTitle("DirectMessage");
            mainFrame.setLocation(400,150);
            mainFrame.setSize(320,350);
            mainFrame.setVisible(true);
            
            this.setVisible(false);
            this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

//    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
//        //jComboBox2.removeAllItems();
//       
//    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       if(!stack.empty())
        {
            this.dispose();
            JFrame a=stack.pop();
            a.setVisible(true);
           
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        String option = (String)jComboBox2.getSelectedItem();
        
        try {
            Workspace  ws = new Workspace(CurrentWorkspace);
             if(CurrentChannel.equals(" "))
             {
                  ArrayList<String> arr =null;


                   

                 jComboBox2.removeAllItems();
                 if(option.equals("public"))
                    arr = wsp.getPublicChannels();
                   
                 else if(option.equals("private"))
                    arr = wsp.getPrivateChannels();
                 
                 for (int i = 0; i < arr.size(); i++) 
                        jComboBox2.addItem(arr.get(i));     
                 CurrentChannel = option;
             }
             else
             {  
                 stack.add(this);
                 CurrentChannel = option;

                 {  ChannelFrame mainFrame=new ChannelFrame(user.getName(),CurrentChannel, ws.getId());
                 mainFrame.setTitle("Channel");
                mainFrame.setLocation(400,150);
                mainFrame.setSize(320,350);
                mainFrame.setVisible(true);
            
                this.setVisible(false);
                this.dispose();
                }
             }
             //String type = getType(option);
//        
        }catch (SQLException ex) {
                 Logger.getLogger(WSpace.class.getName()).log(Level.SEVERE, null, ex);
                      
      }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                stack.add(this);

                fileframe f=new fileframe();
                f.setTitle(CurrentWorkspace);
                f.setLocation(400,150);
                f.setSize(320,350);
                f.setVisible(true);

                this.setVisible(false);
                this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        if(wsp.getCreator().equals(user.getName()))
        {
            String name=null;
                while(name==null)
                {
                    name=JOptionPane.showInputDialog(rootPane, "Add email to invite user");
                }
                
                boolean f=false;
                
                try {
                    f=obj.SendInvite(obj.IDbyName(wsp.getName()),wsp.getName(),name);
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
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Youre not an admin");
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        AddChannelFrame mainFrame=new AddChannelFrame();
        mainFrame.setTitle("Channel");
        mainFrame.setLocation(400,150);
        mainFrame.setSize(320,350);
        mainFrame.setVisible(true);
        
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButton6ActionPerformed


    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        ArrayList<String> notif = new ArrayList();
        try {
            notif = wsp.getNotif();
        } catch (SQLException ex) {
            Logger.getLogger(WSpace.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        ArrayList<String> revNotif = new ArrayList();
        for(int i=notif.size()-1;i>=0;i--){
            revNotif.add(notif.get(i));
        }
        String b;
        int s = revNotif.size();
        JLabel[] a = new JLabel[s];
        for(int i=0;i<s;i++){
            a[i] = new JLabel();
        }
        int yPos = 50;
        int y;
        JFrame n = new JFrame();
        n.setLayout(new GridLayout(5,1));
        for(int i = 0;i<s;i++){
            b = revNotif.get(i);
            y = i + 1;
            a[i].setText(y + ". " + b);
            n.add(a[i]);
            n.setLocation(10, yPos);
            yPos += 20;
            n.setLocation(400,200);
            n.setSize(320,350);
            n.setVisible(true);
            System.out.println(b);
        }
    }//GEN-LAST:event_jButton9MouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
