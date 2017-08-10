package main.java.singleton;

/**
 * Created by RENT on 2017-08-10.
 */
public class TicketGenerator {

    private static TicketGenerator instance = new TicketGenerator();

    private int ticket=0;

    public int getTicket() {
        ticket++;
        return ticket;
    }
    private TicketGenerator(){}

    public static TicketGenerator getInstance(){
        return instance;
    }
}
