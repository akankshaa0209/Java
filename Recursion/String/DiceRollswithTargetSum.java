package Recursion.String;

import java.util.ArrayList;

public class DiceRollswithTargetSum {


        public static void main(String[] args) {
            System.out.println(diceRet("", 4, new ArrayList<>()));
        }

        static ArrayList<String> diceRet(String p, int target,ArrayList<String> list) {
            if (target == 0) {
                list.add(p);
                return list;
            }
            ArrayList<String> list2 = new ArrayList<>();
            for (int i = 1; i <= 6 && i <= target; i++) {
                list2.addAll(diceRet(p + i, target - i, list));
            }
            return list;
        }

        static void diceFace(String p, int target, int face) {
            if (target == 0) {
                System.out.println(p);
                return;
            }

            for (int i = 1; i <= face && i <= target; i++) {
                diceFace(p + i, target - i, face);
            }
        }
}
