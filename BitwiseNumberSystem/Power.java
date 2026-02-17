package BitwiseNumberSystem;
//https://leetcode.com/problems/powx-n/

//brute force n
//public double myPow(double x, int n) {
//    double res = 1;
//    for (int i = 0; i < Math.abs(n); i++) {
//        res *= x;
//    }
//    return n < 0 ? 1 / res : res;
//}

//eg 2.0^(-5)
public class Power {  //logn
        public double myPow(double x, int n) {
            long power = n;  //handles Integer.MIN_VALUE

            if (power < 0) {
                x = 1 / x;
                power = -power;
            }

            double result = 1;

            while (power > 0) {
                if (power % 2 == 1) {
                    result *= x;
                }

                x = x * x;

                power = power / 2;
            }

            return result;
        }
    }
