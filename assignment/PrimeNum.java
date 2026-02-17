package assignment;

public class PrimeNum { //sqrt(n)
    public static void main(String[] args) {
        int n = 20;
        System.out.println(isPrime(n));
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
