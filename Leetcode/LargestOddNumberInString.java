// https://leetcode.com/problems/largest-odd-number-in-string/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    03/07/2021
*/

import java.util.*;

class Solution {
    public String largestOddNumber(String num) {

        for(int idx=num.length()-1; idx>=0; idx--){
            int digit = Integer.parseInt(Character.toString(num.charAt(idx)));
            if(digit % 2 ==1) {
                return num.substring(0, idx+1);
            }
        }
        return "";
    }
}