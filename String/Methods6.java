package String;

import java.util.Arrays;

public class Methods6 {
    public static void main(String[] args){
        String name = "Java is a Programming Language";
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.length());

        System.out.println(name.toLowerCase()); //creating new obj(immu)
        System.out.println(name);

        System.out.println(name.indexOf('A')); //first
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a', 7));

        System.out.println(name.replace('a','A'));

        System.out.println("  abc def  ".strip()); //removes whitespaces
        System.out.println(Arrays.toString(name.split(" ")));

        String str="abcdefgh";
        System.out.println(str.substring(1));




    }
}
