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
    private int cbCrn;
    private String cbCourseName;
    private String cbCourseInstructor;
    private String cbCourseLocation;

    /**
     * Default constructor.
     *
     * In real life, courseInstructor should point to an Instructor object.
     * That is beyond the scope of my assignment, but would be a better
     * solution than a String containing the name of the instructor.
     *
     * @param cbCourseLocation
     * @param cbCourseName
     * @param cbCourseInstructor
     * @param cbCrn
     */

    public Course(int cbCrn, String cbCourseName, String cbCourseInstructor, String cbCourseLocation) {
        setCbCrn(cbCrn);
        setCbCourseName(cbCourseName);
        setCbCourseLocation(cbCourseLocation);
        setCbCourseInstructor(cbCourseInstructor);
    }

    /**
     * Getters / Setters
     */

    public int getCbCrn() {
        return cbCrn;
    }

    public void setCbCrn(int cbCrn) {
        this.cbCrn = cbCrn;
    }

    public String getCbCourseName() {
        return cbCourseName;
    }

    public void setCbCourseName(String cbCourseName) {
        this.cbCourseName = cbCourseName;
    }

    public String getCbCourseInstructor() {
        return cbCourseInstructor;
    }

    public void setCbCourseInstructor(String cbCourseInstructor) {
        this.cbCourseInstructor = cbCourseInstructor;
    }

    public String getCbCourseLocation() {
        return cbCourseLocation;
    }

    public void setCbCourseLocation(String cbCourseLocation) {
        this.cbCourseLocation = cbCourseLocation;
    }
}
