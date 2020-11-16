// https://leetcode.com/problems/running-sum-of-1d-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/11/2020
*/

class Solution {

  public int[] runningSum(int[] nums) {
    int runningSum[] = new int[nums.length];

    runningSum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      runningSum[i] = runningSum[i - 1] + nums[i];
    }

    return runningSum;
  }
}
