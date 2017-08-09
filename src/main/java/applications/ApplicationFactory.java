package main.java.applications;

import main.java.Person;

import java.time.LocalDateTime;

/**
 * Created by dorka on 09.08.2017.
 */
public abstract class ApplicationFactory {
    public static Application createConditionalStayApplication(Person person,String reason,double[] grades){
        ConditionalStayApplication app = new ConditionalStayApplication(person,reason,grades);
        app.setCreationDate(LocalDateTime.now());
        app.setCreationPlace("Gdańsk");
        app.setContent("Podanie o warunek");
        return app;
    }

    public static Application createSchoolarshipApplication(Person person,double[] grades,String[] additionalCourses){
        SchoolarshipApplication app = new SchoolarshipApplication(person,grades,additionalCourses);
        app.setCreationDate(LocalDateTime.now());
        app.setCreationPlace("Gdańsk");
        return app;
    }

    public static Application createSemesterExtendApplication(Person person,String reason){
        SemesterExtendApplication app = new SemesterExtendApplication(person,reason);
        app.setCreationDate(LocalDateTime.now());
        app.setCreationPlace("Gdańsk");
        return app;
    }

    public static Application createSocialSchoolarshipApplication(Person person,double[] grades, double totalIncom){
        SocialSchoolarshipApplication app = new SocialSchoolarshipApplication(person,grades,totalIncom);
        app.setCreationDate(LocalDateTime.now());
        app.setCreationPlace("Gdańsk");
        return app;
    }

}
