// https://leetcode.com/problems/next-greater-element-i/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/06/2022
*/

import java.util.*;

class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
    HashMap<Integer, Integer> table = new HashMap<>();


    for(int i=nums2.length-1; i>=0; i--) {
      while(!stack.isEmpty() && stack.peek()<=nums2[i]) {
        stack.pop();
      }

      table.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
      stack.add(nums2[i]);
    }

    int result[] = new int[nums1.length];

    for(int i=0; i<result.length; i++)
      result[i] = table.get(nums1[i]);

    return result;
  }
}