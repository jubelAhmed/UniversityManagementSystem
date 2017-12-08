
package universitymanagementsystem.teacher;


import java.util.LinkedList;


public class TeacherMaintain {
    
    
    private static TeacherMaintain teacherMaintain;
    
    
    private LinkedList<Teacher> teacherList;
    
    
    private TeacherMaintain(){
        teacherList = new LinkedList<>();
    }
    
    
    public TeacherMaintain getInstance(){
        if(teacherList == null){
            teacherMaintain = new TeacherMaintain();
        }
        
        return teacherMaintain;
    }
    
    
    public void addTeacher(Teacher t){
        teacherList.add(t);
    }
    
    
    public Teacher getTeacher(String id){     
        for(Teacher t : teacherList){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    } 
    
    
    public LinkedList<Teacher> getTeacherList(){
        return teacherList;
    }

    @Override
    public String toString() {
        return "TeacherMaintain{" + "teacherList=" + teacherList + '}';
    }
    
    
    
}
