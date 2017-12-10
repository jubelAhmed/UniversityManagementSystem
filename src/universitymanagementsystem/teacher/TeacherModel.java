/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.teacher;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import universitymanagementsystem.Course;
import universitymanagementsystem.CourseModel;
import universitymanagementsystem.DatabaseModel;


public class TeacherModel {
    private static TeacherModel teacherModel;
    private Statement statement;
    private ResultSet resultSet;
    
    private TeacherModel() throws SQLException{
      DatabaseModel.getConnection();
      statement = DatabaseModel.connection.createStatement();
    }
    
    public static TeacherModel getInstance() throws SQLException{
        if(teacherModel == null){
            teacherModel = new TeacherModel();
        }
        return teacherModel;
    }
    
    public boolean addTeacher(Teacher t){
        
        String insert = "INSERT INTO `teacher` (`id`, `name`, `email`, `type`, `gender`, `depertmentName`, `salary`, `courseId`) VALUES ('"+t.getId()+
                "', '"+t.getName()+"', '"+t.getEmail()+"', '"+t.getType()+"', '"+t.getGender()+"', '"+t.getDepartmentName()+
                "', '"+t.getSalary()+"', 'null');";
       try {
           System.out.println("teacher added");///just for testing
           statement.execute(insert);
           return true;
       } catch (Exception e) {
           System.out.println("teacher added problem + "+ e);
           return false;
       }
    }
    public boolean addTeacher(Teacher t , Course c){
        
          System.out.println(c.getCourseId());
        String insert = "INSERT INTO `teacher` (`id`, `name`, `email`, `type`, `gender`, `depertmentName`, `salary`, `courseId`) VALUES ('"+t.getId()+
                "', '"+t.getName()+"', '"+t.getEmail()+"', '"+t.getType()+"', '"+t.getGender()+"', '"+t.getDepartmentName()+
                "', '"+t.getSalary()+"', '"+c.getCourseId()+"')";
        
       try {
           ///just testing
           statement.execute(insert);
           System.out.println("teacher added");
           return true;
       } catch (Exception e) {
           System.out.println("teacher added problem mainly + "+ e);
           return false;
       }
    }
    
    public LinkedList<Teacher> getTeacherList() throws SQLException{
           LinkedList<Teacher> teacherList = new LinkedList<>();
          CourseModel model = CourseModel.getInstance();
       try{
           String query = "Select * from teacher";
           try {
               resultSet = statement.executeQuery(query);
           } catch (SQLException ex) {
               System.err.println("teacher getting value problem");
           }
           while(resultSet.next()){
               String id = resultSet.getString("id");
               String name = resultSet.getString("name");
               String email = resultSet.getString("email");
               String type = resultSet.getString("type");
               String gender = resultSet.getString("gender");
               String depertmentName = resultSet.getString("depertmentName");
               double salary = resultSet.getDouble("salary");
              
               String courseId = resultSet.getString("courseId");
               System.out.println(courseId);
               Teacher teacher;
               boolean alreadyHaveStudent = false;
               for(Teacher t : teacherList){
                   if(t.getId().equals(id)){
                       t.addCourse(model.getCourse(courseId));
                       alreadyHaveStudent = true;
                       break;
                   }
               }
               if(!alreadyHaveStudent){
                     
                   teacher = new Teacher(id, name, email, type, gender, depertmentName,salary);
                   teacher.addCourse(model.getCourse(courseId));
                   teacherList.add(teacher);
               }
               
              
             
           }
       } catch (SQLException ex) {
            
            System.out.println("student query problem "+ex);
        }
       return teacherList;
    }
 
    public Teacher getTeacher(String id) throws SQLException{
        LinkedList<Teacher> teachers = getTeacherList();
        
        for(Teacher t : teachers){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
    
    public boolean addCourse(Teacher t,Course c) throws SQLException{
       
        
        return addTeacher(t,c);
         
       
    }
    
  
}