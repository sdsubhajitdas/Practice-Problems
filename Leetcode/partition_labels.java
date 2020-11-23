import java.util.ArrayList;

// https://leetcode.com/problems/partition-labels/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    24/11/2020
*/

import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> partitionLengths = new ArrayList<Integer>();

        int lastIndexOf[] = new int[26];
        for(int idx=0; idx < s.length(); idx++){
            lastIndexOf[s.charAt(idx)-'a'] = idx;
        }

        int start=0, end;

        while(start < s.length()){
            end = lastIndexOf[s.charAt(start)-'a'];
            int movingPointer = start + 1;
            while(movingPointer <= end){
                if(lastIndexOf[s.charAt(movingPointer)-'a']> end){
                    end = lastIndexOf[s.charAt(movingPointer)-'a'];
                }
                movingPointer++;
            }
            partitionLengths.add(end-start+1);
            start = end+1;
        }

        return partitionLengths;
    }
}