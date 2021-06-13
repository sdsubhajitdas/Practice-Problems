// https://www.interviewbit.com/problems/subset-sum-problem/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/06/2021
*/

import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> arr, int sum) {

        int dp[][] = new int[arr.size()][sum+1];
        for(int row[]: dp)
            Arrays.fill(row, -1);

        return this.solveHelper(arr, sum, 0, dp) ? 1 : 0;
    }

    private boolean solveHelper(ArrayList<Integer> arr, int sum, int idx, int dp[][]) {
        if(sum < 0) return false;
        if(sum == 0) return true;
        if(idx >= arr.size()) return false;

        if(dp[idx][sum] != -1) return (dp[idx][sum] == 1) ? true : false ;
        
        dp[idx][sum] = this.solveHelper(arr, sum-arr.get(idx), idx+1, dp) || this.solveHelper(arr, sum, idx+1, dp) ? 1:0;

        return (dp[idx][sum] == 1) ? true : false;
    }
}
