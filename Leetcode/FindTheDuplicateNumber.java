// https://leetcode.com/problems/find-the-duplicate-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/05/2022
*/

import java.util.*;

class Solution {
  public int findDuplicate(int[] nums) {
    int tortoise=nums[0],hare=nums[0];

    do {
      tortoise = nums[nums[tortoise]];
      hare = nums[hare];
    }while(tortoise != hare);

    tortoise = nums[0];

    while(tortoise != hare) {
      tortoise = nums[tortoise];
      hare = nums[hare];
    }

    return hare;
  }
}

