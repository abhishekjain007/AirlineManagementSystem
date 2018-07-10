/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhij
 */
import java.sql.*;
import javax.swing.JOptionPane;


public   class Javaconnect {
    public static final String DB_String="C:\\Users\\abhij\\OneDrive\\Documents\\NetBeansProjects\\AirlineManagementSystem\\FlightDB.sqlite";
    public static final String Connection_String="jdbc:sqlite:"+DB_String; 
    
    
private  static Connection con;
public static Connection getConnection()
{
    try{

        if(con==null)
        {
            Class.forName("org.sqlite.JDBC");
            con=  DriverManager.getConnection(Connection_String);
        }
        return con;
    }catch(Exception e){
    
       
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    
}
//     public static void main(String args[])
//     {
//     Connection conn=Javaconnect.getConnection();
//             }
   

}
