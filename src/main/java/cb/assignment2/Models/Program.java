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

    private int cbProgramYears;
    private boolean cbProgramCoop;
    private String cbProgramName;
    private ArrayList<Course> cbProgramCourses;

    /**
     * Default constructor
     */

    public Program(int cbProgramYears, boolean cbProgramCoop, String cbProgramName, ArrayList<Course> cbProgramCourses) {
        setCbProgramYears(cbProgramYears);
        setCbProgramCoop(cbProgramCoop);
        setCbProgramName(cbProgramName);
        setCbProgramCourses(cbProgramCourses);
    }

    /**
     * Getters / Setters
     */

    public int getCbProgramYears() {
        return cbProgramYears;
    }

    public void setCbProgramYears(int cbProgramYears) {
        this.cbProgramYears = cbProgramYears;
    }

    public boolean isCbProgramCoop() {
        return cbProgramCoop;
    }

    public void setCbProgramCoop(boolean cbProgramCoop) {
        this.cbProgramCoop = cbProgramCoop;
    }

    public String getCbProgramName() {
        return cbProgramName;
    }

    public void setCbProgramName(String cbProgramName) {
        this.cbProgramName = cbProgramName;
    }

    public ArrayList<Course> getCbProgramCourses() {
        return cbProgramCourses;
    }

    public void setCbProgramCourses(ArrayList<Course> cbProgramCourses) {
        this.cbProgramCourses = cbProgramCourses;
    }
}
