/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Views;

import cb.assignment2.Models.Course;
import cb.assignment2.Models.Student;

public class ViewStudent {
    public static void printStudent(Student student){
        System.out.println("Student Information: ");
        System.out.println("Name: " + student.getCbStudentFirstName() + " " + student.getCbStudentLastName());
        System.out.println("Student Number: " + student.getCbStudentNumber());
        System.out.println("Age: " + student.getCbStudentAge());

        // Try / catch needed in case student is not enrolled in program
        try{
            System.out.println("Program: " + student.getCbStudentProgram().getCbProgramName());
        }catch (NullPointerException e){
            System.out.println("This student is not enrolled in any programs");
        }

        // Try / catch needed in case student is not enrolled in courses
        try{
            System.out.println("Courses: ");

            for(Course course : student.getCbStudentCourses()){
                System.out.println(course.getCbCourseName());
            }
        }catch (NullPointerException e){
            System.out.println("This student is not enrolled in any courses");
        }
    }
}
