
package universitymanagementsystem;

import java.util.LinkedList;
import universitymanagementsystem.student.Student;
import universitymanagementsystem.teacher.Teacher;


public class Course {
    private String courseId;
    private String courseName;
    private String courseCode;
    private double courseCredit;
    private LinkedList <Student> studentList;
    private LinkedList <Teacher> teacherList;

    public Course(String courseId, String courseName, String courseCode, double courseCredit) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
    }
    
    public void addStudent(Student student){
        studentList.add(student);
    }
    
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
    
    public LinkedList<Student> getStudentList(){
        return studentList;
    }
    
    public LinkedList<Teacher> getTeacherList(){
        return teacherList;
    }
}
