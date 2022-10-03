import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;


import java.util.ArrayList;

public class JUnitTest {
    // Write a simple unit test using JUnit to make sure all the methods work
    Module linearAlgebra,geometry,informationRetrieval,networks;
    DateTime startDate,endDate;
    CourseProgram mathsCourse,computerScienceCourse;
    ArrayList<Module> mathsModules,computerScienceModules,modulesStudent3;
    ArrayList<CourseProgram> coursesStudent1,coursesStudent2,coursesStudent3,listMathsCourses,listComputerScienceCourses;
    DateTime dob,dob2,dob3,dob4,dob5;
    Student student1,student2,student3;
    ArrayList<Student> mathsStudents,computerScienceStudents,algebraStudents,geomStudents,netStudents,infoStudents;
    Lecturer l1,l2;
        @Test
        public void testStudentToString(){

            createTestCases();

            //this tests all the getter methods including the getUsername()
            assertEquals("-------------------------------------------------------\n" + "Student\n" + "Name: nicole, Username: nicole22, Age: 22, Date of Birth: 1999-11-21T00:00:00.000Z, id: 123341.0, courses: BCT, Modules: \n" + "Linear Algebra\n" + "--------------------------------------------------\n",
                    student1.toString());
        }

        @Test
        public void testModuleToString(){

            //test cases should have already been created in the first step
            createTestCases();    //<-uncomment to test this individual test
            assertEquals("-------------------------------------------------------\n" +
                    "Module\n" +
                    "name: Linear Algebra, id: MA322, lecturer: John Daly, courses that module is registered to: \n" +
                    "BCT, students:\n" +
                    " nicole\n" +
                    "Leah\n" +
                    "Peter\n" +
                    "--------------------------------------------------\n",linearAlgebra.toString());
        }

        @Test
        public void testLecturerToString(){

            createTestCases();
            assertEquals("-------------------------------------------------------\n" +
                    "Lecturer\n" +
                    "Name: Marie Doyle, Username: Marie Doyle30, Age: 30, Date of Birth: 1970-11-02T00:00:00.000+01:00, id: 343543.0, Modules teaching: Networks\n" +
                    "Information retrieval\n" +
                    "\n" +
                    "--------------------------------------------------\n",l2.toString());
        }

        @Test
        public void testCourseProgramToString(){

            createTestCases();
            assertEquals("-------------------------------------------------------\n" +
                    "Course\n" +
                    "name: BCT, Academic Start Date: 2022-09-05T00:00:00.000+01:00, Academic End Date: 2022-12-15T00:00:00.000Z, Modules offered in course: \n" +
                    "Networks\n" +
                    "Information retrieval\n" +
                    ", students:\n" +
                    " Peter\n" +
                    "--------------------------------------------------\n",computerScienceCourse.toString());
        }

        public void createTestCases(){
                //module and course creation
                linearAlgebra = new Module("Linear Algebra", "MA322");
                geometry = new Module("Geometry","MA320");
                informationRetrieval = new Module("Information retrieval", "CT456");
                networks = new Module("Networks", "CT765");
                startDate = new DateTime(2022,9,5,0,0);
                endDate = new DateTime(2022,12,15,0,0);
                mathsCourse = new CourseProgram("BCT",startDate,endDate);
                computerScienceCourse = new CourseProgram("BCT",startDate,endDate);
                //link modules and courses
                mathsModules = new ArrayList<>();
                mathsModules.add(linearAlgebra);
                mathsModules.add(geometry);
                mathsCourse.setModules(mathsModules);

                computerScienceModules = new ArrayList<>();
                computerScienceModules.add(networks);
                computerScienceModules.add(informationRetrieval);
                computerScienceCourse.setModules(computerScienceModules);

                coursesStudent1 = new ArrayList<>();
                coursesStudent1.add(mathsCourse);
                ArrayList<Module> modulesStudent1 = new ArrayList<>();
                modulesStudent1.add(linearAlgebra);

                coursesStudent2 = new ArrayList<>();
                coursesStudent2.add(mathsCourse);
                ArrayList<Module> modulesStudent2 = new ArrayList<>();
                modulesStudent2.add(linearAlgebra);
                modulesStudent2.add(geometry);

                //computer science student
                coursesStudent3 = new ArrayList<>();
                coursesStudent3.add(computerScienceCourse);
                coursesStudent3.add(mathsCourse);
                modulesStudent3 = new ArrayList<>();
                modulesStudent3.add(linearAlgebra);
                modulesStudent3.add(networks);
                modulesStudent3.add(informationRetrieval);

                //add courses to a module
                listMathsCourses = new ArrayList<>();
                listMathsCourses.add(mathsCourse);
                linearAlgebra.setCourses(listMathsCourses);
                geometry.setCourses(listMathsCourses);
                listComputerScienceCourses =new ArrayList<>();
                networks.setCourses(listComputerScienceCourses);
                informationRetrieval.setCourses(listComputerScienceCourses);

                //student 1 - Maths student
                dob=new DateTime(1999,11,21,0,0);
                student1 = new Student("nicole",22,123341,dob,coursesStudent1,modulesStudent1);

                //student 2 - Maths student
                dob2=new DateTime(2000,11,1,0,0);
                student2 = new Student("Leah",22,1275681,dob2,coursesStudent2,modulesStudent2);

                //student 1 - Maths student
                dob3=new DateTime(1999,3,23,0,0);
                student3 = new Student("Peter",22,123333,dob3,coursesStudent3,modulesStudent3);

                //register students to courses
                mathsStudents = new ArrayList<>();
                mathsStudents.add(student1);mathsStudents.add(student2);
                mathsCourse.setStudents(mathsStudents);

                computerScienceStudents = new ArrayList<>();
                computerScienceStudents.add(student3);
                computerScienceCourse.setStudents(computerScienceStudents);

                //register students to modules
                //students taking linearAlgebra
                algebraStudents = new ArrayList<>();
                algebraStudents.add(student1);algebraStudents.add(student2);algebraStudents.add(student3);
                linearAlgebra.setStudents(algebraStudents);

                //students taking geometry
                geomStudents = new ArrayList<>();
                geomStudents.add(student2);
                geometry.setStudents(geomStudents);

                //students taking networks
                netStudents = new ArrayList<>();
                netStudents.add(student3);
                networks.setStudents(netStudents);

                //students taking information retrieval
                infoStudents = new ArrayList<>();
                infoStudents.add(student3);
                informationRetrieval.setStudents(infoStudents);

                //add and make lecturers
                dob4=new DateTime(1960,11,1,0,0);
                l1 = new Lecturer("John Daly",45,dob4,2243234,mathsModules);

                dob5=new DateTime(1970,11,2,0,0);
                l2 = new Lecturer("Marie Doyle",30,dob5,343543,computerScienceModules);

                //add lecturers to modules
                linearAlgebra.setLecturer(l1);
                geometry.setLecturer(l1);
                networks.setLecturer(l2);
                informationRetrieval.setLecturer(l2);
        }


        //explain why i used a to string - enables us to test that all the getter methods and
        //username function works as exppected in one method

        //pretend that i made you put it into the constructor of the studen tbecause i thought a student
        //shouldnt be registered unless they have a course and modules

}
