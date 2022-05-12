// https://leetcode.com/problems/search-a-2d-matrix/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/05/2022
*/

import java.util.*;

class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
    int rows = matrix.length, cols=matrix[0].length;
    int low = 0, high = rows*cols-1;

    while(low<=high) {
      int mid = (low+high)/2;
      int cor[] = this.getMatrixIndex(mid, cols);
      int element = matrix[cor[0]][cor[1]];

      if(element>target) 
        high = mid-1;
      else if(element<target)
        low = mid+1;
      else
        return true;
    }

    return false;
  }

  private int[] getMatrixIndex(int index, int cols) {
    int result[] = new int[2];

    result[0] = index/cols; // Rows
    result[1] = index%cols; // Cols

    return result;
  }
}
