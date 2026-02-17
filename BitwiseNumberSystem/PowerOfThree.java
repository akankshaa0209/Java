package BitwiseNumberSystem;

//http://leetcode.com/problems/power-of-three/solutions/6053168/0-ms-runtime-beats-100-user-confirm-step-vxgx/

public class PowerOfThree { ////logn, 1
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}

//bool isPowerOfThree(int n) { //logn, logn
//        if(n==0){
//            return false;
//        }
//        else if(n==1){
//            return true;
//        }
//        return n%3==0 && isPowerOfThree(n/3);
//    }
