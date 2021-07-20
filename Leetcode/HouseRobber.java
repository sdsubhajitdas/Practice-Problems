// https://leetcode.com/problems/house-robber/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    20/07/2021
*/

import java.util.*;

class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int dp[] = new int[nums.length];
        dp[nums.length-1] = nums[nums.length-1];
        dp[nums.length-2] = Math.max(nums[nums.length-1], nums[nums.length-2]);

        for(int i=nums.length-3; i>=0; i--) {
            dp[i] = Math.max(dp[i+1], nums[i]+dp[i+2]);
        }

        return dp[0];
    }
}