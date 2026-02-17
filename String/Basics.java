package String;
//collection of characters
//class of java
//internally its a char array

//String a = "abc";
//String b = "abc";
//are both in stack a)pointing to same obj in heap or b)different obj in heap

//STRING POOL:
//  separate memory structure inside the heap
//  why? all similar values of str are not re-created in the pool
//  hence ans a)
//  makes program more optimized, no need to create 10 obj for 10 ref var pointing to same data
//  ex, a-->"abc", b-->"abc"
//  what if a makes some changes in obj
//  in case of arrays, it changes for other var as well
//  but for string, it won't change for other. WHY?
//  Bcz immutable, once obj made, we cannot change it.
//  if you want to change, only way is creating new obj

// why string immutable-->security

public class Basics {
    public static void main(String[] args){
        int num = 10; //primitive, stored in stack mmry

        int[] arr={1,2,3}; //ref var arr in stack, pointing to obj in heap
        //any change in arr, will change main obj

        String name="Java";
        //data type | ref var | object
        System.out.println(name);

        String a = "abc"; //already in pool
        System.out.println(a);
        a="abcd"; //creating a new object in pool
        //a now points to abcd obj
        System.out.println(a);
        //"abc" obj now - garbage collection.

        //why we can't modify string object (like we can for array)
        //eg, suppose 4 person have name "abc", all pointing to same obj
        //now if 1 decides to change, if allowed, he will change
        // but it will change other's name as well
        // for security reasons, immutable

    }
}
