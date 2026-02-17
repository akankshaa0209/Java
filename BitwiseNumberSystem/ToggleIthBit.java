package BitwiseNumberSystem;

public class ToggleIthBit {
    public static void main(String[] args){
        int n =10;
        System.out.println(toggleIthBit(10,0));
        System.out.println(toggleIthBit(10,1));
    }

    static int toggleIthBit(int n, int i) {
        return n ^ (1 << i);
    }

}
