
package universitymanagementsystem;

import java.util.LinkedList;
import java.util.UUID;
import universitymanagementsystem.student.Student;
import universitymanagementsystem.teacher.Teacher;


public class Course {
    private String courseId;
    private String courseName;
    private String courseCode;
    private double courseCredit;
    private LinkedList <Student> studentList;
    private LinkedList <Teacher> teacherList;

    public Course(String courseName, String courseCode, double courseCredit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit;
        UUID id = UUID.randomUUID();
        courseId = String.valueOf(id);
    }
    public Course(String courseId,String courseName, String courseCode, double courseCredit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCredit = courseCredit; 
        this.courseId = courseId;
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

    public String getCourseId() {
        return courseId;
    }

    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", courseCode=" + courseCode + ", courseCredit=" + courseCredit + ", studentList=" + studentList + ", teacherList=" + teacherList + '}';
    }
    
    
    
}
