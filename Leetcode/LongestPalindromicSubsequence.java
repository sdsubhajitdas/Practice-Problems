// https://leetcode.com/problems/longest-palindromic-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/07/2021
*/

import java.util.*;

class Solution {
    public int longestPalindromeSubseq(String s) {
        String rs = new StringBuilder(s).reverse().toString();
        
        int dp[][] = new int[s.length()+1][s.length()+1];
        
        for(int i=1; i<=s.length(); i++) {
            for(int j=1; j<=s.length(); j++) {
                
                if(s.charAt(i-1) == rs.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[dp.length-1][dp[0].length-1];                  
    }
}