// https://leetcode.com/problems/subsets/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/07/2021
*/

import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        this.helper(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void helper(int idx, int nums[], List<Integer> subset, List<List<Integer>> result) {
        if(idx == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        this.helper(idx+1, nums, subset, result);
        subset.add(nums[idx]);
        this.helper(idx+1, nums, subset, result);
        subset.remove(subset.size()-1);
    }
}