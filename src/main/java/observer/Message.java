package main.java.observer;

/**
 * Created by RENT on 2017-08-10.
 */
public class Message {
    private String msg;
    private String phoneNo;

    public Message(String msg, String phoneNo) {
        this.msg = msg;
        this.phoneNo = phoneNo;
    }

    public String getMsg() {
        return msg;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
