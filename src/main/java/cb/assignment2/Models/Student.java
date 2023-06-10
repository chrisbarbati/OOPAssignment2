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

    private int studentNumber;
    private int studentAge;
    private String studentFirstName;
    private String studentLastName;
    private ArrayList<Course> studentCourses;
    private Program studentProgram;

    /**
     * Default constructor. Accepts all args.
     *
     * Used when a student is enrolled in a program
     * but may be out of stream and have different courses.
     *
     * @param studentNumber
     * @param studentAge
     * @param studentFirstName
     * @param studentLastName
     * @param studentCourses
     * @param studentProgram
     */
    public Student(int studentNumber, int studentAge, String studentFirstName, String studentLastName, ArrayList<Course> studentCourses, Program studentProgram) {
        setStudentNumber(studentNumber);
        setStudentAge(studentAge);
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setStudentCourses(studentCourses);
        setStudentProgram(studentProgram);
    }

    /**
     * Additional constructor.
     *
     * Accepts all args except studentCourses, which is auto-populated
     * from the studentProgram Program at construction.
     *
     * Used when a student is enrolled in a program,
     * and is in stream with all program courses.
     * @param studentNumber
     * @param studentAge
     * @param studentFirstName
     * @param studentLastName
     * @param studentProgram
     */
    public Student(int studentNumber, int studentAge, String studentFirstName, String studentLastName, Program studentProgram) {
        setStudentNumber(studentNumber);
        setStudentAge(studentAge);
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setStudentProgram(studentProgram);
        setStudentCourses(studentProgram.getProgramCourses());
    }

    /**
     * Additional constructor.
     *
     * No program or course related args. Allows creation of a student without
     * associated program or course.
     * @param studentNumber
     * @param studentAge
     * @param studentFirstName
     * @param studentLastName
     */
    public Student(int studentNumber, int studentAge, String studentFirstName, String studentLastName) {
        setStudentNumber(studentNumber);
        setStudentAge(studentAge);
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
    }

    /**
     * Additional constructor.
     *
     * Accepts all args except studentProgram.
     *
     * Used when a student is enrolled in courses,
     * but is not in a particular program.
     * @param studentNumber
     * @param studentAge
     * @param studentFirstName
     * @param studentLastName
     * @param studentCourses
     */
    public Student(int studentNumber, int studentAge, String studentFirstName, String studentLastName, ArrayList<Course> studentCourses) {
        setStudentNumber(studentNumber);
        setStudentAge(studentAge);
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setStudentCourses(studentCourses);
    }

    /**
     * Getters / Setters
     */

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public ArrayList<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Program getStudentProgram() {
        return studentProgram;
    }

    public void setStudentProgram(Program studentProgram) {
        this.studentProgram = studentProgram;
    }
}
