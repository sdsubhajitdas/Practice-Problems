// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/12/2020
*/

import java.util.HashMap;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int t : time) {
            if(t % 60 == 0)
                count += map.getOrDefault(0, 0);
            else 
                count += map.getOrDefault(60 - t % 60, 0);
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }
        return count;
    }
}