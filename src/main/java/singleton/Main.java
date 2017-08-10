package main.java.singleton;

/**
 * Created by RENT on 2017-08-10.
 */
public class Main {
    public static void main(String[] args) {
        CashRegistry cash = new CashRegistry();
        HealthDepartment health = new HealthDepartment();
        WaitingRoom waiting = new WaitingRoom();

        System.out.println(cash.getTicket());
        System.out.println(cash.getTicket());
        System.out.println(cash.getTicket());
        System.out.println(health.getTicket());
        System.out.println(cash.getTicket());
        System.out.println(waiting.getTicket());
    }
}
