/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Views;

import cb.assignment2.Models.Course;

public class ViewCourse {
    public static void printCourse(Course course){
        System.out.println("Course Information: ");
        System.out.println("Course Name: " + course.getCbCourseName());
        System.out.println("Instructor: " + course.getCbCourseInstructor());
        System.out.println("Location: " + course.getCbCourseLocation());
        System.out.println("CRN: " + course.getCbCrn());
    }
}
