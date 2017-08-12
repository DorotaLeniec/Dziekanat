package main.java.aplikacja_webowa;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by RENT on 2017-08-12.
 */
public class Marketing implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Request){
        Request request = (Request) arg;
            handleRequest(request);
        }
    }

    private void handleRequest(Request request){
        if(request.getType() ==RequestType.MARKETING){
            try {
                Order order = new Order(request);
                System.out.println("New order created: " + order);
                DataBase.getInstance().saveRequest(DB_TYPE.DB_ORDERS,order);
            }catch (ArrayIndexOutOfBoundsException aiobe){
                System.err.println("Invalid number of order parameters");
            }
        }

    }
}
