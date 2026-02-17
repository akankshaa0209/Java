package Recursion.Backtracking;

import java.util.Arrays;

public class MazeCountMemo {

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        //if int[][] board. then board[r][c] == 1 is obstacle

        System.out.println(countPaths(board)); // Output: 2
    }

    static int countPaths(boolean[][] maze) {
        int r = maze.length;
        int c = maze[0].length;

        // Initialize memoization table with -1 (uncomputed)
        int[][] dp = new int[r][c];
        for (int i = 0; i < r; i++) Arrays.fill(dp[i], -1);

        return helper(maze, 0, 0, dp);
    }

    static int helper(boolean[][] maze, int r, int c, int[][] dp) {
        // Out of bounds or obstacle
        if (r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return 0;
        }

        // Reached destination
        if (r == maze.length - 1 && c == maze[0].length - 1) return 1;

        // Already computed
        if (dp[r][c] != -1) return dp[r][c];

//        maze[r][c] = false;
        // Move down and right
        int down = helper(maze, r + 1, c, dp);
        int right = helper(maze, r, c + 1, dp);
//        int up = helper(maze,r-1,c,dp );
//        int left= helper(maze,r,c-1,dp);

        dp[r][c] = down + right;
//        maze[r][c] = true;
        return dp[r][c];


    }
}
