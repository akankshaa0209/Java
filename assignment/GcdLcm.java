package assignment;

//brute
//static int gcdBrute(int a, int b) { min(a,b)
//    int gcd = 1;
//    for (int i = 1; i <= Math.min(a, b); i++) {
//        if (a % i == 0 && b % i == 0) {
//            gcd = i;
//        }
//    }
//    return gcd;
//}

public class GcdLcm {
    public static void main(String[] args) {
        System.out.println(lcm(2, 7));
        System.out.println(gcd(7,14));
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
