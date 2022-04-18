// https://leetcode.com/problems/maximum-subarray/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/04/2022
*/

import java.util.*;

class Solution {
  public int maxSubArray(int[] nums) {
    int sum=0, maxSum = Integer.MIN_VALUE;

    for(int i =0; i<nums.length; i++) {
      sum += nums[i];

      maxSum = Integer.max(maxSum,sum);
      if(sum < 0) 
        sum = 0;

    }

    return maxSum;
  }
}