package main.java.chatroom_2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-08-12.
 */
public class ChatRoom {
    private Map<String, ChatUser> allUsers = new HashMap<>();
    private String name;
    private ChatUser loggedUser;

    public ChatRoom(String name) {
        this.name = name;
        System.out.println("=====================");
        System.out.println("     "+  this.name);
        System.out.println("=====================");
    }

    public void addUser(String nick) {
        ChatUser user = new ChatUser(nick);
        if (nick.equals("admin")) {
            user.setAdmin(true);
        }
        if (allUsers != null && allUsers.size() > 0) {
            for (ChatUser chatUser : allUsers.values()) {
                user.addObserver(chatUser);
                chatUser.addObserver(user);
            }
        }

        allUsers.put(user.getNick(), user);
        System.out.println("Dodano użytkownika " + user.getNick());
    }

    public void loggIn(String nick){
        ChatUser loggedUser = allUsers.get(nick);
        loggedUser.setLogged(true);
        System.out.println("Jesteś zalogowany jako " + loggedUser.getNick());
    }

    public void printUsers(){
        System.out.println("====================");
        System.out.println("  Użytkownicy czatu: ");
        System.out.println("====================");
        for (ChatUser chatUser : allUsers.values()) {
            if(chatUser.isLogged()){
                System.out.println(chatUser.getNick() + " - DOSTĘPNY");
            } else {
                System.out.println(chatUser.getNick() + " - niedostępny");
            }
        }
        System.out.println("====================");

    }

    public void sendMessageToAll(String senderNick, String message){
        Message msg = new Message(senderNick,message);
        allUsers.get(senderNick).sendMessageToAll(msg);
    }

    public void sendDirectMessage(String senderNick,String recieverNick,String message){
        Message msg = new Message(message,senderNick,recieverNick);
        allUsers.get(senderNick).sendMessageToAll(msg);
    }

}
