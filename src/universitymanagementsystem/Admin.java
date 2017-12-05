
package universitymanagementsystem;


public class Admin extends People{

     
     private String adminPassword;

    public Admin(String id, String name, String email, String type , String adminPassword) {
        super(id, name, email, type);
        this.adminPassword = adminPassword;
    }
  

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    

    
    
     
  
    
}
