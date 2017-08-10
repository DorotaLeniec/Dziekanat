package main.java.singleton;

/**
 * Created by RENT on 2017-08-10.
 */
public class CashRegistry    {
    public int getTicket(){
        return TicketGenerator.getInstance().getTicket();
    }
}
