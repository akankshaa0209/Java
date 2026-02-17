package Sorting;

//other sorting algo give a worst case complexity of O(n2) or O(nlogn)

//pattern:
//when given numbers from range 1 to n********
//eg, 3,5,2,1,4
//given 1 to n, find missing number
//given unsorted arr, find smallest missing positive number
// 1 to n, find duplicate

//tip:
//[0,n] = every ele will be at idx = value
//[1,n] = every ele will be at idx = value-1


//3,5,2,1,4  -after sorting ---> 1,2,3,4,5 - index=value-1(as index starts from 0)
// how will we sort in 1 pass?
//start from 0th index-->chack if ele is at correct idx(ele-1)
//if yes move forward, otherwise swap.

//worst case swaps:n-1
//TC=O(N)

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i =0;
        while (i<arr.length){
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct] ){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
