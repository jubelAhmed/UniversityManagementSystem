
package universitymanagementsystem.admin;

import java.util.LinkedList;
import java.util.ListIterator;

public class AdminMaintain {

    private static AdminMaintain adminControl;

    private LinkedList<Admin> adminList;

    
    

    private AdminMaintain(){

       adminList = new LinkedList<>();
       
    }

    public static AdminMaintain getInstance(){
        if(adminControl == null){
            adminControl = new AdminMaintain();
        }
        return adminControl;
    }

    public void addAdmin(Admin admin){
        adminList.add(admin);
    }

    
    public LocalAdmin getAdmin(String id){
        ListIterator list = adminList.listIterator();
        while(list.hasNext()){
            LocalAdmin local = (LocalAdmin) list.next();
            if(local.getId().equals(id)){
                return local;
            }

        }
        return null;
    }

    public LinkedList<Admin> getAdminList(){
        return adminList;
    }

  
     

    @Override
    public String toString() {
        return "AdminMaintain{" + "adminList=" + adminList + '}';
    }



}
