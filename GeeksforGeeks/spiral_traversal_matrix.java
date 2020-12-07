// https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/12/2020
*/


class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int element=1, top=0, bottom=r-1, left=0, right=c-1;
        ArrayList<Integer> traversalPath = new ArrayList<>();

        while(traversalPath.size() < r*c){
            // top row
            for(int i=left; i<=right; i++)
                traversalPath.add(matrix[top][i]);
            top++;

            if(traversalPath.size() >= r*c) break;
            // right col
            for(int j=top; j<=bottom; j++)
                traversalPath.add(matrix[j][right]);
            right--;

            if(traversalPath.size() >= r*c) break;
            // bottom row
            for(int i=right; i>=left; i--)
                traversalPath.add(matrix[bottom][i]);
            bottom--;
            
            if(traversalPath.size() >= r*c) break;
            // left col
            for(int j=bottom; j>=top; j--)
                traversalPath.add(matrix[j][left]);
            left++;
        }
        return traversalPath;
    }
}