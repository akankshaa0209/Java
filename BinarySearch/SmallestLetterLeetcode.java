package BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

//APPROACH 1 (Brute force)
//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        for(int i =0; i<letters.length; i++)
//            if(letters[i]>target)
//                return letters[i];
//        return letters[0];
//    }
//}

//APPROACH 2:
//1. exact same as ceilinh
//2. ignore the target (as we don't consider =)
//3. arr[c,d,f,j]  target=j ===>>> c

public class SmallestLetterLeetcode {
    public static void main (String[] args){
        char[] arr = {'c', 'f', 'j'};
//        System.out.println(func(arr, 'g'));
        System.out.println(func(arr, 'j'));
        System.out.println(func(arr, 'a'));
    }

    static char func(char[] arr, char target) {
        int n = arr.length;

        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
