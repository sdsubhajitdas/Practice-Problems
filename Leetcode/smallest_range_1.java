// https://leetcode.com/problems/smallest-range-i/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/12/2020
*/

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        if(nums==null || nums.length<=1) return 0;

        int max = Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        for(int num:nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        if(min==max) return 0;

        max -= Math.min(max-k, k);
        min -= (min-max>0)? Math.min(min-max,k): Math.max(min-max,-1*k);
        return (max-min);
    }
}