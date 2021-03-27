// https://www.interviewbit.com/problems/longest-common-prefix/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/03/2021
*/

import java.util.*;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> words) {
        boolean matched = true;
        String prefix = "";
        int idx = 0, minLength = Integer.MAX_VALUE;

        for(String word: words)
            minLength = Math.min(minLength, word.length());

        while(matched && idx < minLength) {
            String newPrefix = prefix + words.get(0).charAt(idx);

            for(String word: words)
                if(!word.startsWith(newPrefix)){
                    matched = false;
                    break;
                }
            if(matched)
                prefix = newPrefix;
            idx++;
        }
        return prefix;
    }
}
