// https://leetcode.com/problems/max-consecutive-ones/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/05/2022
*/

import java.util.*;

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int maxOnes = Integer.MIN_VALUE;
    int count = 0;

    for (int num: nums) {
      if(num == 0) {
        maxOnes = Math.max(maxOnes, count);
        count = 0;
        continue;
      }
      count++;
    }
    return Math.max(maxOnes, count);
  }
}