package CollectionsFramework;

import java.util.Arrays;

public class LearnArraysClass {
    static void main(String[] args) {

//        int[] num = {1,2,3,4,5,6,7,8,9};
//        int index= Arrays.binarySearch(num, 4);
//        System.out.println("index of 4 is " + index);

        Integer[] nums2= {1,34,6,21,3};
//        Arrays.sort(nums2); //quick sort
//        System.out.println(Arrays.toString(nums2));

        Arrays.fill(nums2, 12);

        for (int i : nums2){
            System.out.print(i + " ");
        }


    }
}
