package assignment;

public class NextPrime {
    public static void main(String[] args){
        int n=14;
        System.out.println(nextPrime(n));
    }
    static int nextPrime(int n) {
        int num = n + 1;

        while (true) {
            if (isPrime(num)) return num;
            num++;
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
