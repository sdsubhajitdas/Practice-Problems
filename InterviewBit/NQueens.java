// https://www.interviewbit.com/problems/nqueens/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/05/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> solutions = new ArrayList<>();
        ArrayList<String> solution = new ArrayList<>();

        this.solveNQueensHelper(0, n, solution, solutions);

        return solutions;
    }

    private void solveNQueensHelper(int row, int n, ArrayList<String> solution, ArrayList<ArrayList<String>> solutions) {
        if(row == n) {
            solutions.add(new ArrayList<>(solution));
            return;
        }

        StringBuilder singleRow = new StringBuilder(String.join("", Collections.nCopies(n, ".")));

        for(int place=0; place < n; place++) {
            singleRow.replace(place, place+1, "Q");
            solution.add(singleRow.toString());
            if(this.isSafe(row, place, solution)) {
                this.solveNQueensHelper(row+1, n, solution, solutions);
            }
            solution.remove(solution.size() -1 );
            singleRow.replace(place, place+1, ".");
        }
    }

    private boolean isSafe(int row, int col, ArrayList<String> currentBoard) {
        
        // Same column check
        for(int i=row-1; i>=0; i--) {
            if(currentBoard.get(i).charAt(col) == 'Q') return false;
        }

        // Left diagonal check
        for(int i=row-1, j=col-1; i>=0 && j>=0; ) {
            if(currentBoard.get(i).charAt(j) == 'Q') return false;
            i--; 
            j--;
        }

        // Right diagonal check
        for(int i=row-1, j=col+1; i>=0 && j<currentBoard.get(0).length(); ) {
            if(currentBoard.get(i).charAt(j) == 'Q') return false;
            i--;
            j++;
        }

        return true;
    }
}
