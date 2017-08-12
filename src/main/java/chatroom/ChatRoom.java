package main.java.chatroom;

import java.util.*;

/**
 * Created by RENT on 2017-08-10.
 */
public class ChatRoom extends Observable{
    private String roomName;
    private Map<Integer,ChatUser> loggedUserMap = new HashMap<>();

    public Map<Integer, ChatUser> getLoggedUserMap() {
        return loggedUserMap;
    }

    public List<String> getAdminList() {
        return adminList;
    }

    private List<String> adminList = new LinkedList<>();

    public String getRoomName() {
        return roomName;
    }

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

    void sendMessageToAllUsers(int senderId ,String message){
        Message msg = new Message(loggedUserMap.get(senderId),message);
        setChanged();
        notifyObservers(msg);
    }

    void printLoggedUsers(){
        System.out.println("Zalogowani użytkownicy: ");
        for (ChatUser chatUser : loggedUserMap.values()) {
            System.out.println("      Nick: " + chatUser.getNick());
            System.out.println("           id: " + chatUser.getId());
        }

    }

    void sendDirrectMesage(int senderId, String message,int reciverId){
        Message msg = new Message(loggedUserMap.get(senderId),message, loggedUserMap.get(reciverId));
        setChanged();
        notifyObservers(msg);
    }




}
