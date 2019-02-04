
package domain;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "stu")

public class StudentCon {
    private Student stdu;
    
    public StudentCon() {
    }
    
    

    public Student getStdu() {
        if(stdu == null){
        stdu = new Student();
        }
        return stdu;
    }

    public void setStdu(Student stdu) {
        this.stdu = stdu;
    }
    
    public void reset(){
    stdu = new Student();
    
    }
    
}
