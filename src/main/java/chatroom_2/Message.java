package main.java.chatroom_2;

/**
 * Created by RENT on 2017-08-12.
 */
public class Message {
    private String content;
    private String senderNick;
    private String recieverNick;

    public Message(String content, String sender, String reciever) {
        this.content = content;
        this.senderNick = sender;
        this.recieverNick = reciever;

    }

    public Message(String senderNick,String message){
        this.content = message ;
        this.senderNick = senderNick;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return senderNick;
    }

    public String getReciever() {
        return recieverNick;
    }
}
