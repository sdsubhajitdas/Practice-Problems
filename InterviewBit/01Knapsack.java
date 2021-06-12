// https://www.interviewbit.com/problems/0-1-knapsack/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    12/06/2021
*/

import java.util.*;


public class Solution {
    public int solve(ArrayList<Integer> value, ArrayList<Integer> weight, int capacity) {
        int dp[][] = new int[value.size()+1][capacity+1];

        for(int idx=0; idx<=value.size(); idx++) {
            for(int cap=0; cap<=capacity; cap++) {
                if(idx==0 || cap==0) continue;
                
                if(weight.get(idx-1) <= cap){
                    dp[idx][cap] = Math.max(value.get(idx-1) +dp[idx-1][cap-weight.get(idx-1)], dp[idx-1][cap]);
                }
                else {
                    dp[idx][cap] = dp[idx-1][cap];
                }
            }
        }

        return dp[value.size()][capacity];
    }
}
