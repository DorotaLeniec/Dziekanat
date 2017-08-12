package main.java.chatroom;

/**
 * Created by RENT on 2017-08-10.
 */
public class Main {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom("Programisci");
        room.userLogin("Stefan");
        room.userLogin("Bogdan");
        room.userLogin("Aneta");
        System.out.println("=====================");
        System.out.println("     "+room.getRoomName());
        System.out.println("=====================");
//        room.sendMessageToAllUsers(1,"Hej wszystkim");
        room.printLoggedUsers();
        room.sendDirrectMesage(1,"hej Anetka ", 3);
    }
}
