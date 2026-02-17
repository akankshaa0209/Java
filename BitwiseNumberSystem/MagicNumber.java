package BitwiseNumberSystem;

public class MagicNumber {  //tc=logn
    public static void main(String[] args) {
        int n = 5;

        int ans = 0;
        int base = 5;

        while (n > 0) {
            int lastdigit = n & 1;
            n = n >> 1;
            ans += lastdigit * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}

//no of digit in base b representation of n
//int ans=(int)(Math.log(n) / Math.log(b)) + 1;
