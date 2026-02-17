package ArrayAssignment;

//https://leetcode.com/problems/number-of-common-factors/submissions/1881974499/
public class NumOfCommonFactors {
    class Solution {
        public int commonFactors(int a, int b) {
            int count = 0;

            for (int i = 1; i <= Math.min(a,b); i++ ) {
                if (a%i==0 && b%i==0){
                    count++;
                }
            }
            return count;
        }
    }

//t=min(a,b)
//space= 1
}
