package Recursion;
//d,1
//public class Palindrome {
//    public static void main(String[] args) {
//        int n = 121;
//        System.out.println(isPalindrome(n)); // true
//    }
//
//    static boolean isPalindrome(int n) {
//        if (n < 0) return false;   // negative numbers are not palindrome
//
//        int original = n;
//        int rev = 0;
//
//        while (n != 0) {
//            int rem = n % 10;
//            rev = rev * 10 + rem;
//            n /= 10;
//        }
//
//        return original == rev;
//    }
//}

//using string
//static boolean isPalindrome(int n) {
//    String s = String.valueOf(n);
//    int l = 0, r = s.length() - 1;
//
//    while (l < r) {
//        if (s.charAt(l) != s.charAt(r)) return false;
//        l++;
//        r--;
//    }
//    return true;
//}

public class Palindrome{
    public static void main(String[] args){
        int n = 121;
        System.out.println(helper(n));
    }

    static boolean helper(int n){
        return n == palindrome(n,0);
    }

//    DRY RUN
//palindrome(121, 0)
//palindrome(12, 1)
//palindrome(1, 12)
//palindrome(0, 121)
//returns 121

    static int palindrome(int n, int rev){
        if( n == 0){
            return rev;
        }

        return palindrome(n/10, rev * 10 + n%10);
    }
}