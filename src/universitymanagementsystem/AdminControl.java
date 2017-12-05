
package universitymanagementsystem;

import java.util.LinkedList;


public class AdminControl {
    
    private static AdminControl adminControl;
    
    public LinkedList<Admin> adminList;
    
    private AdminControl(){
        adminList = new LinkedList<>();
    }
    
    public static AdminControl getInstance(){
        if(adminControl == null){
            adminControl = new AdminControl();
        }
        return adminControl;
    }  
     
}
