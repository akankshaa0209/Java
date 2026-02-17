package Function;

public class Shadowing {
    static int x;
    public static void main(String[] args) {
        System.out.println(x);

//        int x=10; //initial x shadowed by this

        int x;
//        System.out.println(x); error
//        scope begins only when val is initialzed
        x=25;
        System.out.println(x);

        System.out.println(x);

        fun();
        Fun(x);
    }

    static void fun() {
        System.out.println(x);
    }

    static void Fun(int x) {
        System.out.println(x);
    }
}
