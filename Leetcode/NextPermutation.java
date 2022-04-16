// https://leetcode.com/problems/next-permutation/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/04/2022
*/

import java.util.*;

class Solution {
  public void nextPermutation(int[] nums) {
    int i = nums.length-2;

    while(i>=0 && nums[i+1]<=nums[i]) {
      i--;
    }
    
    if(i >=0) {
      int j = nums.length - 1;
      while (nums[j] <= nums[i]) {
        j--;
      }

      swap(nums, i, j);
    }
    reverse(nums, i+1);
  }

  private void reverse(int nums[], int start){
    int i = start, j = nums.length-1;
    while (i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  private void swap(int nums[], int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}