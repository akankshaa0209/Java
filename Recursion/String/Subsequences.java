package Recursion.String;

//TC= p/np for each: subset: 2^n: each subset, we may copy up to n elements.
//TC= N * 2^N

//SC: rec stck=n, for 2^n subsets= n * 2^N

//Backtracking does NOT reduce Time Complexity because it still explores all possible choices.
//It only helps organize the solution — not reduce the number of computations.
//Backtracking is just:
//
//“Try → Explore → Undo → Try next”
//
//It does NOT skip valid possibilities unless pruning is applied.

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
//        subseq("", "abc");

        ArrayList<String> ans = subsequence("abc");
        System.out.println(ans);

//        ArrayList<String> ans=subseqRet("", "abc", new ArrayList<>());
//        System.out.println(ans);

//        subseqAscii("", "abc");
//        System.out.println(subseqAsciiRet("", "abc"));
    }

    //type 1=====================
    static ArrayList<String> subsequence(String str){
        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        int index=0;
        solve(str, output, index, ans);
        return ans;
    }

    static void solve(String str, String output, int index, ArrayList<String> ans){
        if(index>=str.length()){
//            if(output.length()>0){
                ans.add(output);
//            }
            return;
        }

        //dont pick char
        solve(str, output, index+1, ans);

        //pick char
        char ele= str.charAt(index);
        solve(str, output+ele, index+1, ans);

        //ascii
//        solve(str, output + (int) ele, index + 1, ans);

    }

    //print subsequences===============
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //add left side call
        subseq(p + ch, up.substring(1));
        //or ignore
        subseq(p, up.substring(1));
    }

    //return as arraylist==================
    static ArrayList<String> subseqRet(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
//        ArrayList<String> left = subseqRet(p + ch, up.substring(1), list);
//        ArrayList<String> right = subseqRet(p, up.substring(1), list);

        subseqRet(p + ch, up.substring(1), list);
        subseqRet(p, up.substring(1), list);
//        left.addAll(right);
        return list;
    }

    //print subset as well as ascii values of chars
    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    //return list
    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
