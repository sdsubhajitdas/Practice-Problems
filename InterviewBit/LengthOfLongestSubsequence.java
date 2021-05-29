// https://www.interviewbit.com/problems/length-of-longest-subsequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/05/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestSubsequenceLength(final List<Integer> arr) {
        if(arr.size() <= 1) return arr.size();

        int longestLength = -1;
        int incTable[] = new int[arr.size()];
        int decTable[] = new int[arr.size()];
        
        incTable[0]=1;
        decTable[decTable.length-1] = 1;

        for(int i=0; i<arr.size(); i++) {
            int max = 0;
            for(int j=0; j<i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    max = Math.max(max, incTable[j]);
                }
            }
            incTable[i] = max+1;
        }

        for(int i=arr.size()-1; i>=0; i--) {
            int max = 0;
            for(int j=arr.size()-1; j>i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    max = Math.max(max, decTable[j]);
                }
            }
            decTable[i] = max+1;
            longestLength = Math.max(longestLength, decTable[i]+incTable[i]-1);
        }

        return longestLength;
    }
}
