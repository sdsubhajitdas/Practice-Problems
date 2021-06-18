// https://www.interviewbit.com/problems/minimum-difference-subsets/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/06/2021
*/

import java.util.*;


public class Solution {
    public int solve(ArrayList<Integer> arr) {
        if(arr.size() == 0) return 0;
        if(arr.size() == 1) return arr.get(0);

        int totalArrSum = this.sum(arr);
        int halfArrSum = totalArrSum/2;

        boolean dp[][] = new boolean[arr.size()+1][halfArrSum+1];

        for(int i=0; i<=arr.size(); i++) dp[i][0] = true;

        for(int idx=1; idx<=arr.size(); idx++) {
            for(int desiredSum=1; desiredSum<=halfArrSum; desiredSum++) {
                int val = arr.get(idx-1);

                dp[idx][desiredSum] = dp[idx-1][desiredSum];
                if(val <= desiredSum) {
                    dp[idx][desiredSum] = dp[idx-1][desiredSum] || dp[idx-1][desiredSum - val];
                }
            }
        }


        int firstSubsetSum = 0, secondSubsetSum=0;

        for(int desiredSum=halfArrSum; desiredSum>=0; desiredSum--) {
            if(dp[arr.size()][desiredSum]) {
                firstSubsetSum = desiredSum;
                break;
            }
        }

        secondSubsetSum = totalArrSum - firstSubsetSum;
        
        return Math.abs(firstSubsetSum - secondSubsetSum);
    }


    private int sum(ArrayList<Integer> arr) {
        int sum=0;
        for(Integer num: arr) sum += num;
        return sum;
    }
}