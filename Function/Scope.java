package Function;

import java.util.Enumeration;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name = "Java";
//        int a = 9  can't initialize same var
//        a=9 can change value of ref var
        {  //BLOCK START
//            int a = 100; already initialized out of blk, cant initialize again.
           a = 87; //can change/modify
            System.out.println(a);
           int c = 99;
           name = "Coding";
            System.out.println(name);
           // values initialzed in blk wil remain in blk
        }  //BLOCK END
        int c = 90;
        System.out.println(c);
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); error

        //scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 98;
//            int a= 16; no
            a=14;
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 76;
        System.out.println(num);
        System.out.println(marks);
    }
}
