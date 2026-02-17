package demo;

public class ReverseNum {
    public static void main(String[] args) {
        int n = 12345;

        int ans = 0;
        while (n > 0) {
            int rem = n%10;
            n = n/10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}

////reverse string (using char array)
//String str = "hello";
//char[] arr = str.toCharArray();
//String rev = "";
//
//for (int i = arr.length - 1; i >= 0; i--) {
//rev += arr[i];
//        }
//
//        System.out.println(rev);

////reverse string (stringbuilder)
//String rev = new StringBuilder(str).reverse().toString();
//        System.out.println(rev);

//public class ReverseVowelsOnly {
//    public static void main(String[] args) {
//        String str = "hello";
//        System.out.println(reverseVowels(str));  // holle
//    }
//
//    public static String reverseVowels(String s) {
//        char[] arr = s.toCharArray();
//        int left = 0, right = arr.length - 1;
//
//        while (left < right) {
//            // move left pointer to next vowel
//            while (left < right && !isVowel(arr[left])) {
//                left++;
//            }
//
//            // move right pointer to previous vowel
//            while (left < right && !isVowel(arr[right])) {
//                right--;
//            }
//
//            // swap vowels
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//        }
//
//        return new String(arr);
//    }
//
//    // helper function to check vowel
//    public static boolean isVowel(char c) {
//        c = Character.toLowerCase(c);
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//    }
//}
