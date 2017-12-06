
package universitymanagementsystem.student;

import java.util.LinkedList;
import universitymanagementsystem.Course;
import universitymanagementsystem.People;


public class Student extends People{
    private String deprtmentName;
    private String admissionYear;
    private String admissionSemister;
    private LinkedList<Course> courseList;

    public Student(String id, String name, String email, String type,String gender,String deprtmentName,
            String admissionYear, String admissionSemister) {
        super(id, name, email, type,gender);
        this.deprtmentName = deprtmentName;
        this.admissionYear = admissionYear;
        this.admissionSemister = admissionSemister;
        courseList = new LinkedList<>();
       
    }
    public void addCourse(Course course){
        courseList.add(course);
    }
    
    public LinkedList<Course> getCourseList(){
        return courseList;
    }
    
    public String getDeprtmentName() {
        return deprtmentName;
    }

    public void setDeprtmentName(String deprtmentName) {
        this.deprtmentName = deprtmentName;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getAdmissionSemister() {
        return admissionSemister;
    }

    public void setAdmissionSemister(String admissionSemister) {
        this.admissionSemister = admissionSemister;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString() +" deprtmentName=" + deprtmentName + ", admissionYear=" + admissionYear 
                + ", admissionSemister=" + admissionSemister + ", courselist="+courseList+ '}';
    }

    
   
    
}
  