package BitwiseNumberSystem;

//https://leetcode.com/problems/single-number-ii/description/

//hashmap n, n
//static int singleNumber(int[] nums) {
//    Map<Integer, Integer> map = new HashMap<>();
//
//    for (int num : nums) {
//        map.put(num, map.getOrDefault(num, 0) + 1);
//    }
//
 //map.keySet() → gives all unique numbers in the array
//    for (int key : map.keySet()) {
//        if (map.get(key) == 1) {
//            return key;
//        }
//    }

//or
//for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//    if (entry.getValue() == 1) {
//        return entry.getKey();
//    }
//}
//Avoids extra map.get(key) lookup

//    return -1;
//}

//sorting nlogn, 1
//static int singleNumber(int[] nums) {
//    Arrays.sort(nums);
//
//    for (int i = 0; i < nums.length - 1; i += 3) {
//        if (nums[i] != nums[i + 1]) {
//            return nums[i];
//        }
//    }
//    return nums[nums.length - 1];
//}
import java.util.Arrays;
public class AllNumbersThriceExceptOne {
    static int singleNumber(int[] nums) {
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 1; i += 3) {
        if (nums[i] != nums[i + 1]) {
            return nums[i];
        }
    }
    return nums[nums.length - 1];
}
        
}
