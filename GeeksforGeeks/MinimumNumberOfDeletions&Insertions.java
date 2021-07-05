// https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/07/2021
*/

//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) { 
        int dp[][] = new int[str1.length()+1][str2.length()+1];

        for(int i=1; i<=str1.length(); i++) {
            for(int j=1; j<=str2.length(); j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[j][i-1]);
                }
            }
        }

        int lcsLength = dp[dp.length][dp[0].length];

        return str1.length() - lcsLength + (str2.length() - lcsLength);
	} 
}