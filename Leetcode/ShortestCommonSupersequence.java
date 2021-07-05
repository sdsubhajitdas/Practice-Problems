// https://leetcode.com/problems/shortest-common-supersequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/07/2021
*/

import java.util.*;

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int dp[][] = new int[str1.length()+1][str2.length()+1];

        String shortestCommonSuperSequence = "";
        
        for(int i=1; i<=str1.length(); i++) {
            for(int j=1; j<=str2.length(); j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        int i=str1.length(), j=str2.length();

        while(i >0 && j >0) {
            int left = -1,up = -1;

            if(i!=0) up = dp[i-1][j];
            if(j!=0) left = dp[i][j-1];

            if(Math.max(up,left) != dp[i][j]) {
                shortestCommonSuperSequence = str1.charAt(i-1) + shortestCommonSuperSequence;
                j--;
                i--;
            }
            else {
                if(left == dp[i][j]) {
                    shortestCommonSuperSequence = str2.charAt(j-1) + shortestCommonSuperSequence;
                    j--;
                }
                else {
                    shortestCommonSuperSequence = str1.charAt(i-1) + shortestCommonSuperSequence;
                    i--;
                }
            }
        }

        while(i>0) {
            shortestCommonSuperSequence = str1.charAt(i-1) + shortestCommonSuperSequence;
            i--;
        }

        while(j>0) {
            shortestCommonSuperSequence = str2.charAt(j-1) + shortestCommonSuperSequence;
            j--;
        }
        
        return shortestCommonSuperSequence;
    }
}