
package universitymanagementsystem.student;

import java.util.LinkedList;


public class StudentMaintain {
    
    private static StudentMaintain studentMaintain;
    private LinkedList<ForeignStudent> foreignStudentList;
    private LinkedList<LocalStudent> localStudentList;
    
    
    private StudentMaintain(){
        foreignStudentList = new LinkedList<>();
        localStudentList = new LinkedList<>();
    }
    
    public static StudentMaintain getInstance(){
        if(studentMaintain == null){
            studentMaintain = new StudentMaintain();
        }
        return studentMaintain;
    }
    
    public void addStudent(ForeignStudent student){
        foreignStudentList.add(student);
    }
    
    public void addStudent(LocalStudent student){
        localStudentList.add(student);
    }
    
    public ForeignStudent getForeignStudent(String id){
        for(ForeignStudent foreign : foreignStudentList){
            if(foreign.getId().equals(id)){
                return foreign;
            }
        }
        return null;
    }
    
    public LocalStudent getLocalStudent(String id){
        for(LocalStudent local : localStudentList){
            if(local.getId().equals(id)){
                return local;
            }
        }
        return null;
    }
    
    public LinkedList getForeignStudentList(){
        return foreignStudentList;
    }
    
    public LinkedList getLocalStudentList(){
        return localStudentList;
    }

    @Override
    public String toString() {
        return "StudentMaintain{" + "foreignStudentList=" + foreignStudentList + ", localStudentList=" + localStudentList + '}';
    }
    
}
