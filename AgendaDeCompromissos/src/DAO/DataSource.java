/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rizzadinha
 */
public class DataSource {
    
    private Connection conn;
    
   
    public DataSource() {
        
        try {
            
            String url = "jdbc:sqlite:BD.db";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("ok");
                     
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }    
      
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    
    
    public void closeDataSource(){
        
        try{      
            conn.close();
            
        }catch(Exception e){
            System.out.println( e.getMessage());
        }
           
    }
    
    
    
    
    
}
