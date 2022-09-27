import java.util.ArrayList;

public class Module{

    private String name,id;
    private ArrayList<Student> students;

    public void setCourses(ArrayList<CourseProgram> courses) {
        this.courses = courses;
    }

    private ArrayList<CourseProgram> courses;

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    private Lecturer lecturer;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<CourseProgram> getCourses() {
        return courses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        String s = "-------------------------------------------------------\nModule\n";
        s+="name: "+this.getName()+", id: "+this.getId()+", lecturer: "+this.getLecturer().getName()+", courses that module is registered to: \n";
        if(this.getCourses()!=null && this.getCourses().size()!=0){
            if(this.getCourses().size()==1)
                s+=this.getCourses().get(0).getCourseName();
            else{   //size>1
                for(int i=0;i<this.getCourses().size(); i++){
                    s+=this.getCourses().get(i).getCourseName() +"\n";
                }
            }
        }
        else
            s+="none\n";
        s+=", students:\n ";
        if(this.getStudents()!=null && this.getStudents().size()!=0){
            if(this.getStudents().size()==1)
                s+=this.getStudents().get(0).getName();
            else{
                for(int i=0;i<this.getStudents().size(); i++){
                    s+=this.getStudents().get(i).getName() +"\n";
                }
            }
        }
        else
            s+="none\n";
        s+="--------------------------------------------------\n";
        return s;
    }
}