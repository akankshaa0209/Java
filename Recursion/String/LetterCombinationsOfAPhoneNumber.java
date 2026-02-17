package Recursion.String;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

//below solutions is of type: 1= "abc", 2="def"
public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        List<String> ans = letterCombinations("23");
        System.out.println(ans);

        System.out.println(letterCombinationsCount("23"));
    }

    //        =====================
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder combination = new StringBuilder();
        backtrack(result, mapping, combination, digits, 0);
        return result;
    }

    private static void backtrack(List<String> result, String[] mapping,
                                  StringBuilder combination, String digits, int index) {

        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        if (letters.isEmpty()) {
            backtrack(result, mapping, combination, digits, index + 1);
            return;
        }

        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(result, mapping, combination, digits, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

//    ======================

    public static int letterCombinationsCount(String digits) {
        if (digits == null || digits.length() == 0) return 0;

        String[] mapping = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        return countHelper(digits, 0, mapping);
    }

    private static int countHelper(String digits, int index, String[] mapping) {
        if (index == digits.length()) {
            return 1; // one valid combination formed
        }

        String letters = mapping[digits.charAt(index) - '0'];
        int count = 0;

        for (int i = 0; i < letters.length(); i++) {
            count += countHelper(digits, index + 1, mapping);
        }

        return count;
    }
}
