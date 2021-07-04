// https://www.geeksforgeeks.org/longest-common-substring-dp-29/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/07/2021
*/

//User function Template for Java

class Solution{
    int longestCommonSubstr(String text1, String text2, int l1, int l2){
        int dp[][] = new int[l1+1][l2+1];
        int maxLength = 0;

        for(int i=1; i<=l1; i++) {
            for(int j=1; j<=l2; j++) {
                dp[i][j] = 0;
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                
                maxLength = Math.max(maxLength, dp[i][j]);
            }
        }
        
        return maxLength;
    }
}