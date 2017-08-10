package main.java.chatroom;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by RENT on 2017-08-10.
 */
public class ChatUser implements Observer{
    static int counter = 0;
    private int id;

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

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

    private String nick;
    private List<String> messages;
    private boolean isAdmin;

    public ChatUser(String nick) {
        this.nick = nick;
        counter++;
        this.id = counter;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            System.out.println("Wiadomość z czatu: " + arg);
        }
    }
}
