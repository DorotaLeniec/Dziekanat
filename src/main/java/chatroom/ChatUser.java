package main.java.chatroom;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by RENT on 2017-08-10.
 */
public class ChatUser implements Observer{
    private static int counter = 0;
    private int id;
    private String nick;
    private List<String> messages = new LinkedList<>();
    private boolean isAdmin;


    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getNick() {

        return nick;
    }

    public int getId() {
        return id;
    }


    public ChatUser(String nick) {
        this.nick = nick;
        counter++;
        this.id = counter;
    }

    @Override
    public String toString() {
        return " Nick: " + this.nick + " " + this.id;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Message) {
            Message msg = (Message) arg;
            if (msg.getReciever()==null) {
                System.out.println(this.getNick() + " otrzymał/ła wiadomość od: " + msg.getSender().getNick());
                System.out.println("                 - " + msg.getMessage());
            } else {
                if(msg.getReciever().getId() == this.id){
                    System.out.println(this.getNick() + " otrzymał/ła wiadomość od: " + msg.getSender().getNick());
                    System.out.println("                 - " + msg.getMessage());
                }
            }
        }
    }
}
