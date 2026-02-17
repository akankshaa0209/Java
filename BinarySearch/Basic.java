package BinarySearch;

//use whenever arr is sorted
//break condition: while(s<=e)
//when while loop breaks, s = e+1

public class Basic {
    public static void main (String[] args){
      int[] arr = {-12, -11, 0, 3, 8, 12, 23,144};
      int target = 2;
      int ans = func(arr, target);
        System.out.println(ans);
    }

    //return the index, else -1
    static int func(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end-start)/2; //to avoid exceeding raneg of integers

            if(target < arr[mid]) {
                end = mid-1;
            } else if (target> arr[mid]){
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

//ORDER AGNOSTIC BS: main thing is to find order of arr
//compare 1st and last elements.
//static int func(int[] arr, int target){
//    int start = 0;
//    int end = arr.length - 1;
//
//    Boolean isAsc;
//    if(arr[start] < arr[end]) {
//        isAsc = true;
//    } else {
//        isAsc =  false;
//    }
//
//    while (start<=end) {
//        int mid = start + (end-start)/2; //to avoid exceeding raneg of integers
//
//        if (arr[mid] == target) {
//            return mid;
//        }
//
//        if (isAsc){
//        if(target < arr[mid]) {
//            end = mid-1;
//        } else {
//            start=mid+1;
//        }
//    } else {
//            if(target < arr[mid]) {
//                start = mid+1;
//            } else{
//                end=mid-1;
//            }
//        }
//    return -1;
//}
