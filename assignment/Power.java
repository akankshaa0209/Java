package assignment;
//https://leetcode.com/problems/powx-n/submissions/1883825951/
public class Power {
//    double result = Math.pow(a, b);
        public static void main(String[] args) {
            int base = 2;
            int exp = 5;

            int result = 1;

            for (int i = 1; i <= exp; i++) {
                result *= base;
            }

            System.out.println(base + "^" + exp + " = " + result);
        }
    }
