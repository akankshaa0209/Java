package BitwiseNumberSystem;

//Pattern in XOR range [a,b]
//[3,9]= xor(0 to 9) - xor(0 to 2) = as a^a =0

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);

//        //brute
//        int ans2 = 0;
//        for (int i = a; i <= b; i++) {
//            ans2 ^= i;
//        }
//        System.out.println(ans2);
    }

    // this gives xor from 0 to a
    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }

        if (a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a + 1;
        }

        return 0; //(a % 4 == 3)
    }

}
