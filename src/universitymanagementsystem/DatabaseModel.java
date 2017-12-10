/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DatabaseModel {
    
    private static DatabaseModel databaseModel;
    public static Connection connection;

    
    private DatabaseModel(){
        try {
                
                Class.forName("com.mysql.jdbc.Driver");
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system","root","");
                   
            } catch (Exception e) {
                System.out.println("Error : jjjj    "+e);
            }
    }
    
    public static DatabaseModel getConnection(){
        if(databaseModel == null){
            databaseModel = new DatabaseModel();
        }
        return databaseModel;
    }
    
    
    
    
}
