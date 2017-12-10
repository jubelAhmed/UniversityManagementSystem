 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.employee;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

import universitymanagementsystem.Course;
import universitymanagementsystem.CourseModel;
import universitymanagementsystem.DatabaseModel;


public class EmployeeModel {
    private static EmployeeModel employeeModel;
    private Statement statement;
    private ResultSet resultSet;
    
    private EmployeeModel() throws SQLException{
      DatabaseModel.getConnection();
      statement = DatabaseModel.connection.createStatement();
    }
    
    public static EmployeeModel getInstance() throws SQLException{
        if(employeeModel == null){
            employeeModel = new EmployeeModel();
        }
        return employeeModel;
    }
    
    public boolean addEmployee(Employee emp){
        
        String insert = "INSERT INTO `employee` (`id`, `name`, `email`, `type`, `gender`,`depertmentName`,`salary`) VALUES ('"+emp.getId()+
                "', '"+emp.getName()+"', '"+emp.getEmail()+"', '"+emp.getType()+"', '"+emp.getGender()+"','"+emp.getDepertment()+"', '"+emp.getSalary()+"');";
       try {
           System.out.println("employee added");///just for testing
           statement.execute(insert);
           return true;
       } catch (Exception e) {
           System.out.println("employee added problem  "+ e);
           return false;
       }
    }
  
    public LinkedList<Employee> getEmployeeList() throws SQLException{
           LinkedList<Employee> employees = new LinkedList<>();
      
           String query = "Select * from employee";
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
              
            
                     
               Employee emp = new Employee(id, name, email, type, gender, depertmentName,salary);
             
               employees.add(emp);
               
           }
       return employees;
       
    }
 
    public Employee getEmployee(String id) throws SQLException{
        LinkedList<Employee> employees = getEmployeeList();
        
        for(Employee emp : employees){
            if(emp.getId().equals(id)){
                return emp;
            }
        }
        return null;
    }
    
    
    
  
}