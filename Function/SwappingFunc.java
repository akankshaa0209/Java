package Function;

//You cannot swap primitive variables directly inside a method in Java because:
//Java is pass-by-value, not pass-by-reference
//static void swap(int a, int b)
//swap(a, b);
//x = copy of a
//y = copy of b

public class SwappingFunc {
    public static void main(String[] args) {
        int[] arr = {5,10};
        swap(arr);

        System.out.println(arr); //print address
        System.out.println("a= " + arr[0]);
        System.out.println(arr[1]);
    }

    static void swap(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;


    }
}
