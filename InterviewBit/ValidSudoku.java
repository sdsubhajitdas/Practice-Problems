// https://www.interviewbit.com/problems/valid-sudoku/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/04/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> board) {

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char digit = this.getBoardPos(board, i, j);
                if(digit != '.')
                    if(!this.isValid(board, digit, i, j)) return 0;
            }
        }
        return 1;
    }

    private boolean isValid(List<String> board, char digit, int row, int col) {
        return this.aloneInThatRow(board, digit, row) && 
            this.aloneInThatCol(board, digit, col) && 
            this.aloneInThatGrid(board, digit, row - row%3, col - col%3);
    }

    private boolean aloneInThatGrid(List<String> board, char digit, int row, int col) {
        int count = 0;
        for(int i= row; i<row+3; i++) {
            for(int j= col; j<col+3; j++) {
                if(this.getBoardPos(board, i, j) == digit) count++;
            }
        }
        return (count==1);
    }

    private boolean aloneInThatRow(List<String> board, char digit ,int row) {
        int count = 0;
        for(int col=0; col<9; col++) {
            if(this.getBoardPos(board, row, col) == digit) count++;
        }
        return (count==1);
    }

    private boolean aloneInThatCol(List<String> board, char digit ,int col) {
        int count = 0;
        for(int row=0; row<9; row++) {
            if(this.getBoardPos(board, row, col) == digit) count++;
        }
        return (count==1);
    }

    private char getBoardPos(List<String> board, int i, int j) {
        return board.get(i).charAt(j);
    }
}