package assignment;

//count primes less than n
//Time: O(n log log n) (very fast)
//Space: O(n)
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args){
        int a = 10;
        int b = 30;
        System.out.println(countPrimes(a,b));
    }

    static int countPrimes(int left, int right) {
        if (right < 2) return 0;

        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

}

