// https://leetcode.com/problems/3sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/12/2020
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length<3) {
            return new ArrayList<>();
        }

        int left,
        right;
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        for (int idx = 0; idx<=nums.length-2 && nums[idx]<=0; idx++) {
            if(idx>0 && nums[idx] == nums[idx-1]) continue;

            left = idx + 1;
            right = nums.length - 1;
            while (left<right) {
                int sum = nums[idx] + nums[left] + nums[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    results.add(Arrays.asList(new Integer[]{nums[idx], nums[left], nums[right]}));
                    left++;
                    while(nums[left]==nums[left-1] && left<right) left++;
                }
            }
        }
        return results;
    }
}