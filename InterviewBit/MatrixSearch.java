// https://www.interviewbit.com/problems/matrix-search/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/03/2021
*/

import java.util.*;

public class Solution {

    class Pair {
        int row,col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int searchMatrix(ArrayList<ArrayList<Integer>> matrix, int num) {

        int rows = matrix.size();
        int cols = matrix.get(0).size();
        int low = 0, high = rows*cols-1;

        while(low<=high) {
            int searchIdx = low+ ((high-low)/2);
            Pair idx = this.getRowCol(rows, cols, searchIdx);
            if(matrix.get(idx.row).get(idx.col) > num){
                high = searchIdx - 1;
            }
            else if(matrix.get(idx.row).get(idx.col) < num){
                low = searchIdx + 1;
            }
            else {
                return 1;
            }
        }
        return 0;
    }

    private Pair getRowCol(int rows, int cols, int searchIdx) {
        int i = searchIdx/cols;
        int j = searchIdx%cols;

        return new Pair(i,j);
    }
}
