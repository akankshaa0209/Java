package String;

public class Comparison {
    public static void main(String[] args){
        String a="abc";
        String b="abc"; //a,b same pool

        // == (comparator)==============
        //checks if ref var are poinitng to same obj,
        // if yes, true else false
        System.out.println(a==b); //warning

        String c = a;
        System.out.println(c==a);

        //in general, both point to same obj
        // what scenario will it be 2 objs

        //how to create diff obj of same value (using new)
        String str1 = new String("abcd");
//        String str2 = new String("abcd");
        String str2 = new String("abcd ");
        System.out.println(str1==str2); //false
        //not pointing to same obj now
        //these created outside the pool but in heap

        //when only to check value, use .equals() method
        System.out.println(str1.equals(str2));

        //CHAR.AT============
        System.out.println(str1.charAt(1));

        //COMMAND LINE ARGUMENTS
        //        String[] args
    }
}
