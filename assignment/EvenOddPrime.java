import java.util.Scanner;

public class EvenOddPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Even / Odd
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        // Prime Check
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }

//        boolean ans = isPrime(n);
//        System.out.println(ans);
    }

    static boolean isPrime(int n) {

        if (n <= 1) return false;   // 0, 1, negative numbers are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // all even numbers except 2 are not prime

        // check only odd numbers from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}

//// prime simpler logic
//static boolean isPrime(int n) {
////    int n = 13;
//
//    if (n <= 1) {
//        return false;
//    }
//
//    for (int i = 2; i < n; i++) {
//        if (n%i == 0){
//            return false;
//        }
//        return true;
//    }
//
//}

/// /second logic O(sqrt(n)) O(1)
//static boolean isPrime(int n)
//{
//    // Corner case
//    if (n <= 1)
//        return false;
//
//    // Check from 2 to sqrt(n)
//    for (int i = 2; i <= Math.sqrt(n); i++)
//        if (n % i == 0)
//            return false;
//
//    return true;
//}

//static boolean isPrime(int n)  O(N) O(1)
//{
//    // Corner case
//    if (n <= 1)
//        return false;
//
//    // Check from 2 to n/2
//    for (int i = 2; i <= n / 2; i++)
//        if (n % i == 0)
//            return false;
//
//    return true;
//}
