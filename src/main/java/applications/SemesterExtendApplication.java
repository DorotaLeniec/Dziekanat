package main.java.applications;

import main.java.Person;

/**
 * Created by dorka on 09.08.2017.
 */
public class SemesterExtendApplication extends Application {
    private String reason;

    public SemesterExtendApplication(Person applicantData, String reason) {
        super(applicantData);
        this.reason = reason;
    }
}
