package main.java.aplikacja_webowa;

/**
 * Created by RENT on 2017-08-12.
 */
public class Request {
    private String userName;
    private RequestType type;
    private String content;

    public Request(String userName, RequestType type, String content) {
        this.userName = userName;
        this.type = type;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Request{" +
                "userName='" + userName + '\'' +
                ", type=" + type +
                ", content='" + content + '\'' +
                '}';
    }

    public RequestType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}
