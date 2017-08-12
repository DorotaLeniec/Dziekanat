package main.java.aplikacja_webowa;

import java.util.Observable;

/**
 * Created by RENT on 2017-08-12.
 */
public class WebService extends Observable {

    public WebService(){
        addObserver(new Marketing());
    }

    public void handleRequest(Request req){
        System.out.println("Request arrived: " + req);
        DataBase.getInstance().saveRequest(DB_TYPE.DB_REUEST,req);
        setChanged();
        notifyObservers(req);
    }

}
