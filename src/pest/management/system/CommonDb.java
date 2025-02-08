/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pest.management.system;
import java.sql.*;
/**
 *
 * @author Manasi
 */
public class CommonDb {
    static Connection con;
    static String url ="jdbc:mysql://localhost:3306/greenrevolution";
    static String user= "root";
    static String pass ="";
   
    public static Connection getConnection(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("connected.");
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return con;
    }
    public static void main(String args[])
    {
        getConnection();
    }
 
}
