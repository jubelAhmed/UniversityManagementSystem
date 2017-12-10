
package universitymanagementsystem.testing;

import java.sql.SQLException;
import universitymanagementsystem.student.Student;
import universitymanagementsystem.admin.AdminMaintain;
import universitymanagementsystem.admin.LocalAdmin;
import java.util.LinkedList;
import java.util.UUID;
import universitymanagementsystem.Course;
import universitymanagementsystem.CourseMaintain;
import universitymanagementsystem.CourseModel;
import universitymanagementsystem.admin.AdminModel;
import universitymanagementsystem.student.StudentModel;
import universitymanagementsystem.teacher.Teacher;
import universitymanagementsystem.teacher.TeacherModel;


public class Testing {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
      
      
        Teacher t = new Teacher("222", "jjjj", "email", "professor","male","swe",12331);
        Course c = new Course("123", "swe433", 3.5);
    
        CourseModel cmodel = CourseModel.getInstance();
       
        Course d = cmodel.getCourse("math");
        
        TeacherModel tm = TeacherModel.getInstance();
        
        tm.addTeacher(t, d);
        
    
        
       
    }
}
