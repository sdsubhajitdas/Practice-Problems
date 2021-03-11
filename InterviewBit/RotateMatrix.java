// https://www.interviewbit.com/problems/rotate-matrix/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/03/2021
*/

import java.util.*;

public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> grid) {
        if(grid.size() == 1) return ;

        int n = grid.size();

        Collections.reverse(grid);
        for(int row=0; row<n; row++){
            for(int col=row; col<n; col++){
                int upper = grid.get(row).get(col);
                int lower = grid.get(col).get(row);
                grid.get(row).set(col, lower);
                grid.get(col).set(row, upper);
            }
        }
    }
}
