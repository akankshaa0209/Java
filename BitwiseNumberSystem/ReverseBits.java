package BitwiseNumberSystem;
//https://leetcode.com/problems/reverse-bits/solutions/4167696/beats-100-easy-to-understand-by-gurjaspr-13ox/

public class ReverseBits {
    class Solution {
        public int reverseBits(int n) {
            // int ans = 0;
            // for (int i = 0; i < 32; i++) {
            //     ans <<= 1;
            //     ans |= (n & 1);
            //     n >>= 1;
            // }
            // return ans;
            return Integer.reverse(n);
        }
    }
}

//How it works
//
//Take last bit of n
//
//Append it to result
//
//Shift n right
//
//Repeat for 32 bits
