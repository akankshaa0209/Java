package Recursion.String;

import java.util.ArrayList;

public class StringPermutation {

    public static void main(String[] args) {
        String s = "abc";
//        ArrayList<String> ans = new ArrayList<>();
//
//        char[] arr = s.toCharArray();
//        permute(0, arr, ans);

        ArrayList<String> ans = permuteString(s);

        System.out.println(ans);
    }

    static ArrayList<String> permuteString(String s) {
        ArrayList<String> res = new ArrayList<>();
        permute(0, s.toCharArray(), res);
        return res;
    }


    static void permute(int index, char[] arr, ArrayList<String> ans) {
        if (index == arr.length) {
            ans.add(new String(arr)); //creating char arr to string to store in ans
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(index + 1, arr, ans);
            swap(arr, index, i); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
