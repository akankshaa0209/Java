package ArrayAssignment;

import java.util.HashMap;
import java.util.Map;

//n,n
//if range small, use counting array.
public class FreqOfMostFreqElement {
    public static int mostFrequent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int element = 0;

        for (int num : nums) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                element = num;

//            maxFreq = Math.max(maxFreq, freq);
            }
        }

        return maxFreq;
    }
}
