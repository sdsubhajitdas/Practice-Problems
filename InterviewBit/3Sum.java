// https://www.interviewbit.com/problems/3-sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/03/2021
*/

import java.util.*;

public class Solution {
    public int threeSumClosest(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
        int closest = Integer.MIN_VALUE;

        for(int idx=0; idx<arr.size()-2; idx++) {
            int start=idx+1, end = arr.size()-1;

            while(start < end) {
                int currentSum = arr.get(idx) + arr.get(start) + arr.get(end);
                int difference = Math.abs(currentSum-target);
                
                if(difference == 0) return target;

                if(difference < Math.abs(closest-target))
                    closest = currentSum;
                
                if(currentSum <= target) start++;
                else end--;
            }
        }
        return closest;
    }
}
