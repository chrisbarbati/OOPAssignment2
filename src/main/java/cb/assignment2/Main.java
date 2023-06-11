/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2;

import cb.assignment2.Controllers.Controller;
import cb.assignment2.Models.Course;
import cb.assignment2.Models.Program;
import cb.assignment2.Models.Student;
import cb.assignment2.Views.ViewCourse;
import cb.assignment2.Views.ViewProgram;
import cb.assignment2.Views.ViewStudent;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /**
     * Demonstrate the usage of MVC architecture
     */

    public static void main(String[] args) {
        //Instantiate some students
        Student student1 = new Student(200390696, 25, "Steve", "Smith");

        //Instantiate some courses
        Course course1 = new Course(1, "Advanced Java", "Vivek Ahuja", "E208");
        Course course2 = new Course(0002, "Javascript", "Hossein Hesami", "K218");

        //Instantiate some programs
        Program program1 = new Program(3, true, "Computer Programming & Analysis", new ArrayList<>(Arrays.asList(course1)));

        //Instantiate a new Controller
        Controller controller1 = new Controller(student1, course1, program1, new ViewStudent(), new ViewCourse(), new ViewProgram());

        //Call the views
        System.out.println(" "); //Create a new line
        controller1.updateStudentView();

        System.out.println(" "); //Create a new line
        controller1.updateCourseView();

        System.out.println(" "); //Create a new line
        controller1.updateProgramView();

        System.out.println(" "); //Create a new line

        //Call some of the methods to interact with the models
        System.out.println(" "); //Create a new line
        controller1.setStudentCourses(new ArrayList<Course>(Arrays.asList(course1, course2)));

        System.out.println(" "); //Create a new line
        controller1.setCourseName("Even More Advanced Java");

        System.out.println(" "); //Create a new line
        controller1.setProgramCourses(new ArrayList<Course>(Arrays.asList(course1, course2)));

        System.out.println(" "); //Create a new line

        //Call the views to demonstrate the controller has updated the models
        System.out.println(" "); //Create a new line
        controller1.updateStudentView();

        System.out.println(" "); //Create a new line
        controller1.updateCourseView();

        System.out.println(" "); //Create a new line
        controller1.updateProgramView();
    }
}