package assignment;

public class ReverseWord {
//    public class ReverseWords {
        public static void main(String[] args) {
            String s = "hello world java";
            char[] arr = s.toCharArray();

            // Step 1: reverse full string
            reverse(arr, 0, arr.length - 1);

            // Step 2: reverse each word
            int start = 0;
            for (int i = 0; i <= arr.length; i++) {
                if (i == arr.length || arr[i] == ' ') {
                    reverse(arr, start, i - 1);
                    start = i + 1;
                }
            }

            System.out.println(new String(arr));  // java world hello
        }

        static void reverse(char[] arr, int left, int right) {
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

//}

//public class ReverseEachWord {
//    public static void main(String[] args) {
//        String s = "hello world java";  ///olleh dlrow avaj
//        char[] arr = s.toCharArray();
//
//        int start = 0;
//
//        for (int end = 0; end <= arr.length; end++) {
//
//            // When we hit space OR reach end of array
//            if (end == arr.length || arr[end] == ' ') {
//
//                // Reverse the current word
//                reverse(arr, start, end - 1);
//
//                // Move start to next word
//                start = end + 1;
//            }
//        }
//
//        System.out.println(new String(arr));
//    }
//
//    // helper reverse function
//    static void reverse(char[] arr, int left, int right) {
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//    }
//}

