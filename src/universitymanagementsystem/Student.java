
package universitymanagementsystem;


public class Student extends People{
    private String deprtmentName;
    private String admissionYear;
    private String admissionSemister;
    

    public Student(String id, String name, String email, String type,String deprtmentName, String admissionYear, String admissionSemister) {
        super(id, name, email, type);
        this.deprtmentName = deprtmentName;
        this.admissionYear = admissionYear;
        this.admissionSemister = admissionSemister;
    }
    
}
