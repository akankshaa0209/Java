package BitwiseNumberSystem;

//https://leetcode.com/problems/power-of-two/solutions/4748857/8-approaches-cjavapythonjavascript-expla-tu3h/

//only one bit will be having 1 as bit, rest all bits will be zero.
//1000000 yes
//10010000 no

//righmost set bit is 0 = power of 2
//if (n & (n-1)) == 0 --> power of two

public class PowerOfTwo {
    public static void main(String[] args){
        int n = 0;
//        int n = 31;
        if (n <= 0) System.out.println(false);
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}

//public class Solution {  //logn, 1
//    public boolean isPowerOfTwo(int n) {
//        if (n == 0) return false;
//
//        while (n > 0) {
//            if (n == 1) return true;
//            if (n % 2 != 0) break;
//            n /= 2;
//        }
//        return false;
//    }
//}

//recursion logn, logn
//public class Solution {
//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) return false;
//        if (n == 1) return true;
//        return (n % 2 == 0) && isPowerOfTwo(n / 2);
//    }
//}
