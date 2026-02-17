package assignment;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/solutions/

public class NumbersWithEvenNumOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        // for (int num:nums){
        for (int num:nums){
            if(even(num)) {
                count++;
            }
        }
        return count;
    }
    static Boolean even (int num) {
        int numofdigits = digits(num);
        return numofdigits%2==0;
    }

    static int digits(int num){
        if(num<0){
            num =  num* -1;
        }

        if(num==0) return 1;
        int count =0;

        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
}
