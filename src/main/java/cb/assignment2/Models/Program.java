/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Models;

import java.util.ArrayList;

public class Program {
    /**
     * Instance variables.
     *
     * ArrayList to hold Course objects.
     */

    private int programYears;
    private boolean programCoop;
    private String programName;
    private ArrayList<Course> programCourses;

    /**
     * Default constructor
     */

    public Program(int programYears, boolean programCoop, String programName, ArrayList<Course> programCourses) {
        setProgramYears(programYears);
        setProgramCoop(programCoop);
        setProgramName(programName);
        setProgramCourses(programCourses);
    }

    /**
     * Getters / Setters
     */

    public int getProgramYears() {
        return programYears;
    }

    public void setProgramYears(int programYears) {
        this.programYears = programYears;
    }

    public boolean isProgramCoop() {
        return programCoop;
    }

    public void setProgramCoop(boolean programCoop) {
        this.programCoop = programCoop;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public ArrayList<Course> getProgramCourses() {
        return programCourses;
    }

    public void setProgramCourses(ArrayList<Course> programCourses) {
        this.programCourses = programCourses;
    }
}
