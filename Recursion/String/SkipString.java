package Recursion.String;

//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

public class SkipString {
    public static void main(String[] args){
        //for below, it wont work as this logic is not handling newly formed string
//        String str = "daabcbaabcbc";
//        String target = "abc";

        String str = "bananaappleorangeapple";
        String target = "apple";
        String ans =removeSubstring(str, target);
        System.out.println(ans);
    }

    //n n stack
    static String removeSubstring(String s, String part){
//        if(s.isEmpty()) return "";
//
//        if(s.startsWith(part)){
//            return removeSubstring(s.substring(part.length()), part);
//        } else {
//            return s.charAt(0) + removeSubstring(s.substring(1), part);
//        }

        //stack based approach, works for all
        StringBuilder sb = new StringBuilder();
        int len = part.length();

        for (char ch : s.toCharArray()) {
            sb.append(ch);

            // Check if the end matches "part"
            if (sb.length() >= len &&
                    sb.substring(sb.length() - len).equals(part)) {
                sb.delete(sb.length() - len, sb.length());
            }
        }

        return sb.toString();
    }
}

//using replace() n,n
//static String removeApple(String s) {
//    return s.replace("apple", "");
//}

//use a stack-based approach to remove substrings dynamically as they form, ensuring all cascading removals are handled in linear time.
////class Solution {
////    public String removeOccurrences(String s, String part) {
////        Stack<Character> stack = new Stack<>();
////        for(char c : s.toCharArray()) {
////            stack.push(c);
////            if(stack.size() >= part.length() && stack.peek() == part.charAt(part.length()-1)) {
////                StringBuilder temp = new StringBuilder();
////                for(int i = 0; i < part.length(); i++) {
////                    temp.append(stack.pop());
////                }
////                temp.reverse();
////                if(!temp.toString().equals(part)) {
////                    for(char c : temp.toString().toCharArray()) {
////                        stack.push(c);
////                    }
////                }
////            }
////        }
////        StringBuilder ans = new StringBuilder();
////        while(!stack.isEmpty()) {
////            ans.append(stack.pop());
////        }
////        return ans.reverse().toString();
////    }
////}