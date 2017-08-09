package main.java.applications;

import main.java.Person;

/**
 * Created by dorka on 09.08.2017.
 */
public class SocialSchoolarshipApplication  extends Application{
    private double[] grades;
    private double totalFamilyIncome;

    public SocialSchoolarshipApplication(Person applicantData, double[] grades, double totalFamilyIncome) {
        super(applicantData);
        this.grades = grades;
        this.totalFamilyIncome = totalFamilyIncome;
    }
}
