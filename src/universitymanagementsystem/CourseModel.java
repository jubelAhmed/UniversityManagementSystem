/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class CourseModel {
    
    private static CourseModel courseModel;
    private Statement statement;
    private ResultSet resultSet;
    
    private CourseModel() throws SQLException{
      DatabaseModel.getConnection();
      statement = DatabaseModel.connection.createStatement();
    }
    
    public static CourseModel getInstance() throws SQLException{
        if(courseModel == null){
            courseModel = new CourseModel();
        }
        return courseModel;
    }
    
    public boolean addCourse(Course c){
           String insert = "INSERT INTO `course` (`courseId`, `courseName`, `courseCode`, `courseCredit`) VALUES ('"+c.getCourseId()+"', '"+c.getCourseName()+"', '"+c.getCourseCode()+
                   "', '"+c.getCourseCredit()+"');";
       try {
           System.out.println("course added");///just testing
           statement.execute(insert);
           return true;
       } catch (Exception e) {
           System.out.println("course added problem + "+ e);
           return false;
       }
    }
    
   public LinkedList<Course> getCourseList(){
       LinkedList<Course> courseList = new LinkedList<>();
       
       try{
           String query = "Select * from course";
           try {
               resultSet = statement.executeQuery(query);
           } catch (SQLException ex) {
               System.err.println("Course list getting problem "+ex);
           }
           while(resultSet.next()){
               String courseid = resultSet.getString("courseId");
               String courseName = resultSet.getString("courseName");
               String courseCode = resultSet.getString("courseCode");
               double courseCredit = resultSet.getDouble("courseCredit");
              
               Course course;
              
               course = new Course(courseid, courseName, courseCode, courseCredit);
            
               courseList.add(course);
               
           }
       } catch (SQLException ex) {
            
            System.out.println("course query proble "+ex);
        }
       return courseList;
   }
   
   public Course getCourse(String courseName){
       LinkedList<Course> courseList = getCourseList();
       
       for(Course  c : courseList){
           if(c.getCourseName().equals(courseName)){
               return c;
           }
       }
       return null;
   }
   
   
}
