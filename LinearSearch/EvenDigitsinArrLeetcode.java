package LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitsinArrLeetcode {
    public static void main (String[] args) {
        int[] arr = {12,345,2,6,7890};
        System.out.println(func(arr));
        System.out.println(digits(2));
    }

    static int func(int[] arr){
        int count = 0;
        for (int num:arr){
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

        //to find no of digits
//        return (int)(Math.log10(num)) + 1;

        if(num==0) return 1;
        int count =0;

        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }
}
