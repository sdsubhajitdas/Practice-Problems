// https://leetcode.com/problems/delete-operation-for-two-strings/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/07/2021
*/

import java.util.*;


class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        
        for(int i=1; i<=word1.length(); i++) {
            for(int j=1; j<=word2.length(); j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return word1.length() + word2.length() - (2*dp[dp.length-1][dp[0].length-1]);
    }
}