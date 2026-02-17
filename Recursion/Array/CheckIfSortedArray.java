package Recursion.Array;

//arr = [1,2,4,5]
// (arr, 0)  ---> 1<2 && (arr,1) ----> 2<4 && (arr,2)
// ---> 4<5 && (arr, 3) (ret true)

public class CheckIfSortedArray {
    public static void main(String[] args){
        int[] arr = {1,2,4, 6,4};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index){
        int n = arr.length;

        if(index==n-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }

        //in evry call, arr obj passed is same only(pass by val)
        //all differnt ref var, pointing to same arr obj
        return isSorted(arr, index+1);

        //return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}

//brute
//static boolean isSorted(int[] arr) {
//    for (int i = 0; i < arr.length - 1; i++) {
//        if (arr[i] > arr[i + 1]) {
//            return false;
//        }
//    }
//    return true;
//}
