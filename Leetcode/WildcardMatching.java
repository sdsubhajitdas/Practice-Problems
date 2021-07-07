// https://leetcode.com/problems/wildcard-matching/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/07/2021
*/

import java.util.*;


class Solution {
    public boolean isMatch(String word, String pattern) {
        boolean dp[][] = new boolean[pattern.length()+1][word.length()+1];

        dp[0][0] = true;

        for(int j=1; j<=pattern.length(); j++) {
            if(pattern.charAt(j-1) == '*') dp[j][0] = dp[j-1][0];
        }

        for(int i=1; i<=pattern.length(); i++) {
            for(int j=1; j<=word.length(); j++) {
                if(pattern.charAt(i-1) == word.charAt(j-1) || pattern.charAt(i-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(pattern.charAt(i-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }

        return dp[pattern.length()][word.length()];
    }
}