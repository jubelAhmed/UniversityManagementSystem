/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import universitymanagementsystem.DatabaseModel;


public class AdminModel {
    private static AdminModel adminModel;
    private Statement statement;
    private ResultSet resultSet;
   private AdminModel() throws SQLException{
      DatabaseModel.getConnection();
      statement = DatabaseModel.connection.createStatement();
   }
   
   public static AdminModel getInstancModel() throws SQLException{
       if(adminModel == null){
           adminModel = new AdminModel();
       }
       return adminModel;
   }
   
   public void addAdmin(Admin admin){
       
       //String insert2 = "INSERT into admin (id,name,email,password,color) values('"+id+"','"+name+"','"+email+"','"+password+"','"+color+"')";
      // String insert = "INSERT into admin (id,name,email,type,gender,password) values('"+admin.getId()+"','"+admin.getName()+"','"+admin.getEmail()+"','"+admin.getType()+"','"+admin.getGender()+"'+'"+admin.getAdminPassword()+"')";
       String insert = "INSERT INTO `admin` (`id`, `name`, `email`, `type`, `gender`, `password`) VALUES ('"+admin.getId()+"', '"+
               admin.getName()+"', '"+admin.getEmail()+"', '"+admin.getType()+"', '"+admin.getGender()+"', '"+admin.getAdminPassword()+"')";
       try {
           System.out.println("jubel ahmed");///just testing
           statement.execute(insert);
       } catch (Exception e) {
           System.out.println("first + "+ e);
       }
   }
    
   
   public LinkedList<Admin> getAdminList(){
       LinkedList<Admin> adminList = new LinkedList<>();
       
       try{
           String query = "Select * from admin";
           try {
               resultSet = statement.executeQuery(query);
           } catch (SQLException ex) {
               Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
           }
           while(resultSet.next()){
               String id = resultSet.getString("id");
               String name = resultSet.getString("name");
               String email = resultSet.getString("email");
               String type = resultSet.getString("type");
               String gender = resultSet.getString("gender");
               String password = resultSet.getString("password");
               Admin admin;
               if(type.equals("local" ) || type.equals("Local")){
                   admin = new LocalAdmin(id, name, email, type, gender, password);
               }
               else{
                   admin = new MainAdmin(id, name, email, type, gender, password);
               }
               adminList.add(admin);
               
           }
       } catch (SQLException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("admin query proble "+ex);
        }
       return adminList;
   }
   
   
   public boolean checkAccount(String email,String password){
        LinkedList<Admin> adminList = adminModel.getAdminList();
        for(Admin admin : adminList){
            if(admin.getEmail().equals(email) && admin.getAdminPassword().equals(password)){
                return true;
            }
        }
        
        return false;
       
   }
   
  
}
