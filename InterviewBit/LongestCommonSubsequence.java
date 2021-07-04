// https://www.interviewbit.com/problems/longest-common-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/07/2021
*/

import java.util.*;

public class Solution {
    public int solve(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];


        for(int i=1; i<=text1.length(); i++) {
            for(int j=1; j<=text2.length(); j++) {
                int char1 = text1.charAt(i-1);
                int char2 = text2.charAt(j-1);

                if(char1 == char2) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[text1.length()][text2.length()];
    }
}
