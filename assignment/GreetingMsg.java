package assignment;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();

        System.out.println("Hello " + name);
    }
}
