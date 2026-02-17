package assignment;

import java.util.Scanner;

public class Factors { //n
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Factors of " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}

//static void factors(int n){
//    for (int i=1; i<Math.sqrt(n);i++){
//        if(n%i == 0){
//            if(n/i==i){
//                System.out.print(i + " ");
//            } else {
//                System.out.print(i + " " + n/i + " ");
//            }
//        }
//    }
//}
