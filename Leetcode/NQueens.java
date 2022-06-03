// https://leetcode.com/problems/n-queens/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/06/2022
*/

import java.util.*;

class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>(); 
    if(n == 0) return result;
    this.solveNQueensHelper(0, n, new ArrayList<String>(), result);
    return result;
  }


  private void solveNQueensHelper(int row, int n, List<String> position, List<List<String>> result) {
    if(row == n) {
      result.add(new ArrayList<String>(position));
      return;
    }

    for(int i=0; i<n; i++) {
      if(isValidPosition(row, i, n, position)) {
        StringBuilder singleRowString = new StringBuilder(".".repeat(n));
        singleRowString.replace(i, i+1, "Q");
        position.add(singleRowString.toString());
        this.solveNQueensHelper(row+1, n, position, result);
        position.remove(position.size()-1);
      }
    }
  }

  private boolean isValidPosition(int row, int col, int n, List<String> position) {
    if(row == 0) return true;
    
    for(String pos : position) {
      char piece = pos.charAt(col);
      if(piece == 'Q') return false;
    }

    for(int r=position.size()-1, leftCol=col-1; r>=0 && leftCol>=0; r--,leftCol--) {
      char piece = position.get(r).charAt(leftCol);
      if(piece == 'Q') return false;
    }

    for(int r=position.size()-1, rightCol=col+1; r>=0 && rightCol<n; r--,rightCol++) {
      char piece = position.get(r).charAt(rightCol);
      if(piece == 'Q') return false;
    }

    return true;
  }
}