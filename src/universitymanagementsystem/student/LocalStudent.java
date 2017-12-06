/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitymanagementsystem.student;


public class LocalStudent extends Student implements IStudentPayDiscount{

    public LocalStudent(String id, String name, String email, String type, String gender, String deprtmentName, String admissionYear, String admissionSemister) {
        super(id, name, email, type, gender, deprtmentName, admissionYear, admissionSemister);
    }
    
    @Override
    public double getWaiver(){
        return 5; // it's will be implement in next version
    }
}
