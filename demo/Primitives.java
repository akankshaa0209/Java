package demo;

//primitives get stored in call stack, cheaper, less space
//obje = heap,
//strings that are not explicitly created are stored in pool=string pool=heap = faster

public class Primitives {
    public static void main(String[] args) {
        int a = 1; //4
        char b = 'a';
        float c = 98.67f; //4
        double largeDecNum = 1234.45567789; //8
        long LargeIntNum = 372639862307l; //8
        boolean check = true;
        int d = 223_432;

        //wrapper class, class of PDT
//        Integer rollno = 64;
//        rollno.<gives so many methods>
//        rollno.toString();

        //String is not a primitive
        String name = "Java";

        // Printing all values
        System.out.println(a);
        System.out.println("int a = " + a);
        System.out.println("char b = " + b);
        System.out.println("float c = " + c);
        System.out.println("double largeDecNum = " + largeDecNum);
        System.out.println("long LargeIntNum = " + LargeIntNum);
        System.out.println("boolean check = " + check);
        System.out.println("String name = " + name);
        System.out.println(d);

        System.out.printf("Values: %d %c %.2f %.5f %d %b %s%n", a, b, c, largeDecNum, LargeIntNum, check, name);

    }
}
