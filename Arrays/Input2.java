package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        //args is a string array

        //===ARRAY OF PRIMITIVES===//

//        int[] arr = new int[2];
//        arr[0] = 23;
//        arr[1] = 46;
//        System.out.println(arr[0]);
        //sout (arr[2]); error. out of bound

//        int[] arr = new int[5];
//        Scanner in = new Scanner(System.in);
//        for (int i=0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i=0; i < arr.length; i++) {
//            sout(arr[i] + " ");
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        //modify
//        arr[2] = 4;
//        System.out.println(Arrays.toString(arr));

//        String str = Arrays.toString(arr);
//        System.out.println(str);

//        System.out.println(arr[1]);
//        for (int i=0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        //for every elem in arr, print the ele
//        for (int num : arr){
//            System.out.print(num + " ");
//        }

        //=====ARRAY OF OBJECTS=====//

        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "xyz";
        System.out.println(Arrays.toString(str));
    }
}
