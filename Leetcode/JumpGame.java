// https://leetcode.com/problems/jump-game/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    01/08/2021
*/

import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return this.helper(0, nums, dp);
    }

    private boolean helper(int idx, int nums[], int[] dp) {
        if(idx == nums.length-1) return true;
        if(dp[idx] != -1) return dp[idx] == 1;

        for(int jump=1; jump<=nums[idx]; jump++) {
            if(this.helper(idx+jump, nums,dp)) {
                dp[idx] = 1;
                return true;
            }
        }
        
        dp[idx] = 0;
        return false;
    }
}