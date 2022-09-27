import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;

public class Lecturer{
    private String name, username;
    private int age;
    private DateTime dob;
    private double id;

    public String getName() {
        return name;
    }

    //generates username from name and age
    public String getUsername() {
        return username;
    }
    public void setUsername(){
        username=name+age;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDob() {
        return dob;
    }

    public double getId() {
        return id;
    }

    public ArrayList<Module> getModulesTeaching() {
        return modulesTeaching;
    }

    private ArrayList<Module> modulesTeaching;

    public Lecturer(String name, int age, DateTime dob, double id, ArrayList<Module> modulesTeaching) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modulesTeaching = modulesTeaching;
        setUsername();
    }

    @Override
    public String toString(){
        //Single method to test all get methods
        String s= "-------------------------------------------------------\nLecturer\n";
        s+= "Name: "+this.getName() +", Username: "+this.getUsername()+ ", Age: " + this.getAge()+", " +
                "Date of Birth: "+this.getDob()+ ", id: "+this.getId()+", Modules teaching: ";
        if(this.getModulesTeaching()!=null && this.getModulesTeaching().size()!=0){
            if(this.getModulesTeaching().size()==1)
                s+=this.getModulesTeaching().get(0).getName();
            else{
                for(int i=0;i<this.getModulesTeaching().size(); i++){
                    s+=this.getModulesTeaching().get(i).getName() +"\n";
                }
            }
        }
        else
            s+="none\n";
        s+="\n--------------------------------------------------\n";
        return s;
    }
}