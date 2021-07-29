// https://leetcode.com/problems/permutations/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/07/2021
*/

import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nums_list = new ArrayList<>();
        for(int num: nums)
            nums_list.add(num);

        this.helper(0, nums_list, result);
        return result;
    }

    private void helper(int idx, List<Integer> nums, List<List<Integer>> result) {
        if(idx == nums.size()) {
            result.add(new ArrayList<>(nums));
            return;
        }

        for(int i=idx; i<nums.size(); i++) {
            Collections.swap(nums, idx, i);
            this.helper(idx+1, nums, result);
            Collections.swap(nums, idx, i);
        }
    }
}


