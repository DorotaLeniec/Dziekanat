package main.java.aplikacja_webowa;

/**
 * Created by RENT on 2017-08-12.
 */
public class Order {
    //Marketing User Nazwa Produktu Ilosc

    private String productName;
    private int amount;

    public Order(Request req){
        String[] request = req.getContent().split(" ");
        this.productName = request[0];
        this.amount = Integer.parseInt(request[1]);
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
