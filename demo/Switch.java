package demo;

import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit){
//            case "Mango" -> System.out.println("king");
//            case "Apple" -> System.out.println("healthy");
//            default -> System.out.println("invalid");
//        }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("no");
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }
    }
}
