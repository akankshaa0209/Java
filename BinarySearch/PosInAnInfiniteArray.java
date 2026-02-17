package BinarySearch;

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
//arr = [2,3,5,6,7,8,10,11,12,15,20,23,30] target =15
//brute : o(n): keep iterating
//optimal: since sorted, so BS
//since its infinite arr, so we don't have end, arr.length cant be used.
//iug
 //APPROACH: move chunckwise(s,e) and see ig target exists in that chunk
//reverse BS (visualize diagram) logN steps, double size everytime.
// doubling the size and finding the range. logn+logn

public class PosInAnInfiniteArray {
    public static void main (String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        System.out.println(ans(arr,10));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            //double size
            int newEnd= end +(end -start + 1) * 2;
            start = newStart;
            end = newEnd;
        }
        return func(arr, target, start, end);
    }

    static int func(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length - 1;
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
