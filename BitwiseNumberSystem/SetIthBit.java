package BitwiseNumberSystem;

public class SetIthBit {
    public static void main(String[] args) {
        int n = 10;
        int ans = setIthBit(n, 0);
        System.out.println(ans); // 11
    }

    static int setIthBit(int n, int i) {
        return n | (1 << i);
    }
}
