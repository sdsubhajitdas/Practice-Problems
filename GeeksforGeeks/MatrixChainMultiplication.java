// https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    14/07/2021
*/

//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[]) {
        int dp[][] = new int[N][N];
        for(int row[]: dp)
            Arrays.fill(row, -1);

        return matrixMultiplicationHelper(arr,1,N-1, dp);
    }


    private static int matrixMultiplicationHelper(int arr[], int start, int end, int dp[][]) {
        if(start==end) return 0;
        if(dp[start][end] != -1) return dp[start][end];

        int minMultiplications = Integer.MAX_VALUE;

        for(int k=start; k<end; k++) {
            int left = matrixMultiplicationHelper(arr, start, k, dp);
            int right = matrixMultiplicationHelper(arr, k+1, end, dp);
            int ans = left + right + (arr[start-1]*arr[k]*arr[end]);

            minMultiplications = Math.min(minMultiplications, ans);   
        }

        dp[start][end] = minMultiplications;

        return minMultiplications;
    }
}