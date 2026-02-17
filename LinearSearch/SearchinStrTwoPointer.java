package LinearSearch;

import java.util.Arrays;

public class SearchinStrTwoPointer {
    public static void main (String[] args) {
        String name = "Java";
        char target = 'v';
        System.out.println(name);
//        System.out.println(Arrays.toString(name));
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchChar(name, target));
    }
    static boolean searchChar(String s, char target) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            if (s.charAt(left) == target || s.charAt(right) == target) {
                return true;
            }

            left++;
            right--;
        }

        return false;
    }

}
