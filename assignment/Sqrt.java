package assignment;
//https://leetcode.com/problems/sqrtx/description/

//inbuilt : int root = (int)Math.sqrt(n);

//sqrt(n)
//static int sqrt(int n){
//int i=1;
//while(i<=n/i){
//i++
//        }
//        return i-1;
//        }

public class Sqrt {
        public int mySqrt(int x) {  //logn, 1
            if (x == 0) {
                return 0;
            }
            int first = 1, last = x;
            while (first <= last) {
                int mid = first + (last - first) / 2;
                if (mid == x / mid) {
                    return mid;
                } else if (mid > x / mid) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
            }
            return last;
        }
}
