
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcs
 */
public class DBC {
   
    public static Connection c;
    
    static {
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/lanka_central_bank";
            String un = "root";
            String pw = "kalana@123";
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/lanka_central_bank?useSSL=false", un, pw);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public static void iud(String query) throws Exception{
    
        Statement s = c.createStatement();
        s.executeUpdate(query);
        
    }
    
    public static ResultSet search(String query) throws Exception{
    
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery(query);
        return rs;
        
    }
    
}
