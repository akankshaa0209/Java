package Sorting;

//PIVOT: choose any ele --> after first pass:
// all ele < pivot will be at LHS
// all ele > pivot will be at RHS

//unstable
//in-place: prefferd over MS for arrays as MS take O(N) extra space, although rec is taking space here also
//cache friendly algo
//MS is better in linked list due to non-con memory allocation
//recursive
//tc nlogn, n2
//sc = n, aux stack space

// vs Merge sort:
// MS goes till end even when arr is already sorted, but not QS

//Timsort= Merge + Insertion

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        //Internal sorting algo:
//        Arrays.sort(arr);
    }

    static void sort(int[] arr, int low, int high){
        if(low>= high) return;

        int s= low;
        int e= high;
        int m=s+(e-s)/2;
        int pivot = arr[m];

        while (s<=e){
            while (arr[s] < pivot) {
                s++;
            }

            while (arr[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr,s,high);
    }
}
