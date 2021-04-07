// https://www.interviewbit.com/problems/longest-consecutive-sequence/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/04/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> nums) {
        if(nums.size() <= 1) return nums.size();

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        for(int idx=0; idx<nums.size(); idx++) pQueue.add((int)nums.get(idx));

        int maxLen = 1, counter = 1, previous = pQueue.poll();

        for(int idx=1; idx<nums.size(); idx++) {
            if(pQueue.peek() - previous > 1) {
                counter = 1;
            }
            else if(pQueue.peek() - previous == 0) {
            }
            else {
                counter++;
            }
            previous = pQueue.poll();
            maxLen = Math.max(maxLen, counter);
        }
        return maxLen;
    }
}