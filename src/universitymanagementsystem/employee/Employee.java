/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.employee;

import universitymanagementsystem.People;


public class Employee extends People{
    private double salary;
    public Employee(String id, String name, String email, String type, String gender,double salary) {
        super(id, name, email, type, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"+ super.toString()+" "+ "salary=" + salary + '}';
    }
    
    
}
