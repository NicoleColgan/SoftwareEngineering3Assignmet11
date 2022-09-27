import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgram {

    public String courseName;

    public CourseProgram(String courseName, DateTime academicStartDate, DateTime academicEndDate) {
        this.courseName = courseName;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Module> modules;

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> students;
    public DateTime academicStartDate, academicEndDate;

    @Override
    public String toString(){
        String s =  "-------------------------------------------------------\nCourse\n";
        s+="name: "+this.getCourseName()+", Academic Start Date: "+this.getAcademicStartDate()+", Academic End Date: "+
                this.getAcademicEndDate()+", Modules offered in course: \n";
        if(this.getModules()!=null && this.getModules().size()!=0){
            if(this.getModules().size()==1)
                s+=this.getModules().get(0).getName();
            else{
                for(int i=0;i<this.getModules().size(); i++){
                    s+=this.getModules().get(i).getName() +"\n";
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
        s+="\n--------------------------------------------------\n";
        return s;
    }
}