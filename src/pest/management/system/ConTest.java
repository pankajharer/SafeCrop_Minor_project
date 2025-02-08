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
public class ConTest {
    public static void main(String args[]){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/greenrevolution","admin","green");
    System.out.println("connected.");
}catch(Exception e){
    System.out.println(e);
}
}
}