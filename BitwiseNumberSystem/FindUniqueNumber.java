package BitwiseNumberSystem;

//https://leetcode.com/problems/single-number/description/

//given an array of nums, each no appears twice, only one appears once
//find that unique num

//brute force
//sort and check, nlogn, 1
//static int singleNumber(int[] nums) {
//    Arrays.sort(nums);
//
//    for (int i = 0; i < nums.length - 1; i += 2) {
//        if (nums[i] != nums[i + 1]) {
//            return nums[i];
//        }
//    }
//    return nums[nums.length - 1];
//}

//frequency array  n,n
//static int singleNumber(int[] nums) {
//    int[] freq = new int[100001]; // depends on constraints
//
//    for (int num : nums) {
//        freq[num]++;
//    }
//
//    for (int num : nums) {
//        if (freq[num] == 1) {
//            return num;
//        }
//    }
//    return -1;
//}

//hashmap
//static int singleNumber(int[] nums) {
//    Map<Integer, Integer> map = new HashMap<>();
//
//    for (int num : nums) {
//        map.put(num, map.getOrDefault(num, 0) + 1);
//    }

//for (int num : nums) {
//        if (map.containsKey(num)) {
//        map.put(num, map.get(num) + 1);
//        } else {
//        map.put(num, 1);
//    }
//            }
//
//    for (int num : map.keySet()) {
//        if (map.get(num) == 1) {
//            return num;
//        }
//    }
//    return -1;
//}

public class FindUniqueNumber {  //n,1
        public static void main(String[] args) {
            int[] arr = {2, 3, 3, 4, 2, 6, 4};
            System.out.println(ans(arr));
        }

        //a^a=0
    // and at the end alll will be ^ to 0 and 0^a=a(unique)

        private static int ans(int[] arr) {
            int unique = 0;

            for(int n : arr) {
                unique ^= n;
            }

            return unique;
        }
}

//{-2,3,2,4,-5,5,-4} --> add all and at the end only 3 will be left
