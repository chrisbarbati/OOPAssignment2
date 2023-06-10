/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Models;

public class Course {
    /**
     * Instance variables
     */
    private int crn;
    private String courseName;
    private String courseInstructor;
    private String courseLocation;

    /**
     * Default constructor.
     *
     * In real life, courseInstructor should point to an Instructor object.
     * That is beyond the scope of my assignment, but would be a better
     * solution than a String containing the name of the instructor.
     *
     * @param courseLocation
     * @param courseName
     * @param courseInstructor
     * @param crn
     */

    public Course(int crn, String courseName, String courseInstructor, String courseLocation) {
        setCrn(crn);
        setCourseName(courseName);
        setCourseLocation(courseLocation);
        setCourseInstructor(courseInstructor);
    }

    /**
     * Getters / Setters
     */

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }
}
