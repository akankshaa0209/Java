package Arrays;

//In java, we only have call by val
//when we pass an obj's ref, it is gonna take copy of that ref
//which is gonna point to same obj

import java.util.Arrays;

public class PassingInFunc3 {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 99;
    }
}
