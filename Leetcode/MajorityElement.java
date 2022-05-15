// https://leetcode.com/problems/majority-element/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/05/2022
*/

import java.util.*;

class Solution {
  public int majorityElement(int[] nums) {
    int element=0,count=0;

    for(int num: nums) {
      if(count == 0) element = num;
      count += (element == num) ? 1 : -1;
    }
    return element;
  }
}