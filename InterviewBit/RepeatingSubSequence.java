// https://www.interviewbit.com/problems/repeating-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/07/2021
*/

import java.util.*;

public class Solution {
    public int anytwo(String a) {
        int dp[][] = new int[a.length()+1][a.length()+1];

        for(int i=1; i<=a.length(); i++) {
            for(int j=1; j<=a.length(); j++) {
                if(i!=j && a.charAt(i-1) == a.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return (dp[dp.length-1][dp[0].length-1] > 1) ? 1 : 0;
    }
}
