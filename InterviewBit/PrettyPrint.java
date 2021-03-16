// https://www.interviewbit.com/problems/prettyprint/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/03/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int size) {
        int array[][] = new int[size*2 -1][size*2 -1];

        for(int i=1;i<=size;i++) {
            this.fillRowCol(array, i-1, array.length, size-i+1);
        }

        ArrayList<ArrayList<Integer>> returnGrid = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<array.length; j++){
                row.add(array[i][j]);
            }
            returnGrid.add(row);
        }
        return returnGrid;
    }

    private void fillRowCol(int grid[][], int position, int size, int fillWith){
        int mirrorPosition = size-position-1;
        for(int i=position; i<=size-position-1; i++){
            grid[position][i] = fillWith;
            grid[i][position] = fillWith;
            grid[mirrorPosition][i] = fillWith;
            grid[i][mirrorPosition] = fillWith;
        }
    }
}