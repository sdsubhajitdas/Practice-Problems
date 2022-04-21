// https://leetcode.com/problems/rotate-image/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/04/2022
*/

import java.util.*;

class Solution {
  public void rotate(int[][] matrix) {
    
    for(int i=0; i < matrix.length; i++){
      for(int j=0; j<i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for(int i=0; i<matrix.length; i++) {
      int row[] = matrix[i];
      int start=0, end = row.length-1;
      while(start<end) {
        int temp = row[start];
        row[start] = row[end];
        row[end] = temp;
        start++;
        end--;
      }
    }
    
  }
}