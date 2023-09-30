package Recursion;

import java.util.ArrayList;
import java.util.List;

public class N_Queens {

	public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board , 0);
    }

    public List<List<String>> queens(boolean[][] board , int row){
        if(row == board.length){
            List<List<String>> sol = new ArrayList();
            sol.add(display(board));
            return sol;
        }

        List<List<String>> outer = new ArrayList();
        for(int col = 0; col < board.length; col++){
           // Chec if it is safe 
           if(isSafe(board,row,col)){
               board[row][col] = true;
               outer.addAll(queens(board, row + 1));
               board[row][col] = false;
           } 
        }

        return outer; 
    }

    boolean isSafe(boolean[][] board , int row , int col){
        // Checking vertical row
        for(int i = 0; i < row; i++){
            if(board[i][col])
                return false;
        }

        // Checking diagonal left
        int maxLeft = Math.min(row,col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i])
                return false;
        }
        // Checking diagonal right
        int maxRight = Math.min(row , board.length - col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i])
                return false;
        }

        return true;
    }

    List<String> display(boolean[][] board){
        List<String> solution = new ArrayList();
        for(boolean[] row : board){
            // Creating an empty stringBuilder to fill the possible solution for each row
            StringBuilder cell = new StringBuilder();
            for(boolean element : row){
                if(element){
                   cell.append("Q");
                }
                else{
                    cell.append(".");
                }
            }
            solution.add(cell.toString());
        }

        return solution;
    }
}
