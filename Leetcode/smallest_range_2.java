// https://leetcode.com/problems/smallest-range-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/12/2020
*/

import java.util.Arrays;

class Solution {
    public int smallestRangeII(int[] nums, int k) {
        if(nums==null || nums.length<=1) return 0;
        Arrays.sort(nums);
        int len=nums.length-1;
        int diff=nums[len] - nums[0];

        for(int i=0; i<nums.length-1; i++){
            int high = Math.max(nums[len]-k, nums[i]+k);
            int low = Math.min(nums[0]+k, nums[i+1]-k);
            diff = Math.min(diff,high-low);
        }
        return diff;
    }
}