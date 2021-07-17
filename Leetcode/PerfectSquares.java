// https://leetcode.com/problems/perfect-squares/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/07/2021
*/

import java.util.*;

class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            int minCount = Integer.MAX_VALUE;
            for(int j = (int)(Math.floor(Math.sqrt(i))); j>=1; j--) {
                minCount = Math.min(minCount, 1 + dp[i-(j*j)]);
            }
            dp[i] = minCount;
        }

        return dp[n];
    }
}