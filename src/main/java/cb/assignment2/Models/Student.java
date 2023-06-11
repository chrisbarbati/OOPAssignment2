/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Models;

import java.util.ArrayList;

public class Student {
    /**
     * Instance variables. Basic student information,
     * plus an ArrayList for Courses,
     * plus a single Program.
     */

    private int cbStudentNumber;
    private int cbStudentAge;
    private String cbStudentFirstName;
    private String cbStudentLastName;
    private ArrayList<Course> cbStudentCourses;
    private Program cbStudentProgram;

    /**
     * Default constructor. Accepts all args.
     *
     * Used when a student is enrolled in a program
     * but may be out of stream and have different courses.
     *
     * @param cbStudentNumber
     * @param cbStudentAge
     * @param cbStudentFirstName
     * @param cbStudentLastName
     * @param cbStudentCourses
     * @param cbStudentProgram
     */
    public Student(int cbStudentNumber, int cbStudentAge, String cbStudentFirstName, String cbStudentLastName, ArrayList<Course> cbStudentCourses, Program cbStudentProgram) {
        setCbStudentNumber(cbStudentNumber);
        setCbStudentAge(cbStudentAge);
        setCbStudentFirstName(cbStudentFirstName);
        setCbStudentLastName(cbStudentLastName);
        setCbStudentCourses(cbStudentCourses);
        setCbStudentProgram(cbStudentProgram);
    }

    /**
     * Additional constructor.
     *
     * Accepts all args except studentCourses, which is auto-populated
     * from the studentProgram Program at construction.
     *
     * Used when a student is enrolled in a program,
     * and is in stream with all program courses.
     * @param cbStudentNumber
     * @param cbStudentAge
     * @param cbStudentFirstName
     * @param cbStudentLastName
     * @param cbStudentProgram
     */
    public Student(int cbStudentNumber, int cbStudentAge, String cbStudentFirstName, String cbStudentLastName, Program cbStudentProgram) {
        setCbStudentNumber(cbStudentNumber);
        setCbStudentAge(cbStudentAge);
        setCbStudentFirstName(cbStudentFirstName);
        setCbStudentLastName(cbStudentLastName);
        setCbStudentProgram(cbStudentProgram);
        setCbStudentCourses(cbStudentProgram.getCbProgramCourses());
    }

    /**
     * Additional constructor.
     *
     * No program or course related args. Allows creation of a student without
     * associated program or course.
     * @param cbStudentNumber
     * @param cbStudentAge
     * @param cbStudentFirstName
     * @param cbStudentLastName
     */
    public Student(int cbStudentNumber, int cbStudentAge, String cbStudentFirstName, String cbStudentLastName) {
        setCbStudentNumber(cbStudentNumber);
        setCbStudentAge(cbStudentAge);
        setCbStudentFirstName(cbStudentFirstName);
        setCbStudentLastName(cbStudentLastName);
    }

    /**
     * Additional constructor.
     *
     * Accepts all args except studentProgram.
     *
     * Used when a student is enrolled in courses,
     * but is not in a particular program.
     * @param cbStudentNumber
     * @param cbStudentAge
     * @param cbStudentFirstName
     * @param cbStudentLastName
     * @param cbStudentCourses
     */
    public Student(int cbStudentNumber, int cbStudentAge, String cbStudentFirstName, String cbStudentLastName, ArrayList<Course> cbStudentCourses) {
        setCbStudentNumber(cbStudentNumber);
        setCbStudentAge(cbStudentAge);
        setCbStudentFirstName(cbStudentFirstName);
        setCbStudentLastName(cbStudentLastName);
        setCbStudentCourses(cbStudentCourses);
    }

    /**
     * Getters / Setters
     */

    public int getCbStudentNumber() {
        return cbStudentNumber;
    }

    public void setCbStudentNumber(int cbStudentNumber) {
        this.cbStudentNumber = cbStudentNumber;
    }

    public int getCbStudentAge() {
        return cbStudentAge;
    }

    public void setCbStudentAge(int cbStudentAge) {
        this.cbStudentAge = cbStudentAge;
    }

    public String getCbStudentFirstName() {
        return cbStudentFirstName;
    }

    public void setCbStudentFirstName(String cbStudentFirstName) {
        this.cbStudentFirstName = cbStudentFirstName;
    }

    public String getCbStudentLastName() {
        return cbStudentLastName;
    }

    public void setCbStudentLastName(String cbStudentLastName) {
        this.cbStudentLastName = cbStudentLastName;
    }

    public ArrayList<Course> getCbStudentCourses() {
        return cbStudentCourses;
    }

    public void setCbStudentCourses(ArrayList<Course> cbStudentCourses) {
        this.cbStudentCourses = cbStudentCourses;
    }

    public Program getCbStudentProgram() {
        return cbStudentProgram;
    }

    public void setCbStudentProgram(Program cbStudentProgram) {
        this.cbStudentProgram = cbStudentProgram;
    }
}
