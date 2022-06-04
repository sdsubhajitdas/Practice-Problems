// https://leetcode.com/problems/sudoku-solver/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/06/2022
*/

import java.util.*;

class Solution {
  public void solveSudoku(char[][] board) {
    this.solveSudokuHelper(board);
  }

  private boolean solveSudokuHelper(char[][] board) {
    for(int row=0; row<9; row++) {
      for(int col=0; col<9; col++) {
        if(board[row][col] == '.') {

          for(char digit='1'; digit<='9'; digit++) {

            if(this.isValid(board, row, col, digit)) {
              board[row][col] = digit;
              if(this.solveSudokuHelper(board) == true) {
                return true;
              }
              else {
                board[row][col] = '.';
              }
            }

          }
          return false;

        }
      }
    }
    return true;
  }

  private boolean isValid(char[][] board, int row, int col, char digit) {
    for(int i=0; i<9; i++) {
      if(board[i][col] == digit) return false;
      if(board[row][i] == digit) return false;
      if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == digit) return false;
    }
    return true;
  }
}