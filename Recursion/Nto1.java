package Recursion;

public class Nto1 {
    public static void main(String[] args){
        print(5);
        printBoth(5);
    }

    //concept n-- vs --n  = n-1
    static void concept(int n){
        if(n==0) return;
        System.out.println(n);
        //concept(n--); //passes val first then subtracts so, will always be passing 5 only
        concept(--n);
    }

    //print and then call rec call
    static void print(int n){
        if(n==0) return; //won't print this

        //will print 5 then will call f(4) to print 4,3,2,1
        System.out.println(n); //nto1
        print(n-1);
    }

    //when emptying the stack, then only print
    //when function call has finished executing, then only print
    static void printRev(int n){
        if(n==0) return; //won't print this
        print(n-1);
        System.out.println(n); //1 to n
    }

    static void printBoth(int n){
        if(n==0) return; //won't print this
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n); //1 to n
    }
}
