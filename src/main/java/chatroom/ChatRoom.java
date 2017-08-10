package main.java.chatroom;

import java.util.*;

/**
 * Created by RENT on 2017-08-10.
 */
public class ChatRoom extends Observable{
    String roomName;
    Map<Integer,ChatUser> loggedUserMap = new HashMap<>();
    List<String> adminList = new LinkedList<>();

    void userLogin(String nick){
        ChatUser user = new ChatUser(nick);
        if(user.getNick().equals("amidn") || user.getNick().equals("administrator")){
            user.setAdmin(true);
        }
        loggedUserMap.put(user.getId(),user);
        addObserver(user);
    }

    public ChatRoom(String roomName) {
        this.roomName = roomName;
        adminList.add("admin");
        adminList.add("administrator");
    }

    void kickUser(int id_toKick, int kickerId){
        if(loggedUserMap.get(kickerId).isAdmin()){
            loggedUserMap.remove(id_toKick);
        }
    }

    void sendMessage(int userId, String message){
        setChanged();
        notifyObservers(message);
    }

}
