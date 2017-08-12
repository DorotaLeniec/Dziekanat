package main.java.chatroom_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by RENT on 2017-08-12.
 */
public class ChatUser extends  Observable implements Observer{
    private static int counter=0;
    private int id;
    private String nick;
    private boolean isAdmin = false;
    private boolean isLogged = false;
    private List<String> messages = new LinkedList<>();

    public ChatUser(String nick){
        this.nick = nick;
        counter++;
        this.id = counter;
    }

    public void sendMessageToAll(Message msg ){
        if(isLogged()) {
            setChanged();
            notifyObservers(msg);
        } else {
            System.out.println("Zaloguj się aby wysłać wiadomość");
        }
    }


    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public List<String> getMessages() {
        return messages;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Message){
            Message message = (Message) arg;
            if(this.isLogged()) {
                if (message.getReciever() == null) {
                    System.out.println("|"+this.nick.toUpperCase() + "| dostał wiadomość od |" + message.getSender().toUpperCase()+"|");
                    System.out.println("    treść: " + message.getContent());
                } else {
                    if(message.getReciever() == this.nick){
                        System.out.println("|"+this.nick.toUpperCase() + "| dostał wiadomość od |" + message.getSender().toUpperCase()+"|");
                        System.out.println("    treść: " + message.getContent());
                    }
                }
            } else {
                System.out.println(this.nick + " nie jest zalogowany");
            }
        }
    }
}
