package main.java.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 * Created by RENT on 2017-08-10.
 */
public class SMSStation extends Observable {
    private List<Phone> phones = new LinkedList<>();

    public SMSStation() {
        phones.add(new Phone("700700700"));
        phones.add(new Phone("800800800"));
        phones.add(new Phone("900900900"));
        phones.add(new Phone("900900900"));
        phones.add(new Phone("900900900"));
        phones.add(new Phone("900900900"));
        phones.add(new Phone("600600600"));

        for (Phone phone : phones) {
            addObserver(phone);
        }

    }

    void addPhone(Phone phone){

    }

    void sendSMS(String number,String msg){
        Message message = new Message(msg,number);
        setChanged();
        notifyObservers(message);
    }


}
