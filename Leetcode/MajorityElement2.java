// https://leetcode.com/problems/majority-element-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2022
*/

import java.util.*;

class Solution {
  public List<Integer> majorityElement(int[] nums) {
    List<Integer> result = new ArrayList<>();

    int element1=Integer.MIN_VALUE, element2=Integer.MIN_VALUE;
    int count1=0, count2=0;

    for(int num: nums) {
      if(element1 == num) count1++;
      else if(element2 == num) count2++;
      else if(count1 == 0) {
        element1 = num;
        count1++;
      }
      else if(count2 == 0) {
        element2 = num;
        count2++;
      }
      else {
        count1--;
        count2--;
      }
    }

    count1=0;
    count2=0;

    for(int num: nums) {
      if(num == element1) count1++;
      else if(num == element2) count2++;
    }

    if(count1 > nums.length/3 && element1 != Integer.MIN_VALUE)
      result.add(element1);
    if(count2 > nums.length/3 && element2 != Integer.MIN_VALUE)
      result.add(element2);

    return result;
  }
}
