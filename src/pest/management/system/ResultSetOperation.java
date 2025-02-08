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
public class ResultSetOperation {
    
    public static void main(String args[]){
        Connection con = CommonDb.getConnection();
        try{
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product_detail");
            
            String pest;
            
            while(rs.next()){
                pest = rs.getString("pest_name");
               if(rs.getString("pest_name").equalsIgnoreCase("tomato leaf miner")){
                   System.out.println("Found");
               }
            }
            
        }catch(Exception e){
            
        }
    }
    
}
