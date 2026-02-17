package Function;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6);
        fun();

        String str = fun1(1,2,3);
        System.out.println(str);

//        System.out.println(fun1(1,2,3));

        System.out.println(fun2(1,2,3));

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static String fun1(int ...v) {
        return Arrays.toString(v);
    }

    static int fun2(int ...v) {
        int sum = 0;
        for (int num : v) {
            sum += num;
        }
        return sum;
    }

//    static void multiple(int a, int b, String ...v){
//
//    }


}
