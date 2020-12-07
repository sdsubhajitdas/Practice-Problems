// https://leetcode.com/problems/spiral-matrix-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/12/2020
*/

class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int element=1, top=0, bottom=n-1, left=0, right=n-1;

        while(element <= n*n){

            // top row
            for(int i=left; i<=right; i++)
                matrix[top][i] = element++;
            top++;

            // right col
            for(int j=top; j<=bottom; j++)
                matrix[j][right] = element++;
            right--;

            // bottom row
            for(int i=right; i>=left; i--)
                matrix[bottom][i] = element++;
            bottom--;

            // left col
            for(int j=bottom; j>=top; j--)
                matrix[j][left] = element++;
            left++;
        }
        return matrix;
    }
}