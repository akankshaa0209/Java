package BitwiseNumberSystem;

//https://leetcode.com/problems/number-of-even-and-odd-bits/description/

public class NumofEvenOddBits {
    class Solution { //nlogn, 1
        public int[] evenOddBit(int n) {
            int even = 0, odd = 0;

            // int[] ans = new int[2];

            if(n == 0) return new int[]{0, 0};

            for(int i = 0; i < 32; ++i){
                if((n & (1 << i)) != 0){
                    if(i%2 == 1) odd++;
                    else even++;
                }
            }
            return new int[]{even, odd};
            // return ans;
        }
    }
}
