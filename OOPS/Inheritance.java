package OOPS;

//inheritance
//super keyword
//runtime polymorphism

import OOPS.Encapsulation.EncapIntro;

public class Inheritance {
    public static void main(String[] args){
        System.out.println("hello");
        PersonBase p4= new PersonBase("Inherit", 31);

        Developer d1=new Developer("Developer", 22);
        d1.eat();
        d1.walk(4);
        d1.walk(); //first searches in current class, if not found then goes above
        //d1.equals()//coming from object
        //in java, all objects have object class as parent(super parent)
        //thats why inherits from them

        EncapIntro obj = new EncapIntro();
        obj.doWork();
    }
}

class Manager extends Person{
    public Manager(String name, int age){
        super(name,age);
    }
}

class Developer extends PersonBase{
    public Developer(String name, int age){
        //super used to call parent constructor
        super(name, age);
    }

    //run time polymorphism : runtime linking
    void walk(){
        System.out.println("Developer " + name + " is walking");
    }
}

//class
class PersonBase {
    String name;
    int age;

    static int count;

    public PersonBase(String name, int age){
        this.name=name;
        this.age=age;
    }

    //methods
    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

    //compile time polymorphism
    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
}
