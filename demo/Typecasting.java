package demo;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

//        int num = input.nextInt();
//        System.out.println(num);

        int number = 'A';
        System.out.println(number);

        //narrowing casting
        int num = (int) (67.65);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 23;
        int b = 257;
        byte c = (byte) (a);  //257%256
        byte d = (byte) (b);
        System.out.println("c = " + c + ", d = " + d);
        System.out.printf("c = %d, d = %d%n", c, d);
    }
}
