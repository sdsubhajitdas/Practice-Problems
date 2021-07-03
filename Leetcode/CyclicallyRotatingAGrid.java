// https://leetcode.com/contest/weekly-contest-247/problems/cyclically-rotating-a-grid/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    03/07/2021
*/

import java.util.*;

class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int startIdx=0; startIdx<Math.min(rows,cols)/2; startIdx++){
            int movedBy = 0;
            int newK = k%(((rows - (startIdx*2))*2) + ((cols - (startIdx*2))*2) - 4);
            // System.out.println("New K: "+newK);
            while(movedBy != newK) {
                this.rotateFromAnIndex(grid, k, startIdx);
                movedBy++;
            }
        }

        return grid;
    }

    private void rotateFromAnIndex(int grid[][], int k, int idx) {
        int rows = grid.length;
        int cols = grid[0].length;

        int previousNum = grid[idx][idx];

        for(int i=idx+1; i<rows-idx; i++) {
            int temp = grid[i][idx];
            grid[i][idx] = previousNum;
            previousNum = temp;
        }

        for(int i=idx+1; i<cols-idx; i++) {
            int temp = grid[rows-idx-1][i];
            grid[rows-idx-1][i] = previousNum;
            previousNum = temp;
        }

        for(int i=rows-idx-2; i>=idx; i--) {
            int temp = grid[i][cols-idx-1];
            grid[i][cols-idx-1] = previousNum;
            previousNum = temp;
        }

        for(int i=cols-idx-2; i>=idx; i--){
            int temp = grid[idx][i];
            grid[idx][i] = previousNum;
            previousNum = temp;
        }
    }
}