package demo;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String word = "hello";
//        System.out.println(word.charAt(0));

//        System.out.println(in.next());
//         System.out.println(in.next().trim());

//        System.out.println(in.nextLine());
//         System.out.println(in.nextLine().trim());

//        char ch = in.next().trim().charAt(0);
//        System.out.println(ch);

        char ch = in.next().trim().charAt(0);

        if (ch > 'a' && ch < 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("uppercase");
        }
    }
}
