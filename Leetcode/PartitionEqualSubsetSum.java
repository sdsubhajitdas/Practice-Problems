// https://leetcode.com/problems/partition-equal-subset-sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    13/06/2021
*/

import java.util.*;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num: nums) sum+= num;
        
        if(sum % 2 == 1) return false;
        
        sum = sum/2;
        
        boolean dp[][] = new boolean[nums.length+1][sum+1];
    
        
        for(int i=0; i<=nums.length; i++)
            dp[i][0] = true;
        
        
        for(int i=1; i<=nums.length; i++) {
            for(int j=1; j<=sum; j++) {
                int val = nums[i-1];
                
                dp[i][j] = dp[i-1][j];
                
                if(val <= j) 
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-val];
                
            }
        }
        
        return dp[nums.length][sum];
    }
    
}