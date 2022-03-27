// https://leetcode.com/problems/set-matrix-zeroes/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/03/2022
*/

import java.util.*;

class Solution {
  public void setZeroes(int[][] matrix) {
    int rows = matrix.length, cols = matrix[0].length;
    boolean makeColZero = false;

    for(int i=0; i<rows; i++) {
      if (matrix[i][0] == 0) makeColZero = true;
      for(int j=1; j<cols; j++) {
        if(matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    for(int i=1; i<rows; i++) {
      for(int j=1; j<cols; j++) {
        if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;          
      }
    }

    if(matrix[0][0] == 0) {
      for(int j=0; j<cols; j++) {
        matrix[0][j] = 0;
      }
    }

    if(makeColZero) {
      for(int i=0; i<rows; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}