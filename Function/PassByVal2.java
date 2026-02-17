package Function;

import java.util.Arrays;

public class PassByVal2 {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(arr); //will print mmry ref.
        System.out.println(Arrays.toString(arr));
        //when ref of arr object is passed as a param to change,
        //its passed as call by value,
        //val being paased refers to the obj.
    }

    static void change(int[] nums) {
        nums[0] = 100;
    }
}
