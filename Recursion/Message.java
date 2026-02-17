package Recursion;

//way 1
//call message() 5 times
//way 2
//add sout in message 5 times

//TIP: debug see the call stack

//way 3 = recursion
public class Message {
    public static void main(String[] args) {
        // write a function that prints hello world
        //only call 1 fun, that should print 5 times
        message();
    }

    static void message() {
        System.out.println("Hello World");
        message1();
    }

    static void message1() {
        System.out.println("Hello World");
        message2();
    }

    static void message2() {
        System.out.println("Hello World");
        message3();
    }

    static void message3() {
        System.out.println("Hello World");
        message4();
    }

    static void message4() {
        System.out.println("Hello World");
    }
}
