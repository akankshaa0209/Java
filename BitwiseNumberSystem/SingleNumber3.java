package BitwiseNumberSystem;

import java.util.HashSet;

//https://leetcode.com/problems/single-number-iii/submissions/1882816950/

public class SingleNumber3 {
    class Solution {
        public int[] singleNumber(int[] nums) {
            HashSet<Integer> res = new HashSet<>();
            for (int num : nums) {
                if (!res.contains(num)) {
                    res.add(num);
                } else {
                    res.remove(num);
                }
            }
            int[] result = new int[2];
            int i = 0;
            for (int num : res) {
                result[i++] = num;
            }
            return result;
        }
    }

// class Solution {
//     public int[] singleNumber(int[] nums) {
//         List<Integer>list=new ArrayList<>();
//         int[] ans=new int[2];
//         Map<Integer,Integer>mp=new HashMap<>();
//         for(int i:nums){
//             mp.put(i,mp.getOrDefault(i,0)+1);
//         }
//         mp.forEach((u,v)->{
//             if(v==1){
//                 list.add(u);
//             }
//         });
//         for(int i=0;i<list.size();i++){
//             ans[i]=list.get(i);
//         }
//         return ans;
//     }
// }
}
