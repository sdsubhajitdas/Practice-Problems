// https://leetcode.com/problems/median-of-two-sorted-arrays/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    12/06/2022
*/

import java.util.*;

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if(nums2.length < nums1.length) return findMedianSortedArrays(nums2, nums1);

    int l1 = nums1.length, l2 = nums2.length;
    int low = 0, high = l1;

    while(low <= high) {
      int cut1 = (low+high) / 2;
      int cut2 = (l1+l2+1) / 2 - cut1;

      int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1-1];
      int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2-1];

      int right1 = cut1 == l1 ? Integer.MAX_VALUE : nums1[cut1];
      int right2 = cut2 == l2 ? Integer.MAX_VALUE : nums2[cut2];

      if(left1 <= right2 && left2 <= right1) {
        if((l1+l2) % 2 == 0) {
          return (Math.max(left1,left2) + Math.min(right1, right2))/2.0;
        }
        else {
          return Math.max(left1, left2);
        }
      }
      else if (left1 > right2) {
        high = cut1-1; 
      }
      else {
        low = cut1+1;
      }
    }
    return 0.0;
  }
}