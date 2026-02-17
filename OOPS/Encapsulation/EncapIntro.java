package OOPS.Encapsulation;

public class EncapIntro {
    public static void main(String[] args){

    }

    //since it is public, so can be called from another pkg
    //check in inheritance
    //if we remove public, it wont be visible outside this pkg
    //although will be available to children
     public void doWork(){
        System.out.println("do work");
    }

    //not available outside this class only
    //not in other class within same pkg
    //not outside anywhere this pkg
//    private void doWork(){
//        System.out.println("do work");
//    }

}

class Ertiga extends Car{
    public Ertiga(String colour, int number){
        super(colour, number);
    }
    void about(){
        //if protected, then child class will be able to access
        System.out.println("car" + colour);
        //if we do colour in parent as private
        //it wont be accessible to child class also
//        System.out.println("car" + colour);
    }
}

class Car {
    protected String colour;
    int number;

    public Car(String colour, int number) {
        this.colour=colour;
        this.number=number;
    }
}
