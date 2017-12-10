
package universitymanagementsystem.admin;

import universitymanagementsystem.People;

public class Admin extends People{

    private String adminPassword;
   
    public Admin(String id, String name, String email, String type ,String gender , String adminPassword) {
        super(id, name, email, type,gender);
        this.adminPassword = adminPassword;
    }
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    
    public String getAdminPassword() {
        return adminPassword;
    } 
    
    //this is admin panel who maintain all of things in this project
   
    
    @Override
    public String toString() {
        return "Admin{" + super.toString() +" adminPassword=" + adminPassword + '}';
    }
    
    
}

