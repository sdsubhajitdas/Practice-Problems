// https://leetcode.com/problems/palindrome-partitioning-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/07/2021
*/


// https://leetcode.com/problems/palindrome-partitioning-ii/discuss/1267844/JAVA-or-Recursion-+-Memoization-or-Optimized-Matrix-Chain-Multiplication-Approach-with-Code-(MCM)

import java.util.*;

class Solution {
    public int minCut(String s) {
        int dp[][] = new int[s.length()][s.length()];
        for(int row[]: dp)
            Arrays.fill(row, -1);
        
        return this.helper(s, 0, s.length()-1, dp);
    }
    
    private int helper(String str, int start, int end, int dp[][]) {
        if(start >= end) return 0;
        if(dp[start][end] != -1) return dp[start][end];
        if(this.isPalindrome(str,start,end,dp)) {
            dp[start][end] = 0;
            return 0;
        }
        
        int minBrk= Integer.MAX_VALUE;
        
        for(int brk=start; brk<end; brk++) {
            if(this.isPalindrome(str, start, brk, dp)) {
                minBrk = Math.min(minBrk, 1 + this.helper(str, brk+1, end, dp));
            }
        }
        
        dp[start][end] = minBrk;
        
        return minBrk;
    }
    
    private boolean isPalindrome(String str, int start, int end, int dp[][]) {
        if(dp[start][end] == 0) return true;
        
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end))
                return false;
            
            start++;
            end--;
        }
        
        return true;
    }
}