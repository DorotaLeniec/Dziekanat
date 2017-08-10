package main.java.observer;

/**
 * Created by RENT on 2017-08-10.
 */
public class Main {
    public static void main(String[] args) {
        SMSStation station = new SMSStation();
        station.sendSMS("900900900","SIEMA ZIOM");
        station.sendSMS("700700700","Jol co tam dzis porabiasz?");
    }
}
