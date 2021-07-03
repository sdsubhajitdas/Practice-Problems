// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    03/07/2021
*/

import java.util.*;

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int bigProduct = nums[nums.length-1] * nums[nums.length-2];
        int smallProduct = nums[0] * nums[1];

        return bigProduct - smallProduct;
    }
}