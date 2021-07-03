// https://leetcode.com/problems/coin-change/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    02/07/2021
*/

import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length+1][amount+1];
        
        for(int amt=0; amt<=amount; amt++) {
            dp[0][amt] = Integer.MAX_VALUE-1;
            if(amt != 0) dp[1][amt] = (amt%coins[0] == 0) ? amt/coins[0] : Integer.MAX_VALUE-1;
        }

        for(int idx=1; idx<=coins.length; idx++) {
            for(int amt=1; amt<=amount; amt++) {
                int val = coins[idx-1];

                if(val <= amt) {
                    dp[idx][amt] = Math.min(dp[idx-1][amt], dp[idx][amt-val] + 1);
                }
                else {
                    dp[idx][amt] = dp[idx-1][amt];
                }
            }
        }

        return (dp[coins.length][amount] == Integer.MAX_VALUE-1) ? -1: dp[coins.length][amount];
    }
}