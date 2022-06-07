// https://leetcode.com/problems/single-element-in-a-sorted-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/06/2022
*/

import java.util.*;

class Solution {
  public int singleNonDuplicate(int[] nums) {
    int low=0, high=nums.length-2;

    while(low<=high) {
      int mid = (low+high)/2;
      if(mid%2 == 0) {
        if(nums[mid] == nums[mid+1]){
          low = mid+1;
        }
        else {
          high = mid-1;
        }
      }
      else {
        if(mid-1>=0 && nums[mid] == nums[mid-1]) {
          low = mid+1;
        }
        else {
          high = mid-1;
        }
      }
    }
    return nums[low];
  }
}