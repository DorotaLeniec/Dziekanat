package main.java;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import main.java.applications.Application;
import main.java.applications.ApplicationFactory;

import java.util.Scanner;

/**
 * Created by dorka on 09.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isFinished = false;
        Application app;

        System.out.println("======================");
        System.out.println(" Witaj w dziekanacie! ");
        System.out.println("======================");
        System.out.println("Podaj imie nazwisko i nr indexu");
        String personData = sc.nextLine();
        Person person = createPerson(personData);
        do {
            System.out.println("Jaką aplikację chcesz wypełnić?");
            System.out.println("                                 1 - Warunek");
            System.out.println("                                 2 - Stypendium naukowe");
            System.out.println("                                 3 - Stypendium socjalne");
            System.out.println("                                 4 - Wydłużenie semestru");
            String applicationType = sc.nextLine();
            if (applicationType.equals("1")) {
                System.out.println("Podaj swoje oceny oddzielone przecinkami:");
                String gradesLine = sc.nextLine();
                double[] grades = getGrades(gradesLine);
                System.out.println("Podaj powód");
                String reason = sc.nextLine();
                app = ApplicationFactory.createConditionalStayApplication(person,reason,grades);
                System.out.println(app);
            } else if (applicationType.equals("2")) {
                System.out.println("Podaj swoje oceny oddzielone przecinkami:");
                String gradesLine = sc.nextLine();
                double[] grades = getGrades(gradesLine);
                System.out.println("Podaj nazwy dodatkowych zajec oddzielone przecinkami: ");
                String coursesLine = sc.nextLine();
                String[] courses = coursesLine.split(",");
                app = ApplicationFactory.createSchoolarshipApplication(person,grades,courses);
                System.out.println(app);
            } else if (applicationType.equals("3")) {
                System.out.println("Podaj swoje oceny oddzielone przecinkami:");
                String gradesLine = sc.nextLine();
                double[] grades = getGrades(gradesLine);
                System.out.println("Podaj średni dochód na członka rodziny");
                double personIncome = Double.parseDouble(sc.nextLine());
                app = ApplicationFactory.createSocialSchoolarshipApplication(person,grades,personIncome);
                System.out.println(app);
            } else if (applicationType.equals("4")) {
                System.out.println("Podaj powód: ");
                String reason = sc.nextLine();
                app = ApplicationFactory.createSemesterExtendApplication(person,reason);
                System.out.println(app);
            } else {
                System.out.println("Komenda nieznana");
            }
            System.out.println("Czy chcesz zakonczyc? T/N");
            String decision = sc.nextLine();

            if(decision.equals("T")){
                isFinished = true;
            }

        } while(!isFinished);



    }

    private static Person createPerson(String line){
        String[] personalData = line.split(" ");
        if(personalData.length == 3){
            return new Person(personalData[0],personalData[1],personalData[2]);
        }
        return null;
    }

    private static double[] getGrades(String line){
        String[] gradesS = line.split(",");
        double[] grades = new double[gradesS.length];
        for(int i=0;i<grades.length;i++){
            grades[i]= Double.parseDouble(gradesS[i]);
        }
        return grades;
    }
}
