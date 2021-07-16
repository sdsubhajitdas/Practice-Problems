// https://leetcode.com/problems/single-row-keyboard/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/07/2021
*/

import java.util.*;

class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> table = new HashMap<>();
        int count=0, currentIdx=0;
        
        for(int idx=0; idx<keyboard.length(); idx++) {
            table.put(keyboard.charAt(idx), idx);
        }
        
        
        for(int idx=0; idx<word.length(); idx++) {
            char alpha = word.charAt(idx);
            int goToIdx = table.get(alpha);
            
            count += Math.abs(goToIdx - currentIdx);
            
            currentIdx = goToIdx;
        }
        
        return count;
    }
}