package BitwiseNumberSystem;

//Brian Kernighan’s Algorithm
//Removes the rightmost set bit each time.

//| Step      | n    | count |
//        | --------- | ---- | ----- |
//        | start     | 1010 | 0     |
//        | n & (n-1) | 1000 | 1     |
//        | n & (n-1) | 0000 | 2     |

public class CountSetBits {
    public static void main(String[] args){
        int n=10;
        //binary representation
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(10));
    }
    static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

//        while(n>0){
//            if((n&1) == 1){
//                count++;
//                n = n >>1;
//            }
//        }

        return count;
    }

    //built in java code
//    static int countSetBits(int n) {
//        return Integer.bitCount(n);
//    }

}
