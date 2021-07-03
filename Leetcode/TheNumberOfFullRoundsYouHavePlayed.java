// https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/07/2021
*/

import java.util.*;

class Solution {
    public int numberOfRounds(String startTime, String finishTime) {
        int start = toMinutes(startTime);
        int end = toMinutes(finishTime);
        
        int roundedStart = toNextQuarter(start);
        int roundedEnd = toPreviousQuarter(end);
        
        if (start < end) {
            return Math.max(0, (roundedEnd - roundedStart) / 15);
        }
        
        return (24 * 60 - roundedStart + roundedEnd) / 15;
    }
    
    public static int toMinutes(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60
            + Integer.parseInt(s.substring(3, 5));
    }
    
    public static int toNextQuarter(int time) {
        return ((time + 14) / 15) * 15;
    }

    public static int toPreviousQuarter(int time) {
        return (time / 15) * 15;
    }
}