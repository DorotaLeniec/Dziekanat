package main.java.aplikacja_webowa;

import java.util.Optional;

/**
 * Created by RENT on 2017-08-12.
 */
public class RequestParser {

    public static Optional<Request> parseRequest(String line) {
        try {
            String[] words = line.split(" ",3);
            RequestType type = RequestType.valueOf(words[0]);
            String userName = words[1];
            String content = words[2];
            Request reuest = new Request(userName, type, content);
            return Optional.of(reuest);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wrong number of arguments.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Wrong type.");
        }
        return Optional.empty();

    }
}