// https://leetcode.com/problems/search-in-rotated-sorted-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/06/2022
*/

import java.util.*;

class Solution {
  public int search(int[] nums, int target) {
    int low=0, high=nums.length-1, mid=0;

    if(nums.length == 1) {
      return nums[0] == target ? 0: -1;
    }

    while(low<=high) {
      mid = (low+high)/2;
      if(nums[mid] == target) return mid;
      // System.out.println(low + " " + high + " " + mid);

      if(nums[low] <= nums[mid]) {
        if(nums[low] <= target && target <= nums[mid]) {
          high = mid-1;
        }
        else {
          low = mid+1;
        }
      }
      else {
        if(nums[mid] <= target && target <= nums[high]) {
          low = mid+1;
        }
        else{
          high = mid-1;
        }
      }
    }

    return -1;
  }
}