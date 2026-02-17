package Stack;
//https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

public class RemoveAllOccuOfSubstring {
    class Solution {
        public String removeOccurrences(String s, String part) {
            StringBuilder sb = new StringBuilder();
            // int len = part.length();

            for (char ch : s.toCharArray()) {
                sb.append(ch);

//sb.substring(sb.length() - part.length()) : extracts the last n chars equal to len
                // Check if the end matches "part"
                if (sb.length() >= part.length() &&
                        sb.substring(sb.length() - part.length()).equals(part)) {
                    sb.delete(sb.length() - part.length(), sb.length());
                }
            }

            return sb.toString();
        }
    }

}

//class Solution {
//    public String removeOccurrences(String s, String part) {
//        Stack<Character> stack = new Stack<>();
//        for(char c : s.toCharArray()) {
//            stack.push(c);
//            if(stack.size() >= part.length() && stack.peek() == part.charAt(part.length()-1)) {
//                StringBuilder temp = new StringBuilder();
//                for(int i = 0; i < part.length(); i++) {
//                    temp.append(stack.pop());
//                }
//                temp.reverse();
//                if(!temp.toString().equals(part)) {
//                    for(char c : temp.toString().toCharArray()) {
//                        stack.push(c);
//                    }
//                }
//            }
//        }
//        StringBuilder ans = new StringBuilder();
//        while(!stack.isEmpty()) {
//            ans.append(stack.pop());
//        }
//        return ans.reverse().toString();
//    }
//}
