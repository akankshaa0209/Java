package assignment;
//https://leetcode.com/problems/count-primes/description/

public class PrimesLessThanN { // n*sqrt(n)
        public static void main(String[] args) {
            int n = 40;
            int count=0;
//            System.out.println(isPrime(n));
            for(int i = 2; i<40;i++){
//                System.out.println(i + " " + isPrime(i));
                if(isPrime(i) == true){
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println(count);
        }

        static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    return false;
                }
                c++;
            }
            return true;
        }
    }

//static boolean isPrime(int n) {  //n
//        if (n <= 1) return false;
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

