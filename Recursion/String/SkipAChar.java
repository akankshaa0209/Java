package Recursion.String;

public class SkipAChar {
    public static void main(String[] args){
        String str="abcda";
        skip("", str);
    }
    static void skip(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = original.charAt(0);

        if(ch=='a'){
            skip(ans, original.substring(1));
        } else {
            skip(ans+ch, original.substring(1));
        }
    }
}

//static String removeA(String s) {
//    if (s.isEmpty()) {
//        return "";
//    }
//
//    char ch = s.charAt(0);
//
//    if (ch == 'a') {
//        return removeA(s.substring(1));
//    } else {
//        return ch + removeA(s.substring(1));
//    }
//}

//using stringbuilder
//static String removeA(String s) {
//    StringBuilder result = new StringBuilder();
//
//    for (char ch : s.toCharArray()) {
//        if (ch != 'a') {
//            result.append(ch);
//        }
//    }
//    return result.toString();
//}

