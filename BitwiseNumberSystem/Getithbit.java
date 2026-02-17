package BitwiseNumberSystem;

//given : 10110110
//index= 8th,7th,6th,5th,4th,3rd,2nd,1st
//find 5th bit: 1 (5th from rightside)

public class Getithbit {
    public static void main(String[] args){
        int n=10;
        int ans = getithbit(10, 5);
        System.out.println(ans);
    }

    static int getithbit(int n, int i){
        int mask= 1<<i;
        int val = n & mask;

        return val == 0 ? 0 : 1;
//        return (n & (1 << i)) == 0 ? 0 : 1; one line only
    }
}
