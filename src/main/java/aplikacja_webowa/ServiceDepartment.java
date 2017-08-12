package main.java.aplikacja_webowa;

import java.util.*;

/**
 * Created by RENT on 2017-08-12.
 */
public class ServiceDepartment implements Observer {

    private Map<String, List<String>> serviceMap = new HashMap<>();

    @Override
    public void update(Observable o, Object arg) {
        Request request = (Request) arg;
        handleRequest(request);
    }

    private void handleRequest(Request request) {
        if (request.getType() == RequestType.SERVICE) {
            try {
                System.out.println("New order created: ");
                DataBase.getInstance().saveRequest(DB_TYPE.DB_USERS, serviceMap);
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.err.println("Invalid number of order parameters");
            }
        }

    }
}
