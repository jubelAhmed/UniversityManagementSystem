/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.employee;

import java.util.LinkedList;


public class EmployeeMaintain {
    
    private static EmployeeMaintain employeeMaintain;
    private LinkedList<Employee> employeeList;
    
    private EmployeeMaintain(){
       employeeList = new LinkedList<>();
    }
    
    public static EmployeeMaintain getInstance(){
        if(employeeMaintain == null){
             employeeMaintain = new EmployeeMaintain();
            
        }
        return employeeMaintain;
    }
    
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
    
    public Employee getEmployee(String id){
        for(Employee emp : employeeList){
            
            if(emp.getId().equals(id)){
                return emp;
            }
        }
        return null;
    }
    
    public LinkedList<Employee> getEmployeeList(){
        return employeeList;
    }

    public boolean removeEmployee(String id){
        for(Employee emp : employeeList){
            if(emp.getId().equals(id)){
                employeeList.remove(emp);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "EmployeeMaintain{" + "employeeList=" + employeeList + '}';
    }
      
    
    
}
