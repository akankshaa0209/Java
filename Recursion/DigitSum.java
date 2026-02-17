package Recursion;

//F(1324) = 1 + F(342) = 3 + F(42) = 4 + F(2)

//F(N) = F(N/10) + F(N%10)

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
}
