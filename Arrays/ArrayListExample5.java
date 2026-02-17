package Arrays;

//arraylist = class
//SC 1= annotised

//internally size is fixed, but when it is filled by some amnt (eg 50 percent)
//it will create new list, double the size, copies od, and old is deleted.

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Integer> list = new ArrayList<>(10);
        //we have set initial cap as 10, but can store more than 10


        ArrayList<Integer> list = new ArrayList<>(1);
        //new obj of arraylist type created, list is ref var

        //ArrayList<String> list = new ArrayList<>();
        //ArrayList<int> list = new ArrayList<>(); cant do, wrong

        //in generics <>, we have to pass wrapper classes, tells what type of data
        //cant pass primitives in generics

//        list.add(67);
//        list.add(23);
//        System.out.println(list);
//
//        System.out.println(list.contains(1));
//
//        list.set(0, 99);  //update 0th to 99
//        System.out.println(list);
//
//        list.remove(0); //idx 0
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
//        System.out.println(list);
    }
}
