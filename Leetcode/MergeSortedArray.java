// https://leetcode.com/problems/merge-sorted-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    2/05/2022
*/

import java.util.*;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if(n == 0) return ;
    if(m == 0) {
      for(int j=0; j<n; j++) 
        nums1[j] = nums2[j];
      return ;
    }

    int i=m-1, j=n-1, pointer=nums1.length-1;

    while(i>=0 && j>=0) {
      // System.out.println("Pointer: "+pointer+", I: "+i+", J: "+j);
      if(nums1[i] > nums2[j]) 
        nums1[pointer] = nums1[i--];
      else 
        nums1[pointer] = nums2[j--];
      pointer--;
    }

    while(pointer >=0 && j >= 0) {
      nums1[pointer--] = nums2[j--];
    }
  }
}