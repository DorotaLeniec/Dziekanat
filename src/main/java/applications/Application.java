package main.java.applications;

import main.java.Person;

import java.time.LocalDateTime;
import java.util.Formatter;

/**
 * Created by dorka on 09.08.2017.
 */
public class Application {
    private LocalDateTime creationDate;
    private String creationPlace;
    private Person applicantData;
    private String content = "aplikacja";

    public Application( Person applicantData) {
        this.applicantData = applicantData;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationPlace() {
        return creationPlace;
    }

    public void setCreationPlace(String creationPlace) {
        this.creationPlace = creationPlace;
    }

    public Person getApplicantData() {
        return applicantData;
    }

    public void setApplicantData(Person applicantData) {
        this.applicantData = applicantData;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Application{" +
            "    creationDate: " + creationDate + "\n" +
            "    creationPlace: " + creationPlace + "\n" +
            "    applicantData: " + applicantData + "\n" +
            "    content: "  + content + "\n" +
            '}';
    }
}
