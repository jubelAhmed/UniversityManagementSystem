/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem;

import java.util.LinkedList;


public class CourseMaintain {
    
    private LinkedList<Course> courseList;
    
    public CourseMaintain(){
        courseList = new LinkedList<>();
    }
    
    public void addCourse(Course c){
        courseList.add(c);
    }
    
     public void addCourse(Course c1,Course c2){
        courseList.add(c1);
        courseList.add(c2);
    }
    
    public Course getCourse(String id){
        for(Course c : courseList){
            c.getCourseId().equals(id);
            return c;
        }
        return null;
    }
    
    public LinkedList<Course> getCourseList(){
        return courseList;
    }

    @Override
    public String toString() {
        return "CourseMaintain{" + "courseList=" + courseList + '}';
    }
    
    
    
    
}
