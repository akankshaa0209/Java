package Function;

import java.util.Scanner;

public class StringGreet {
    public static void main(String[] args) {
//      String msg = greet();
//        System.out.println(msg);

        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalized = greet1(name);
//        String personlized = greet1("Java");
        System.out.println(personalized);
    }

    static String greet1(String name) {
        String msg = "hello " + name;
        return msg;
    }

    static String greet() {
//        return 23; //error
        String greeting = "how are you";
        return greeting;
    }
}
