// https://leetcode.com/problems/kth-largest-element-in-an-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/06/2022
*/

import java.util.*;

class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    for(int num: nums) {
      heap.add(num);
      if(heap.size()>k) heap.poll();
    }

    return heap.poll();
  }
}


