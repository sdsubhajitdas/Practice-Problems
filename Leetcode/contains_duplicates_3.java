// https://leetcode.com/problems/contains-duplicate-iii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
*/

import java.util.TreeSet;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> tSet = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            Long justSmaller = tSet.floor((long)nums[i]);
            Long justLarger = tSet.ceiling((long)nums[i]);

            if((justSmaller != null) && (nums[i]-justSmaller <= t))
                return true;
            
            if((justLarger!=null) && (justLarger - nums[i] <=t))
                return true;
            
            tSet.add((long)nums[i]);

            if(tSet.size()>k){
                tSet.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}