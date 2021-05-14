/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbmhms2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Group 33
 */
public class Db {
    
 
    static Connection conn = null;
    
    
    public static Connection openConnection(){
        
        if (conn != null) return conn;
        
        String database = "hms1";
        String Username = "root";
        String password = "";
        
        return openConnection(database, Username, password);
    }
    
    private static Connection openConnection(String databaseName, String Username, String password){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName + "?user=" + Username + "&password=" + password);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return conn;
    }
    
}
