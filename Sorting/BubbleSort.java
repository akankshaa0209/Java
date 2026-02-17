package Sorting;

//places max at end

// SC=1 (in-place sorting)
//TC=best n(asc), worst n2(sorted in opposite)
//best case comparison = n-1
//worst (eg= (n-1)+(n-2)+(n-3)+(n-4)=n2
//sinking sort
//exchange sort
//with 1st pass, largest ele comes at end of array
//in each itn, largest element comes at last

// [3,1,5,4,2]
//  i j

//stable: order should be same when the values are equal
// preserves the original relative order of equal elements

//stable: merge, insertion, bubble
//unstable: QuickSort, HeapSort, and SelectionSort

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
     int[] arr ={2,3,5,8,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            Boolean swapped=false;   //optimal O(N). The best case occurs if the given array is already sorted.
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
