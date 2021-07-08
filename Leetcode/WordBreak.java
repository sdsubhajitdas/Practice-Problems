// https://leetcode.com/problems/word-break/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/07/2021
*/

import java.util.*;

class Solution {
    HashMap<String, Boolean> table = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {
        if(table.containsKey(s)){
            return table.get(s);
        }

        if(wordDict.contains(s)) {
            return true;
        }


        for(int i=1; i<=s.length(); i++) {
            if(wordDict.contains(s.substring(0,i)) && this.wordBreak(s.substring(i), wordDict)) {
                table.put(s.substring(0, i), true);
                return true;
            }
        }

        table.put(s, false);
        return false;
    }
}