/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.teacher;

import java.util.LinkedList;
import universitymanagementsystem.Course;
import universitymanagementsystem.People;


public class Teacher extends People {
    
    private String departmentName;
    private double salary;
    private LinkedList<Course> courseList;
    
    public Teacher(String id, String name, String email, String type,String gender,String departmentName,double salary) {
        super(id, name, email, type,gender);
        courseList = new LinkedList<>();
        this.departmentName = departmentName;
        this.salary = salary;
    }
    
    public void addCourse(Course course){
        courseList.add(course);
    }
    public LinkedList<Course> getCourseList(){
        return courseList;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + "departmentName=" + departmentName + ", salary=" + salary + ", courseList=" + courseList + '}';
    }
    
}
