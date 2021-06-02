// https://www.interviewbit.com/problems/longest-increasing-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    02/06/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> arr) {
        if(arr.size()<=1) return arr.size();
        
        int dp[] = new int[arr.size()];
        dp[0] = 1;
        
        int oMaxLength = -1;
        
        for(int i=0; i<arr.size(); i++) {
            int maxLength = 0;
            for(int j=0; j<i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    maxLength = Math.max(maxLength, dp[j]);
                }
            }
            dp[i] = maxLength + 1;
            
            oMaxLength = Math.max(oMaxLength, dp[i]);
        }
        
        return oMaxLength;
    }
}
