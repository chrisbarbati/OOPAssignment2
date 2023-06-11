/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2;

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
        Student student2 = new Student(200390697, 23, "Bob", "Baker");
        Student student3 = new Student(200390698, 27, "Martin", "McDonald");

        //Instantiate some courses
        Course course1 = new Course(0001, "Advanced Java", "Vivek Ahuja", "E208");
        Course course2 = new Course(0002, "Javascript", "Hossein Hesami", "K218");
        Course course3 = new Course(0003, "ASP.NET", "Sean McKinnon", "A222");

        //Instnatiate some programs
        Program program1 = new Program(3, true, "Computer Programming & Analysis", new ArrayList<>(Arrays.asList(course1, course2, course3)));
        Program program2 = new Program(4, false, "Business Administration", new ArrayList<>(Arrays.asList(course1, course2, course3)));
        Program program3 = new Program(1, false, "Finance", new ArrayList<>(Arrays.asList(course1, course2, course3)));

        //Demonstrate controllers

        //Demonstrate views
        ViewStudent.printStudent(student1);
        ViewStudent.printStudent(student2);
        ViewStudent.printStudent(student3);

        ViewCourse.printCourse(course1);
        ViewCourse.printCourse(course2);
        ViewCourse.printCourse(course3);

        ViewProgram.printProgram(program1);
        ViewProgram.printProgram(program2);
        ViewProgram.printProgram(program3);
    }
}