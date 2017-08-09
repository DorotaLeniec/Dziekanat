package main.java.applications;

import main.java.Person;

/**
 * Created by dorka on 09.08.2017.
 */
public class ConditionalStayApplication extends Application{

    private double[] grades;
    private String reason;

    public ConditionalStayApplication(Person applicantData, String reason, double[] grades) {
        super(applicantData);
        this.grades = grades;
        this.reason = reason;
    }
}
