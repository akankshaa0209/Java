package OOPS;
//true abstraction, next level of abstarct
//all functions of interafce class by default abstract(no body)

public class Interfaces implements Cars, Persons{
    public static void main(String[] args){

    }

    @Override //annotation
    public void starting() {
        System.out.println("car is starting");
    }


    @Override
    public void walking() {
        System.out.println("walking");
    }
}

interface Cars{
   //public abstract void starting(); //by default

    //ifc provide true abstraction, cant even create concrete class
    //since it is by default abstract, so no body, true abstract
    void starting();

    //default keyword
    default void breakApplied(){
        System.out.println("break applied");
    }
}

interface Persons{
    void walking();
}
