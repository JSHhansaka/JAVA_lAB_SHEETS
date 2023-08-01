

public class Student extends Person {
;
    private String course;
    
    public Student(String name , int id,String course){
        super(name,id);
        this.course=course;

    }

   
    public String setCourse(){
        return course;
    }
    public void getCourse(String course){
        this.course=course;
    }
}
