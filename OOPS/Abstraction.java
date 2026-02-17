package OOPS;

public class Abstraction {
    public static void main(String[] args){
        //step1: no use of creating obj of class Car
        //so we use "abstract keyword"
        //to say we cant create its object, its just a concept
//        Car c1 = new Car();
//        c1.start();

        Audi a1=new Audi();
        a1.start();
    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi started");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW started");
    }
}

abstract class Car{
//    String brand;
    int price;

    abstract void start();
    //abstract methods cant have a definition/body
    //definition is given by classes that extend this override method.
//    abstract void start(){
//        System.out.println("starting");
//    }

    //also inside abstarct class, we can create concrete function also
    //but ifc provide true abstraction, cant even create concrete class(with body inside)

    //default implementation
    void breaks(){
        System.out.println("breaking");
    }
}
