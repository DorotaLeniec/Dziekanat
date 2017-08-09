package main.java.applications;

import main.java.Person;

/**
 * Created by dorka on 09.08.2017.
 */
public class SchoolarshipApplication  extends Application{
    private double[] grades;
    private String[] additionalCourses;

    public SchoolarshipApplication(Person applicantData, double[] grades, String[] additionalCourses) {
        super(applicantData);
        this.grades = grades;
        this.additionalCourses = additionalCourses;
    }
}
