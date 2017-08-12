package main.java.aplikacja_webowa;

/**
 * Created by RENT on 2017-08-12.
 */
public enum DB_TYPE {
    DB_REUEST("request.txt"),
    DB_USERS("users.txt"),
    DB_ORDERS("orders.txt");

    private String fileName;

    DB_TYPE(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
