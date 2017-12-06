
package universitymanagementsystem.admin;

import java.util.LinkedList;
import java.util.ListIterator;

public class AdminMaintain {
    
    private static AdminMaintain adminControl;
    
    private LinkedList<LocalAdmin> localAdminList;
    
    private LinkedList<MainAdmin> mainAdminList;
    
    private AdminMaintain(){
        
        localAdminList = new LinkedList<>();
        mainAdminList = new LinkedList<>();
    }
    
    public static AdminMaintain getInstance(){
        if(adminControl == null){
            adminControl = new AdminMaintain();
        }
        return adminControl;
    } 
    
    public void addAdmin(LocalAdmin localAdmin){
        localAdminList.add(localAdmin);
    }
    
    public void addAdmin(MainAdmin mainAdmin){
        mainAdminList.add(mainAdmin);
    }
    
    public LocalAdmin getLocalAdmin(String id){
        ListIterator list = localAdminList.listIterator();
        while(list.hasNext()){
            LocalAdmin local = (LocalAdmin) list.next();
            if(local.getId().equals(id)){
                return local;
            }
                
        }
        return null;
    }
    
    public LinkedList<LocalAdmin> getLocalAdminList(){
        return localAdminList;
    }
    
    public MainAdmin getMainAdmin(String id){
        ListIterator list = mainAdminList.listIterator();
        while(list.hasNext()){
            MainAdmin mainAdmin = (MainAdmin)list.next();
            if(mainAdmin.getId().equals(id)){
                return mainAdmin;
            }
        }
        return null;
    }
    
    public LinkedList<MainAdmin> getMainAdminList(){  
        return mainAdminList;       
    }
     
}
