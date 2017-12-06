
package universitymanagementsystem.testing;

import universitymanagementsystem.student.Student;
import universitymanagementsystem.admin.AdminMaintain;
import universitymanagementsystem.admin.LocalAdmin;
import java.util.LinkedList;
import universitymanagementsystem.teacher.Teacher;


public class Testing {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        LocalAdmin local = new LocalAdmin("12","jubel", "jubel@gmail.com", "local", "male","12345");
        
        LocalAdmin local1 = new LocalAdmin("12","jubel", "jubel@gmail.com", "local",  "male","12345");
        
        LocalAdmin local2 = new LocalAdmin("12","jubel", "jubel@gmail.com", "local",  "male","12345");
        
        AdminMaintain control = AdminMaintain.getInstance();
        
        control.addAdmin(local);
        
        control.addAdmin(local1);
        
        control.addAdmin(local2);
        
        LinkedList list = control.getLocalAdminList();
        System.out.println(list.toString()); 
        Student st = new Student("12", "jubel", "@gmail", "local","male", "swe", "2016", "summer");
        Teacher t = new Teacher("122", "jjjj", "email", "professor","male","swe",12331);
        System.out.println(t);
        System.out.println(st); 
       
    }
}
