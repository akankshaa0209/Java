package Recursion.Backtracking;

//https://leetcode.com/problems/sudoku-solver/

public class SudokuSolver {
    class Solution { //SCN*N TC =O(9^(N*N))
        public Boolean isSafe(char[][] board, int row, int col, char dig){
            //horizontal
            for(int j=0; j<9;j++){
                if(board[row][j] == dig){
                    return false;
                }
            }

            //vertical
            for(int i=0; i<9;i++){
                if(board[i][col] == dig){
                    return false;
                }
            }

            //check 3*3 grid
            int startingrow=(row/3) *3;
            int startingcol = (col/3) *3;

//O((9)) = constant time
            for(int i=startingrow; i<startingrow+2; i++){
                for(int j=startingcol; j<=startingcol+2; j++){
                    if(board[i][j]==dig){
                        return false;
                    }
                }
            }
            return true;
        }
        public Boolean helper(char[][] board, int row, int col){
            if(row==9){
                return true;
            }

            int nextRow=row, nextCol=col+1;
            if(nextCol==9){
                nextRow=row+1;
                nextCol=0;
            }
            if(board[row][col] != '.'){
                return helper(board, nextRow, nextCol);
            }

            //place the digit
            for(char dig='1';dig<='9';dig++) {
                if(isSafe(board, row, col, dig)){
                    board[row][col] = dig;
                    if(helper(board, nextRow,nextCol)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
            return false;
        }
        public void solveSudoku(char[][] board) {
            helper(board,0,0);
        }
    }
}
