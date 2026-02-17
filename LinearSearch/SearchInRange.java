package LinearSearch;

//arr = [18,12,-7,3,14,28]
//search for 3 in range of index [1,4]

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums= {18,12,-7,3,14,28};
        int ans = func(nums, 3, 1,4);
        System.out.println(ans);

    }

    static int func(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
