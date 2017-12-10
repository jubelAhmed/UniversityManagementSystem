/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import universitymanagementsystem.Course;
import universitymanagementsystem.CourseModel;
import universitymanagementsystem.DatabaseModel;


public class StudentModel {
    private static StudentModel studentModel;
    private Statement statement;
    private ResultSet resultSet;
    
    private StudentModel() throws SQLException{
      DatabaseModel.getConnection();
      statement = DatabaseModel.connection.createStatement();
    }
    
    public static StudentModel getInstance() throws SQLException{
        if(studentModel == null){
            studentModel = new StudentModel();
        }
        return studentModel;
    }
    
    public void addStudent(Student st){
        
        String insert = "INSERT INTO `student` (`studentId`, `name`, `email`, `type`, `gender`, `depertmentName`, `admissionYear`, `admissionSemister`, `courseId`) VALUES ('"+st.getId()+
                "','"+st.getName()+"', '"+st.getEmail()+"', '"+st.getType()+"', '"+st.getGender()+"', '"+st.getDeprtmentName()+"', '"+st.getAdmissionYear()+"', '"+
                st.getAdmissionSemister()+"', 'null')";
       try {
           System.out.println("student added");///just testing
           statement.execute(insert);
       } catch (Exception e) {
           System.out.println("student added problem + "+ e);
       }
    }
    public boolean addStudent(Student st , Course c){
        /*String insert2 = "INSERT INTO `admin` (`id`, `name`, `email`, `type`, `gender`, `password`) VALUES ('"+admin.getId()+"', '"+
               admin.getName()+"', '"+admin.getEmail()+"', '"+admin.getType()+"', '"+admin.getGender()+"', '"+admin.getAdminPassword()+"')";*/
        
        String insert = "INSERT INTO `student` (`studentId`, `name`, `email`, `type`, `gender`, `depertmentName`, `admissionYear`, `admissionSemister`, `courseId`) VALUES ('"+st.getId()+
                "','"+st.getName()+"', '"+st.getEmail()+"', '"+st.getType()+"', '"+st.getGender()+"', '"+st.getDeprtmentName()+"', '"+st.getAdmissionYear()+"', '"+
                st.getAdmissionSemister()+"', '"+c.getCourseId()+"')";
       try {
           System.out.println("student added");///just testing
           statement.execute(insert);
           return true;
       } catch (Exception e) {
           System.out.println("student added problem + "+ e);
           return false;
       }
    }
    
    public LinkedList<Student> getStudentList() throws SQLException{
           LinkedList<Student> studentList = new LinkedList<>();
          CourseModel model = CourseModel.getInstance();
       try{
           String query = "Select * from student";
           try {
               resultSet = statement.executeQuery(query);
           } catch (SQLException ex) {
               System.err.println("student getting value problem");
           }
           while(resultSet.next()){
               String id = resultSet.getString("studentId");
               String name = resultSet.getString("name");
               String email = resultSet.getString("email");
               String type = resultSet.getString("type");
               String gender = resultSet.getString("gender");
               String depertmentName = resultSet.getString("depertmentName");
               String admissionYear = resultSet.getString("admissionYear");
               String admissionSemister = resultSet.getString("admissionSemister");
               String courseId = resultSet.getString("courseId");
               System.out.println(courseId);
               Student student;
               boolean alreadyHaveStudent = false;
               for(Student st : studentList){
                   if(st.getId().equals(id)){
                       st.addCourse(model.getCourse(courseId));
                       alreadyHaveStudent = true;
                       break;
                   }
               }
               if(!alreadyHaveStudent){
                     if(type.equals("local" ) || type.equals("Local")){
                   student = new LocalStudent(id, name, email, type, gender, depertmentName,admissionYear,admissionSemister);
                   student.addCourse(model.getCourse(courseId));
                   
               }
               else{
                     student = new ForeignStudent(id, name, email, type, gender, depertmentName,admissionYear,admissionSemister);
                   student.addCourse(model.getCourse(courseId));
               }
               studentList.add(student);
               }
             
           }
       } catch (SQLException ex) {
            
            System.out.println("student query problem "+ex);
        }
       return studentList;
    }
 
    public Student getStudent(String id) throws SQLException{
        LinkedList<Student> students = getStudentList();
        
        for(Student st : students){
            if(st.getId().equals(id)){
                return st;
            }
        }
        return null;
    }
    
    public boolean addCourse(Student st,Course c) throws SQLException{
       
        
        return addStudent(st,c);
         
       
    }
    
    private boolean updateCourse(Student st , Course c){
       
        String insert = "UPDATE `student` SET `courseId`='"+c.getCourseId()+"' WHERE `studentId`= '"+st.getId()+"' AND `courseId`='null'"; 
                   
       try {
           System.out.println("student updated");///just testing
           statement.execute(insert);
           return true;
       } catch (Exception e) {
           System.out.println("student updated problem + "+ e);
           return false;
       }
    }
    
    // no need at now
    public boolean isCourseNull(String id) throws SQLException{
        LinkedList<Student> students = getStudentList();
        
        for(Student st : students){
            if(st.getId().equals(id)){
                for(Course c : st.getCourseList()){
                    if(c.getCourseId().equals("null")){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}