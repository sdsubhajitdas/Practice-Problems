// https://leetcode.com/problems/target-sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/06/2021
*/

import java.util.*;


class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int totalSum = 0;
        for(int num: nums) totalSum+=num;

        if(target > totalSum || (totalSum + target)%2 == 1){
            return 0;
        }
        
        target = (target + totalSum)/2;
        int dp[][] = new int[nums.length+1][target+1];
        for(int row=0; row<=nums.length; row++) dp[row][0] = 1;
                
        
        for(int idx=1; idx<=nums.length; idx++) {
            for(int sum=0; sum<=target; sum++) {
                
                if(nums[idx-1] <= sum) {
                    dp[idx][sum] = dp[idx-1][sum] + dp[idx-1][sum-nums[idx-1]];
                }
                else {
                    dp[idx][sum] = dp[idx-1][sum];
                }
            }
        }
        
        return dp[nums.length][target];
    }
}