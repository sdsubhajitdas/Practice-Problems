// https://leetcode.com/problems/4sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    25/05/2022
*/

import java.util.*;

class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new ArrayList<>();

    if(nums == null || nums.length < 4) return result;

    Arrays.sort(nums);

    for(int i=0; i<nums.length;) {
      for(int j=i+1; j<nums.length;) {
        int low = j+1, high = nums.length-1;
        int findNum = target - nums[j] - nums[i];

        while(low < high) {
          int currentSum = nums[low] + nums[high];
          if(currentSum == findNum) {
            result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
            while(low < high &&  nums[low] == nums[low+1]) low++;
            while(low < high &&  nums[high] == nums[high-1]) high--;
            low++;
            high--;
          }
          else if(currentSum < findNum ) {
            while(low < high &&  nums[low] == nums[low+1]) low++;
            low++;
          }
          else {
            while(low < high &&  nums[high] == nums[high-1]) high--;
            high--;
          }
        }

        while(j+1 < nums.length &&  nums[j] == nums[j+1]) j++;
        j++;
      }

      while(i+1 < nums.length &&  nums[i] == nums[i+1]) i++;
      i++;
    }
  
    return result;
  }
}