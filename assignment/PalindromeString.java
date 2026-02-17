package assignment;

/// / ====n2, n============
//public class PalindromeString {
//    public static void main(String[] args) {
//        String str = "hello";
//
////        Scanner in = new Scanner(System.in);
////        String str = in.next();
//
//        String rev = "";
//
//        int n = str.length();
//
//        for (int i = 0; i < n; i++) {
//            rev = str.charAt(i) + rev;
////            System.out.println(rev);
//        }
//
////        for (int i = n-1; i >= 0; i--) {
////            rev += str.charAt(i);
////        }
//
//        if ( rev.equals(str)){
//            System.out.println("Palindrome");
//            System.out.println(rev);
//        } else{
//            System.out.println("no");
//        }
//    }
//}


//// n, n
//public class PalindromeString {
//    public static void main(String[] args) {
//        String str = "aba";
//
////        Scanner in = new Scanner(System.in);
////        String str = in.next();
//
//////        boolean isPal = str.equals(new StringBuilder(str).reverse().toString());
//
//        String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(rev);
//
//////        new StringBuilder(str) → creates a mutable string buffer.
//////        .reverse() → reverses characters inside the buffer.
//////        .toString() → converts it back to an immutable String.
//
//        if ( rev.equals(str)){
//            System.out.println("Palindrome");
//            System.out.println(rev);
//        } else{
//            System.out.println("no");
//        }
//    }
//}

    /// /n, n
public class PalindromeString {
    public static void main(String[] args) {
        String str = "caba";
        str=str.toLowerCase();

////        if(str==null||str.length()==0) return;

//        Scanner in = new Scanner(System.in);
//        String str = in.next();

        char[] arr = str.toCharArray();

         int i = 0;
         int j = arr.length - 1;

         while(i < j) {
             char temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

             i++;
             j--;
         }

         String rev = new String(arr);

        if ( rev.equals(str)){
            System.out.println("Palindrome");
            System.out.println(rev);
        } else{
            System.out.println("no");
            System.out.println(rev);
        }
    }
}

/// / n^2, n
//public class ReverseStringUsingrecursion {
//    public static String reverse(String str) {
//        if (str.isEmpty()) {
//            return str;   // base case
//        }
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
//
//    public static void main(String[] args) {
//        String str = "hello";
//        System.out.println(reverse(str));   // olleh
//    }
//}