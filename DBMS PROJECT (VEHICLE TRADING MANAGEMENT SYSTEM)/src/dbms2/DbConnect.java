/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms2;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * 
 * @author lenovo
 */
public class DbConnect {
    
    static Connection conn =null;
    
    public static Connection javaDb()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn=DriverManager.getConnection("JDBC:mysql://localhost:3306/dbms_project?useTimezone=true&serverTimezone=UTC","root","");
            return conn;
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex+"ERROR IN CONNECTIVITY");
            return null;
        }
        
    }
    
    
}
