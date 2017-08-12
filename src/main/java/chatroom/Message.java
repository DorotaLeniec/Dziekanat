package main.java.chatroom;

/**
 * Created by RENT on 2017-08-12.
 */
public class Message {
    private ChatUser sender;
    private String message;
    private ChatUser reciever;

    public ChatUser getReciever() {
        return reciever;
    }

    public Message(ChatUser sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public Message(ChatUser sender, String message, ChatUser reciver) {
        this.sender = sender;
        this.message = message;
        this.reciever = reciver;
    }

    public ChatUser getSender() {

        return sender;
    }

    public void setSender(ChatUser sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
