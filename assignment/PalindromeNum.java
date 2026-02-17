package assignment;

// time O(d)= O(logn). space O(1)
public class PalindromeNum {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;     // last digit
            rev = rev * 10 + digit;   // build reverse
            num = num / 10;           // remove last digit
        }

        if (original == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}

////====n, n
//public class Palindrome {
//    public static void main(String[] args) {
//        int num = 1212;
//
//        String number = String.valueOf(num);
//
//        String rev = new StringBuilder(number).reverse().toString();
//
////        if (number.equals(rev)) {  /////comparing strings
////            System.out.println("Palindrome Number");
////        } else {
////            System.out.println("Not a Palindrome Number");
////        }
//
//        int n = Integer.parseInt(rev);
//
//        if (num == n) {
//            System.out.println("Palindrome Number");
//        } else {
//            System.out.println("Not a Palindrome Number");
//        }
//    }
//}

/// / recursion n^2, n
//public static String reverse(String s) {
//    if (s.length() <= 1) return s;
//    return reverse(s.substring(1)) + s.charAt(0);
//}
//
//public static void main(String[] args) {
//    int num = 121;
//    String s = String.valueOf(num);
//
//    if (s.equals(reverse(s)))
//        System.out.println("Palindrome");
//    else
//        System.out.println("Not Palindrome");
//}

/// / 2-pointers n, 1
//int num = 121;
//
//char[] arr = String.valueOf(num).toCharArray();
//
//        int i = 0, j = arr.length - 1;
//while (i < j) {
//char temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
//i++; j--;
//        }
//
//String rev = new String(arr);
//
//if (rev.equals(String.valueOf(num)))
//        System.out.println("Palindrome");
//else
//        System.out.println("Not Palindrome");
//
//
//int num = 121;
//char[] arr = String.valueOf(num).toCharArray();
//
//        int left = 0, right = arr.length - 1;
//boolean palindrome = true;
//
//while (left < right) {
//        if (arr[left] != arr[right]) {
//palindrome = false;
//        break;
//        }
//left++;
//right--;
//        }
//
//        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");