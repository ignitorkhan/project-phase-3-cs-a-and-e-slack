/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slack;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import static slack.Slack.conn;
import static slack.Slack.obj;
import static slack.Login.user;
/**
 *
 * @author mac
 */
public class Workspace 
{
    private String name;
    private String password;
    private String creator;
    private String accesscode;
    private int id;
    ArrayList<String> users=new ArrayList<>();
    ArrayList<String> Privatechannels=new ArrayList<>();
    ArrayList<String> Publicchannels=new ArrayList<>();
    ArrayList<Chats> chats;
    
    Workspace(String n, String c,String p,String acode) throws SQLException //creates new workspace
    {
        name=n;
        password=p;
        creator=c;
        accesscode=acode;
        GetMembers();
       GetPrivateChannels();
       GetPublicChannels();
      id = obj.GetWorkspaceId(name);
    }
    
    Workspace(String n) throws SQLException
    {
        name =n;
        ResultSet rs = obj.GetWorkspaceDetails(n);
        if(rs.next())
        {
            creator = rs.getString("creator");
            password = rs.getString("password");
            id = rs.getInt("ID");
        }
        GetMembers();
        GetPrivateChannels();
        GetPublicChannels();
         id = obj.GetWorkspaceId(name);
    }
    void GetMembers() throws SQLException
    {
        ResultSet rs = obj.GetWorkspaceMembers(id);
        while(rs.next())
        {
            users.add(rs.getString("USERNAME"));
        }
       users.remove(user.getName());
    }
    
    void GetPrivateChannels() throws SQLException
    {
        ResultSet rs = obj.GetJoinedChannels(id, user.getName(), "private");
        while(rs.next())
        {
            Privatechannels.add(rs.getString("CHANNELNAME"));
            //channelType.add(rs.getString("Type"));
        }
        
    }
    
     void GetPublicChannels() throws SQLException
    {
        ResultSet rs = obj.GetJoinedChannels(id, user.getName(), "public");
        while(rs.next())
        {
            Publicchannels.add(rs.getString("CHANNELNAME"));
            //channelType.add(rs.getString("Type"));
        }
        
    }
    boolean createWorkspace() throws SQLException
    {
        return obj.createWorkspace(name, creator, password,accesscode);
    }
    
    void addUser(String a)
    {
        users.add(a);
    }
    
    ArrayList<String> getUsers() throws SQLException
    {
        if(users!=null)
            users.clear();
        GetMembers();
        return users;
    }
    
    ArrayList<String> getAllPublicChannels() throws SQLException
    {
        ResultSet rs = obj.GetAllPublicChannels(id);
        ArrayList<String> AllChannels = new ArrayList<>();
        while(rs.next())
        {
            AllChannels.add(rs.getString("CHANNELNAME"));
        }
        
        return AllChannels;
    }
    
    ArrayList<String> getPrivateChannels() throws SQLException
    {
        if(Privatechannels!=null)
            Privatechannels.clear();
        GetPrivateChannels();
        return Privatechannels;
    }
    
    ArrayList<String> getPublicChannels() throws SQLException
    {
        if(Publicchannels!=null)
            Publicchannels.clear();
        GetPublicChannels();
        return Publicchannels;
    }
    
    String getCreator()
    {
     return creator;   
    }
    
    String getName()
    {
     return name;   
    }
    
    int getId()
    {
        return id;
    }
}
