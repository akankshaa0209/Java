package String;

import java.util.Arrays;

public class Output3 {
    public static void main(String[] args){
        System.out.println(56);  //int //stack
        //out is var of type PrintStream(class)
        //PrintStream has println
        //anything we call in println -> calls toString method
        Integer num = new Integer(56);  //wrapper class ,heap
        System.out.println(num.toString());
        //by using wrapper class, we can access many methods

        System.out.println("name");  //string

        System.out.println(new int[]{1,2,3});  //object type
        //function overloading
        //arr, hashmap = obj
        //obj-->.value-->.toString
        // . to access function/method obj has
        // hexadecimal output

        System.out.println(Arrays.toString(new int[]{1,2,3}));
        //here we specify to use arrays' tostring method

        String name = null;
        System.out.println(name);

        System.out.printf("hi i am %s and i am %s", "abc", "cool");
        System.out.printf("pie: %.3f", Math.PI);

        //placeholders
        //%n = new line
        //%f = floating
        //%i=int
        //%s=string
        //c character
        //d decimal
    }
}
