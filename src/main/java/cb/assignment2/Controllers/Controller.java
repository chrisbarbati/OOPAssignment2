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

    private Student student;
    private Course course;
    private Program program;

    private ViewStudent viewStudent;
    private ViewCourse viewCourse;
    private ViewProgram viewProgram;

    /**
     * Default constructor. Accepts one of each model, one of each view.
     * @param student
     * @param course
     * @param program
     * @param viewStudent
     * @param viewCourse
     * @param viewProgram
     */
    public Controller(Student student,
                      Course course,
                      Program program,
                      ViewStudent viewStudent,
                      ViewCourse viewCourse,
                      ViewProgram viewProgram) {
        this.student = student;
        this.course = course;
        this.program = program;
        this.viewStudent = viewStudent;
        this.viewCourse = viewCourse;
        this.viewProgram = viewProgram;
    }

    /**
     * Getters & setters
     * @return
     */

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public ViewStudent getViewStudent() {
        return viewStudent;
    }

    public void setViewStudent(ViewStudent viewStudent) {
        this.viewStudent = viewStudent;
    }

    public ViewCourse getViewCourse() {
        return viewCourse;
    }

    public void setViewCourse(ViewCourse viewCourse) {
        this.viewCourse = viewCourse;
    }

    public ViewProgram getViewProgram() {
        return viewProgram;
    }

    public void setViewProgram(ViewProgram viewProgram) {
        this.viewProgram = viewProgram;
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
        student.setStudentProgram(program); //You can see the redundancy I am referring to here
    }

    public void setStudentCourses(ArrayList<Course> courses){
        student.setStudentCourses(courses);
    }

    public void setProgramCourses(ArrayList<Course> courses){
        program.setProgramCourses(courses);
    }

    public void setCourseName(String name){
        course.setCourseName(name);
    }

    /**
     * Methods to interface with the views
     */

    public void updateStudentView(){
        ViewStudent.printStudent(student);
    }

    public void updateCourseView(){
        ViewCourse.printCourse(course);
    }

    public void updateProgramView(){
        ViewProgram.printProgram(program);
    }


}
