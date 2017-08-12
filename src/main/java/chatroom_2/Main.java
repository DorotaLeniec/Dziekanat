package main.java.chatroom_2;

/**
 * Created by RENT on 2017-08-12.
 */
public class Main {
    public static void main(String[] args) {
        ChatRoom chat  = new ChatRoom("DeBeSciaki");
        chat.addUser("Sarenka");
        chat.addUser("Kotlet");
        chat.addUser("Banan");
        chat.addUser("Cenna");
        chat.addUser("Krejzol");
        chat.addUser("Smutas");
        chat.printUsers();
        chat.loggIn("Sarenka");
        chat.loggIn("Kotlet");
        chat.loggIn("Smutas");
        chat.loggIn("Banan");
        chat.printUsers();
        chat.sendMessageToAll("Sarenka","siemanko");
        chat.sendDirectMessage("Sarenka","Krejzol","Hej Banan");

    }
}
