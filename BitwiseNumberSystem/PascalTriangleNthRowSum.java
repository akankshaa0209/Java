package BitwiseNumberSystem;

//sum of nth row
//sum of each row= nc0 +nc1 +...+ ncn = 2^n

//for nth row, 0 idexed: 2^(n-1)

//we studied: a << b = a * 2^b

public class PascalTriangleNthRowSum {
    public static void main(String[] args){
       int n=5;
       int sum = (1<<(n-1));
        System.out.println(sum);
    }
}
