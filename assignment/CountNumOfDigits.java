package assignment;

public class CountNumOfDigits {
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

//private int countDigits(int x) {
//        int cnt = 0;
//        while (x > 0) {
//            x /= 10;
//            cnt++;
//        }
//        return cnt;
//    }
