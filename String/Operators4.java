package String;

//string concatenation/joining

// + is overloaded for string ==> operator overloading
// cpp, python support OO
// gives poor performance
// java does not support, only for string + is exception

import java.util.ArrayList;

public class Operators4 {
    public static void main(String[] args){
        System.out.println('a'+'b'); //will sum ascii
        System.out.println("a"+"b"); //concatenate string , creates new obj ab
        //since ab is not stored anywhere, it will be destroyed by garbage collection
        System.out.println('a'+3);
        System.out.println((char)('a'+3));

        //when int concatenated with string, it is converted to its wrapper class Integer that will call toString
        System.out.println("a"+3);
        System.out.println("a"+"3"); //same

        System.out.println("abc"+ new ArrayList<>());
        System.out.println("abc"+ new Integer(56));
        //conclusion-> obj will call its toString simply

//        System.out.println(new ArrayList<>() + new Integer(56));
        //only for 1)primitives and 2)when any one is string
        System.out.println(new ArrayList<>() + "" + new Integer(56));

        System.out.println("a"+'b'); //if one is str ans=str
    }
}
