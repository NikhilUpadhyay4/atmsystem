/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asimulatorsystem;
import java.sql.*;
/**
 *
 * @author Nikhil
 */
public class connect {
    
    Connection c;
    Statement s;
    public connect(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql:///project1","root","");
        s = c.createStatement();
    }catch(Exception ex){
    ex.printStackTrace();
    }
    }
    
}
