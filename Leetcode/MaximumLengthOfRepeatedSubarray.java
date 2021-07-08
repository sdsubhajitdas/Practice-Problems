// https://leetcode.com/problems/maximum-length-of-repeated-subarray/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/07/2021
*/

import java.util.*;

class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        int maxLength = -1; 
        for(int i=1; i<=nums1.length; i++) {
            for(int j=1; j<= nums2.length; j++) {
                if(nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                
                maxLength = Math.max(maxLength, dp[i][j]);
            }
        }
        
        return maxLength;
    }
}