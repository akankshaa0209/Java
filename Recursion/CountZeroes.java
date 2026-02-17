package Recursion;

//rec
//F(N,C) = if digit =0 then F(N/10, C+1)
//                     else F(N/10, C)

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(30210004));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

}

//static int countZeros(int n) { //d,1
//        if (n == 0) return 1;
//
//        int count = 0;
//        while (n != 0) {
//            if (n % 10 == 0) {
//                count++;
//            }
//            n /= 10;
//        }
//        return count;
//    }

//string d,d
//static int countZerosUsingString(int n) {
//    String s = String.valueOf(n);
//    int count = 0;
//
//    for (int i = 0; i < s.length(); i++) {
//        if (s.charAt(i) == '0') {
//            count++;
//        }
//    }
//    return count;
//}
