// https://leetcode.com/problems/house-robber/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    25/11/2020
*/

class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }

        int table[] = new int[nums.length];
        table[0] = nums[0];
        table[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i < nums.length; i++){
            table[i] = Math.max(nums[i]+table[i-2], table[i-1]);
        }
        return table[nums.length-1];
    }
}

