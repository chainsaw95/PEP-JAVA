/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

//import com.mysql.jdbc.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abhinav
 */
public class JDBCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try
       {
       Class.forName("com.mysql.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
      Statement stmt=conn.createStatement();
      ResultSet rs=stmt.executeQuery("Select * from Student");
      while(rs.next())
               System.out.println(rs.getString("Roll_no")+" "+rs.getString("Name"));
       } catch (Exception ex) {
            Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
