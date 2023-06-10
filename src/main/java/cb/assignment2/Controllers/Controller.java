/**
 * Christian Barbati
 * 200390696
 * COMP1011 Assignment 2
 */

package cb.assignment2.Controllers;

import cb.assignment2.Models.Course;
import cb.assignment2.Models.Program;
import cb.assignment2.Models.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

    /**
     * Controller method. Interfaces between models and views.
     *
     * For demonstration purposes, creates a few of each model Object.
     *
     * (In week 5 demo Controller calls parameterless constructors for the models,
     * then has setter methods to set the parameters. I find this odd. Instead,
     * I will simply call the method constructors WITH parameters.)
     */

    /**
     * Models
     */

    private Student student1 = new Student(200390696, 25, "Steve", "Smith");
    private Student student2 = new Student(200390697, 23, "Bob", "Baker");
    private Student student3 = new Student(200390698, 27, "Martin", "McDonald");

    private Course course1 = new Course(0001, "Advanced Java", "Vivek Ahuja", "E208");
    private Course course2 = new Course(0002, "Javascript", "Hossein Hesami", "K218");
    private Course course3 = new Course(0003, "ASP.NET", "Sean McKinnon", "A222");

    /*
    In order to prevent instantiating 9 different course objects, each program will have the same courses.
    Name, years, and co-op will vary.
     */

    private Program program1 = new Program(3, true, "Computer Programming & Analysis", new ArrayList<>(Arrays.asList(course1, course2, course3)));
    private Program program2 = new Program(4, false, "Business Administration", new ArrayList<>(Arrays.asList(course1, course2, course3)));
    private Program program3 = new Program(1, false, "Finance", new ArrayList<>(Arrays.asList(course1, course2, course3)));

    /**
     * Views
     */


}
