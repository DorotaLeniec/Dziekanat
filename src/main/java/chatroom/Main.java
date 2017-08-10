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
        room.sendMessage(1,"bla bla bla");
    }
}
