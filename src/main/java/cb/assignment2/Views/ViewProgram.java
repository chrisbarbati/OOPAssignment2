/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Views;

import cb.assignment2.Models.Course;
import cb.assignment2.Models.Program;

public class ViewProgram {
    public static void printProgram(Program program){
        System.out.println("Program Information: ");
        System.out.println("Program Name: " + program.getCbProgramName());
        System.out.println("Length (years): " + program.getCbProgramYears());

        // Try / catch needed in case program does not have courses
        try{
            System.out.println("Program Courses: ");

            for(Course course : program.getCbProgramCourses()){
                System.out.println(course.getCbCourseName());
            }
        }catch (NullPointerException e){
            System.out.println("This program does not contain any courses");
        }
    }
}
