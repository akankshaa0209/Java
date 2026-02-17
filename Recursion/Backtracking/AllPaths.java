package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

//import static Recursion.Backtracking.Maze.pathRestrictions;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        pathRestrictionsAll("", board, 0,0); //stackoverflow

//        allPath("", board, 0, 0); //backtracking

//        ArrayList<String> paths = allPathsPrint("", board, 0, 0);
//        System.out.println(paths);
//        for (String p : paths) {
//            System.out.println(p);
//        }

        int[][] dp = new int[board.length][board[0].length];
        for (int[] row : dp) Arrays.fill(row, -1);

        //will work only if 2 ways
        System.out.println(countPathsDP(board, 0, 0, dp));

        //for all ways, will have to use backtracking only
        System.out.println(countPathsBT(board,0,0));

    }

    //stackoverflow,
    static void pathRestrictionsAll(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        //obstacle
        if (!maze[r][c]) { //false (==false)
            return;
        }

        if (r >0) { //up
            pathRestrictionsAll(p + 'U', maze, r-1, c);
        }

        if (r < maze.length - 1) { //down
            pathRestrictionsAll(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) { //right
            pathRestrictionsAll(p + 'R', maze, r, c+1);
        }

        if (c>0) { //left
            pathRestrictionsAll(p + 'L', maze, r, c-1);
        }
    }

    //backtracking
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) { //right
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) { //down
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) { //up
            allPath(p + 'U', maze, r-1, c);
        }

        if (c > 0) { //left
            allPath(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true; //backtracks
    }

    static int countPathsBT(boolean[][] maze, int r, int c) {
        // Out of bounds or obstacle
        if (r<0||c<0||r >= maze.length || c >= maze[0].length || !maze[r][c])
            return 0;

        // destination reached
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return 1;
        }

        // mark visited
        maze[r][c] = false;

        int down  = countPathsBT(maze, r + 1, c);
        int right = countPathsBT(maze, r, c + 1);
        int up    = countPathsBT(maze, r - 1, c);
        int left  = countPathsBT(maze, r, c - 1);

        // backtrack
        maze[r][c] = true;

        return down+right+up+left;
    }

    static int countPathsDP(boolean[][] maze, int r, int c, int[][] dp) {

        if (r >= maze.length || c >= maze[0].length || !maze[r][c])
            return 0;

        if (r == maze.length - 1 && c == maze[0].length - 1)
            return 1;

        if (dp[r][c] != -1)
            return dp[r][c];

        int down  = countPathsDP(maze, r + 1, c, dp);
        int right = countPathsDP(maze, r, c + 1, dp);
//        int left= countPathsDP(maze,r,c-1,dp);
//        int up= countPathsDP(maze,r-1,c,dp);

        dp[r][c] = down + right;
        return dp[r][c];
    }


    static ArrayList<String> allPathsPrint(String p, boolean[][] maze, int r, int c) {
        ArrayList<String> list = new ArrayList<>();

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }

        if (r >= maze.length || c >= maze[0].length ||!maze[r][c]) return list;

        maze[r][c] = false;

        if (r < maze.length - 1)
            list.addAll(allPathsPrint(p + 'D', maze, r + 1, c));

        if (c < maze[0].length - 1)
            list.addAll(allPathsPrint(p + 'R', maze, r, c + 1));

        if (r > 0)
            list.addAll(allPathsPrint(p + 'U', maze, r - 1, c));

        if (c > 0)
            list.addAll(allPathsPrint(p + 'L', maze, r, c - 1));

        maze[r][c] = true; // backtrack

        return list;
    }

}
