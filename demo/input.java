package demo;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
//        System.out.print("please give some input:");
        Scanner input = new Scanner(System.in); //obj creation
//        System.out.println("your input value is " + input.nextInt());

//        int a = input.nextInt();
//        System.out.println("your input value is " + a);

//        String name = input.nextLine();  //entire line
//        System.out.println(name);

        String name2 = input.next();  //take only 1st word
        System.out.println(name2);
    }
}
