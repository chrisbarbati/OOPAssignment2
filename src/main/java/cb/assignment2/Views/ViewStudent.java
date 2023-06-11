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
        System.out.println("Name: " + student.getStudentFirstName() + " " + student.getStudentLastName());
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Age: " + student.getStudentAge());

        // Try / catch needed in case student is not enrolled in program
        try{
            System.out.println("Program: " + student.getStudentProgram().getProgramName());
        }catch (NullPointerException e){
            System.out.println("This student is not enrolled in any programs");
        }

        // Try / catch needed in case student is not enrolled in courses
        try{
            System.out.println("Courses: ");

            for(Course course : student.getStudentCourses()){
                System.out.println(course.getCourseName());
            }
        }catch (NullPointerException e){
            System.out.println("This student is not enrolled in any courses");
        }
    }
}
