package Recursion.String;
//“We generate all numbers from 0 to 2ⁿ−1 and use their binary representation to decide which elements are included.”

//n*2^n both
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));

        System.out.println(powerSet("abc"));
    }

    public static List<String> powerSet(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();
        int total = 1 << n; // 2^n

        for (int mask = 0; mask < total; mask++) {
            StringBuilder subset = new StringBuilder();

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.append(s.charAt(i));
                }
            }
            res.add(subset.toString());
        }
        return res;
    }


    public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;

            int total = 1 << n; // 2^n

            for (int mask = 0; mask < total; mask++) {
                List<Integer> subset = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        subset.add(nums[i]);
                    }
                }
                res.add(subset);
            }
            return res;
        }

}
