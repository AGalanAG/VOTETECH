/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author CECYT8
 */
public class Conectar {
    public Connection getConnection(){
        Connection cn = null;
        
        try{
             Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto?user=root&password=root");

        } catch(SQLException e){
            
            System.out.println("Error"+e.getMessage());
            
        } catch(Exception e1){
 
            System.out.println("Error"+e1.getMessage());
        }
        return cn;
    }
    
        public ResultSet Resultado() throws SQLException{
                Conectar con = new Conectar();
        Connection cnn = con.getConnection();
        Statement st;
        ResultSet rs=null;
        
        st = cnn.createStatement();
        rs =st.executeQuery("select * from voto");
        
        
        return rs;
    
}
}

