// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/04/2022
*/

import java.util.*;

class Solution {
  public int maxProfit(int[] prices) {
    if(prices.length == 1) return 0;

    int maxProfit = Integer.MIN_VALUE, maxTillNow = Integer.MIN_VALUE;

    for(int i=prices.length-1; i >= 0; i--) {
      maxTillNow = Math.max(maxTillNow, prices[i]);
      maxProfit = Math.max(maxProfit, maxTillNow -  prices[i]);
    }

    return maxProfit;
  }
}