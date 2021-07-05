// https://www.geeksforgeeks.org/printing-longest-common-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/07/2021
*/

import java.util.*;


class Solution {
    public String longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        String longestCommonSubsequence = "";


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

        int i=text1.length(), j=text2.length();

        while(i !=0 && j != 0) {
            int left = -1,up = -1;

            if(i!=0) up = dp[i-1][j];
            if(j!=0) left = dp[i][j-1];

            if(Math.max(up,left) != dp[i][j]) {
                longestCommonSubsequence = text1.charAt(i-1) + longestCommonSubsequence;
                j--;
                i--;
            }
            else {
                if(left == dp[i][j]) j--;
                else i--;
            }
        }

        return longestCommonSubsequence;
    }
}