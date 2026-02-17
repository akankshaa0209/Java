package Function;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(6);
        fun("Java");

        int ans=sum(1,2);
        System.out.println(ans);

        int ans2=sum(1,2,3);
        System.out.println(ans2);

        demo(1,2);
        demo("abc","xyz");
//        demo() ambiguity
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
