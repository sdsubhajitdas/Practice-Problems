// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> arr) {
        int maxSum = arr.get(0);
        int sum = maxSum;

        for(int idx=1; idx<arr.size(); idx++){
            sum = Math.max(sum+arr.get(idx), arr.get(idx));
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
