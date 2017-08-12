package main.java.aplikacja_webowa;


import java.util.Optional;
import java.util.Scanner;

/**
 * Created by RENT on 2017-08-12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WebService ws = new WebService();
        String line = null;
        do {
            line = sc.nextLine();
            Optional<Request> newRequest = RequestParser.parseRequest(line);
            if (newRequest.isPresent()) {
                System.out.println(newRequest);
                ws.handleRequest(newRequest.get());
            } else {
                System.out.println("Couldn't parse that request.");
            }
        } while (!line.equals("quit"));

    }


}
