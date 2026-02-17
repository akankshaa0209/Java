package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        //type1-==================

        int rows = 3, cols = 3;
        int[][] dp = new int[rows][cols];
        // Initialize with -1
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(count2dp(0, 0, rows, cols, dp));
//
//        int rows = 3;
//        int cols = 3;
        System.out.println(count2(0, 0, rows, cols));
//


        //type 2 : return paths================
        path("", 0,0,3, 3);
        System.out.println(pathRet("", 0, 0, 3, 3));
        //or
        ArrayList<String> paths = pathRet("", 0, 0, 3, 3);
        System.out.println(paths);

        //type3=======================
        ArrayList<String> pathsDiag = pathRetDiagonal("", 0, 0, 3, 3);
        System.out.println(pathsDiag);

//type4===================================
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathRestrictions("", board, 0, 0);

        ArrayList<String> pathsRestrict = pathRestriction("", board, 0, 0);
        System.out.println(pathsRestrict);
    }

    //========type 1: count number of ways===================

    //(0,0) based
    static int count2(int r, int c, int rows, int cols) {
        // Out of bounds
        if (r >= rows || c >= cols) return 0;

        // Reached destination
        if (r == rows - 1 && c == cols - 1) return 1;

        // Move down + move right
        return count2(r + 1, c, rows, cols)
                + count2(r, c + 1, rows, cols);
    }

    //dp of above
    static int count2dp(int r, int c, int rows, int cols, int[][] dp) {
        // Out of bounds
        if (r >= rows || c >= cols) return 0;

        // Destination reached
        if (r == rows - 1 && c == cols - 1) return 1;

        // Already computed
        if (dp[r][c] != -1) return dp[r][c];

        // Move down + right
        dp[r][c] = count2dp(r + 1, c, rows, cols, dp)
                + count2dp(r, c + 1, rows, cols, dp);

        return dp[r][c];
    }



    //========type 2: print paths D/R===================
    static void path(String p, int r, int c, int rows, int cols) {
        // reached destination
        if (r == rows - 1 && c == cols - 1) {
            System.out.println(p);
            return;
        }

        // move down
        if (r < rows - 1) {
            path(p + 'D', r + 1, c, rows, cols);
        }

        // move right
        if (c < cols - 1) {
            path(p + 'R', r, c + 1, rows, cols);
        }
    }


    static ArrayList<String> pathRet(String p, int r, int c, int rows, int cols) {
        if (r == rows - 1 && c == cols - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (r < rows - 1) {
            list.addAll(pathRet(p + 'D', r + 1, c, rows, cols));
        }

        if (c < cols - 1) {
            list.addAll(pathRet(p + 'R', r, c + 1, rows, cols));
        }

        return list;
    }


    //===========type 3: print path diagonoal/D/R also allowed============

    static ArrayList<String> pathRetDiagonal(String p, int r, int c, int rows, int cols) {

        // reached destination
        if (r == rows - 1 && c == cols - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        // Diagonal move
        if (r < rows - 1 && c < cols - 1) {
            list.addAll(pathRetDiagonal(p + 'D', r + 1, c + 1, rows, cols));
        }

        // Vertical move (Down)
        if (r < rows - 1) {
            list.addAll(pathRetDiagonal(p + 'V', r + 1, c, rows, cols));
        }

        // Horizontal move (Right)
        if (c < cols - 1) {
            list.addAll(pathRetDiagonal(p + 'H', r, c + 1, rows, cols));
        }

        return list;
    }


    //===========type 4: maze with obstacles / path restrictions===============
    // R/D
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        //obstacle
        if (!maze[r][c]) { //false (==false)
            return;
        }

        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c+1);
        }
    }

    static ArrayList<String> pathRestriction(String p, boolean[][] maze, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        // destination reached
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }

        // obstacle
        if (!maze[r][c]) {
            return list;
        }

        // move down
        if (r < maze.length - 1) {
            list.addAll(pathRestriction(p + 'D', maze, r + 1, c));
        }

        // move right
        if (c < maze[0].length - 1) {
            list.addAll(pathRestriction(p + 'R', maze, r, c + 1));
        }

        return list;
    }


}
