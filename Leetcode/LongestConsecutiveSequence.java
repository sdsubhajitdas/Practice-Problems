// https://leetcode.com/problems/longest-consecutive-sequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    26/05/2022
*/

import java.util.*;

class Solution {
  public int longestConsecutive(int[] nums) {
    HashMap<Integer, Boolean> table = new HashMap<>();
    int maxCount=0;

    for(int num: nums) table.put(num, true);


    for(int num: table.keySet()) {
      if(!table.getOrDefault(num-1, false)) {
        int count=0;
        while(table.getOrDefault(num, false)) {
          num++;
          count++;
        }
        maxCount = Math.max(count, maxCount);
      }
    }

    return maxCount;
  }
}