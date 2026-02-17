package Arrays;

public class Array1 {
    public static void main(String[] args) {
        // store a roll number
        int a = 19;

        //store a name
        String name = "Abc";

        //store 3 roll no
        int a1=1;
        int a2=2;
        int a3=3;

//        int[] demo; //default val null
//        demo = new int[5];

        int[] roll = new int[5]; //ref var roll pointing to an array of type int[]
        //or directly
        int[] roll1 = {1,2,3,4,5};
        System.out.println(roll[0]);  //int arr by dafault has 0 values
        System.out.println(roll1[0]);

        String[] arr = new String[4];  //default null
        System.out.println(arr[0]);

//        String str = null;  can be assigned to non-primitives
//        int num = null; cant assign to non-primitives
//        null is default val of ref var


    }
}
