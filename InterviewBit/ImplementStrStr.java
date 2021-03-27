// https://www.interviewbit.com/problems/implement-strstr/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/03/2021
*/

import java.util.*;


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String haystack, final String needle) {
        if(haystack.length() == 0 || needle.length() == 0) return 0;

        if(haystack.length() < needle.length()) return -1;

        for(int idx=0; idx < haystack.length() - needle.length() + 1; idx++) {
            String substring = haystack.substring(idx, idx+needle.length());
            if(substring.equals(needle)) return idx;
        }
        return -1;
    }
}

