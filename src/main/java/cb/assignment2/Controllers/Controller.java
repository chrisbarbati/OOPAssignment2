/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Controllers;

import cb.assignment2.Models.Course;
import cb.assignment2.Models.Program;
import cb.assignment2.Models.Student;
import cb.assignment2.Views.ViewCourse;
import cb.assignment2.Views.ViewProgram;
import cb.assignment2.Views.ViewStudent;

import java.util.ArrayList;

public class Controller {

    /**
     * Controller method. Interfaces between models and views.
     *
     * Using one controller for all views, as we discussed in class.
     */

    private Student cbStudent;
    private Course cbCourse;
    private Program cbProgram;

    private ViewStudent cbViewStudent;
    private ViewCourse cbViewCourse;
    private ViewProgram cbViewProgram;

    /**
     * Default constructor. Accepts one of each model, one of each view.
     * @param cbStudent
     * @param cbCourse
     * @param cbProgram
     * @param cbViewStudent
     * @param cbViewCourse
     * @param cbViewProgram
     */
    public Controller(Student cbStudent,
                      Course cbCourse,
                      Program cbProgram,
                      ViewStudent cbViewStudent,
                      ViewCourse cbViewCourse,
                      ViewProgram cbViewProgram) {
        this.cbStudent = cbStudent;
        this.cbCourse = cbCourse;
        this.cbProgram = cbProgram;
        this.cbViewStudent = cbViewStudent;
        this.cbViewCourse = cbViewCourse;
        this.cbViewProgram = cbViewProgram;
    }

    /**
     * Getters & setters
     * @return
     */

    public Student getCbStudent() {
        return cbStudent;
    }

    public void setCbStudent(Student cbStudent) {
        this.cbStudent = cbStudent;
    }

    public Course getCbCourse() {
        return cbCourse;
    }

    public void setCbCourse(Course cbCourse) {
        this.cbCourse = cbCourse;
    }

    public Program getCbProgram() {
        return cbProgram;
    }

    public void setCbProgram(Program cbProgram) {
        this.cbProgram = cbProgram;
    }

    public ViewStudent getCbViewStudent() {
        return cbViewStudent;
    }

    public void setCbViewStudent(ViewStudent cbViewStudent) {
        this.cbViewStudent = cbViewStudent;
    }

    public ViewCourse getCbViewCourse() {
        return cbViewCourse;
    }

    public void setCbViewCourse(ViewCourse cbViewCourse) {
        this.cbViewCourse = cbViewCourse;
    }

    public ViewProgram getCbViewProgram() {
        return cbViewProgram;
    }

    public void setCbViewProgram(ViewProgram cbViewProgram) {
        this.cbViewProgram = cbViewProgram;
    }

    /**
     * Methods to interact with the models.
     *
     * These are kind of redundant in this context. It would be simpler to just access directly through the controller
     * eg. from Main method call: Controller.getModel.setName(name)
     * than to use these methods
     * Controller.setStudentName(name),
     * and would not have this redundant code. This is how it was done in the example, so I am replicating it here
     * for demonstrative purposes.
     *
     * For that reason, I am not creating a method to access every instance variable. I am creating only a few to
     * demonstrate.
     */

    public void setStudentProgram(Program program){
        cbStudent.setCbStudentProgram(program); //You can see the redundancy I am referring to here
    }

    public void setStudentCourses(ArrayList<Course> courses){
        cbStudent.setCbStudentCourses(courses);
    }

    public void setProgramCourses(ArrayList<Course> courses){
        cbProgram.setCbProgramCourses(courses);
    }

    public void setCourseName(String name){
        cbCourse.setCbCourseName(name);
    }

    /**
     * Methods to interface with the views
     */

    public void updateStudentView(){
        ViewStudent.printStudent(cbStudent);
    }

    public void updateCourseView(){
        ViewCourse.printCourse(cbCourse);
    }

    public void updateProgramView(){
        ViewProgram.printProgram(cbProgram);
    }


}
