package Recursion.Backtracking;

public class CountPrint {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        int total = printAndCountPaths("", 0, 0, rows, cols);
        System.out.println("Total paths = " + total);
    }

    static int printAndCountPaths(String p, int r, int c, int rows, int cols) {

        // reached destination
        if (r == rows - 1 && c == cols - 1) {
            System.out.println(p);
            return 1;
        }

        int count = 0;

//        // Diagonal move
//        if (r < rows - 1 && c < cols - 1) {
//            count += printAndCountPaths(p + 'D', r + 1, c + 1, rows, cols);
//        }

        // Down move
        if (r < rows - 1) {
            count += printAndCountPaths(p + 'V', r + 1, c, rows, cols);
        }

        // Right move
        if (c < cols - 1) {
            count += printAndCountPaths(p + 'H', r, c + 1, rows, cols);
        }

        return count;
    }

}
