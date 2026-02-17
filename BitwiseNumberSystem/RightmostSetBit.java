package BitwiseNumberSystem;

public class RightmostSetBit {
    public static void main(String[] args){
        int n =10;
        System.out.println(rightmostSetBit(10));
    }
    static int rightmostSetBit(int n) {
        //value
        //which power of 2 the rightmost set bit represents
//        return n & (-n);

        //index(position) (0-based)
        //java built in
        return Integer.numberOfTrailingZeros(n);
    }

}
