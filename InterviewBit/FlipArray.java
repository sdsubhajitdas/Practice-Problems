// https://www.interviewbit.com/problems/flip-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/06/2021
*/

import java.util.*;


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> arr) {
        if(arr.size() == 0) return 0;

        int sum = this.sum(arr)/2;
        int dp[][] = new int[arr.size()+1][sum+1];

        for(int i=1; i<=sum; i++)
            dp[0][i] = Integer.MAX_VALUE;
        
        for(int i=1; i<=arr.size(); i++) {
            for(int j=0; j<=sum; j++) {
                dp[i][j] = dp[i-1][j];
                int val = arr.get(i-1);
                if(j >= val && dp[i-1][j-val] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], 1 + dp[i-1][j-val]);
                }
            }
        }

        while(dp[arr.size()][sum] == Integer.MAX_VALUE)
            sum--;

        return dp[arr.size()][sum];
    }

    private int sum(List<Integer> arr){
        int sum = 0;
        for(Integer num: arr) sum += num;

        return sum;
    }
}