// https://leetcode.com/problems/pascals-triangle/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/03/2022
*/

import java.util.*;

class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    Integer arr[] = {1};
    triangle.add(new ArrayList<Integer>(Arrays.asList(arr)));
    if(numRows == 1) return triangle;
    Integer arr2[] = {1,1};
    triangle.add(new ArrayList<Integer>(Arrays.asList(arr2)));
    if(numRows == 2) return triangle;

    for(int i=3; i<=numRows; i++){
      List<Integer> lastRow = triangle.get(i-2);
      List<Integer> currentRow = new ArrayList<>();
      currentRow.add(1);

      for(int j=0; j<lastRow.size()-1; j++) {
        int a = lastRow.get(j);
        int b = lastRow.get(j+1);
        currentRow.add(a+b);
      }

      currentRow.add(1);
      triangle.add(currentRow);
    }


    return triangle;  
  }
}