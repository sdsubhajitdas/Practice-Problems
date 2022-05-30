// https://leetcode.com/problems/subsets-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/05/2022
*/

import java.util.*;

class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    this.subsetsWithDupHelper(nums, 0, new ArrayList<Integer>(), result);
    return result;
  }

  private void subsetsWithDupHelper(int nums[], int index, List<Integer> set, List<List<Integer>> result) {
    if(index == nums.length) {
      result.add(new ArrayList<>(set));
      return;
    }

    set.add(nums[index]);
    this.subsetsWithDupHelper(nums, index+1, set, result);
    set.remove(set.size()-1);
    while(index+1<nums.length && nums[index] == nums[index+1]) index++;
    this.subsetsWithDupHelper(nums, index+1, set, result);
  }
}