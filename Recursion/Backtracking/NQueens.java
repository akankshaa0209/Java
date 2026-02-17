package Recursion.Backtracking;
//https://leetcode.com/problems/n-queens/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    class Solution {

        // Check if queen can be placed
        private boolean isSafe(char[][] board, int row, int col, int n) {

            // check column
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') return false;
            }

            // left diagonal
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') return false;
            }

            // right diagonal
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (board[i][j] == 'Q') return false;
            }

            return true;
        }

        private void solve(char[][] board, int row, int n, List<List<String>> ans) {
            if (row == n) {
                ans.add(construct(board));
                return;
            }

            for (int col = 0; col < n; col++) {
                if (isSafe(board, row, col, n)) {
                    board[row][col] = 'Q';
                    solve(board, row + 1, n, ans);
                    board[row][col] = '.'; // backtrack
                }
            }
        }

        private List<String> construct(char[][] board) {
            List<String> res = new ArrayList<>();
            for (char[] row : board) {
                res.add(new String(row));
            }
            return res;
        }

        public List<List<String>> solveNQueens(int n) {
            char[][] board = new char[n][n];
//            for (char[] row : board) Arrays.fill(row, '.');
            for (char[] row : board) {
                Arrays.fill(row,'.');
            }

            List<List<String>> ans = new ArrayList<>();
            solve(board, 0, n, ans);
            return ans;
        }
    }

}
