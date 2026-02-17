package OOPS;

public class MainClass {
    public static void main(String[] args){
        System.out.println("hello");

        //objects
        Person p1 = new Person(); //constructor called
        p1.age=22;
        p1.name="abc";

        Person p2 = new Person(); //constructor called
        p2.age=23;
        p2.name="cba";

        //Constructor overloading
        Person p3 = new Person("abcd", 24);

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p1.walk(2);
        p2.walk();
        p3.walk(4);

        //number of times constructor called
        System.out.println(Person.count);
        System.out.println(Person.constOverloadingCount);
    }
}

//class
class Person {
    //properties/variables
    String name;
    int age;

    static int count;

    //to check constructor call when we create objects
    public Person(){
        count++;
        System.out.println("creating new object by calling defauly constructor");
    }

    static int constOverloadingCount;

//    //constructor overloading: to initialize obj created
//    public Person(String newName,int newAge){
//        this(); //will call above constructor, inc count, print sout then below will be executed
//        name=newName;
//        age=newAge;
//        constOverloadingCount++;
//    }
    public Person(String name,int age){
        this(); //will call above constructor, inc count, print sout then below will be executed
        this.name=name;
        this.age=age;
        constOverloadingCount++;
    }

    //methods
    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
}
