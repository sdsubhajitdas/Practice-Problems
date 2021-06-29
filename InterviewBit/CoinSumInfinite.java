// https://www.interviewbit.com/problems/coin-sum-infinite/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/06/2021
*/

import java.util.*;

public class Solution {
    public int coinchange2(ArrayList<Integer> coins, int targetSum) {

        int dp[][] = new int[coins.size()+1][targetSum+1];
        int MODULO = 1000007;

        for(int idx=0; idx<=coins.size(); idx++) dp[idx][0] = 1;

        for(int idx=1; idx<=coins.size(); idx++) {
            for(int sum=0; sum<=targetSum; sum++) {
                int val = coins.get(idx-1);

                if(val <= sum) 
                    dp[idx][sum] = (dp[idx-1][sum] + dp[idx][sum - val]) % MODULO;
                else
                    dp[idx][sum] = dp[idx-1][sum] % MODULO;
            }
        }

        return dp[coins.size()][targetSum];
    }
}
