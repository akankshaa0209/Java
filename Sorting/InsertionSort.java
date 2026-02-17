package Sorting;

//stable
//dynamic, adaptive, no of swaps reduced than bubble
// used for smaller n, works good for partially sorted
//used in hybrid sorted data
//sorts in parts, 1st till idx1, then till idx2 and so on
//insert every ele at its correct position
//tc n2, n
// sc 1

// i >= n-2, j>0


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {1,3,5,12,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));;
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                } else {
                    break;
                }
            }
        }
        // Print the sorted array
//        System.out.println("After selection sort:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
    }
}

//for (int i=0; i<n-1;i++){
//int j = i;
//        while(j >0&&arr[j] <arr[j -1]){
//int temp = arr[j];
//arr[j]=arr[j -1];
//arr[j -1]=temp;
//j--;
//        }
//        }
