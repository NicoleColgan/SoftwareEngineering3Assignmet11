import org.joda.time.DateTime;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Student{
    private String name, username;
    private int age;

    public String getName() {
        return name;
    }

    //generates a students username by concatenating their name and age
    public String getUsername() {
        return username;
    }
    public void setUsername(){
        username=name+age;
    }

    @Override
    public String toString(){
        //Single method to test all get methods
        String s= "-------------------------------------------------------\nStudent\n";
        s+= "Name: "+this.getName() +", Username: "+this.getUsername()+ ", Age: " + this.getAge()+", " +
                "Date of Birth: "+this.getDob()+ ", id: "+this.getId()+", courses: ";
        if(this.getCourses()!= null && this.getCourses().size()!=0){
            if(this.getCourses().size()==1)
                s+=this.getCourses().get(0).getCourseName();
                //this will only print if size>1
            else{
                for(int i=0;i<this.getCourses().size()-1; i++){
                    s+=this.getCourses().get(i).getCourseName() +"\n";
                }
            }
        }
        else
            s+="none\n";
        s+=", Modules: \n";
        if(this.getModules()!=null && this.getModules().size()!=0){
            if(this.getModules().size()==1)
                s+=this.getModules().get(0).getName();
            else {
                for(int i=0;i<this.getModules().size(); i++){
                    s+=this.getModules().get(i).getName() +"\n";
                }
            }
        }
        else
            s+="none\n";
        s+="\n--------------------------------------------------\n";
        return s;
    }

    public int getAge() {
        return age;
    }

    public double getId() {
        return id;
    }

    public DateTime getDob() {
        return dob;
    }

    public ArrayList<CourseProgram> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    private double id;
    private DateTime dob;
    //string list of courses enrolled
    private ArrayList<CourseProgram> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, double id, DateTime dob, ArrayList<CourseProgram> courses, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.dob = dob;
        this.courses = courses;
        this.modules = modules;
        setUsername();
    }
}