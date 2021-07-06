// https://leetcode.com/problems/longest-palindromic-substring/submissions/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/07/2021
*/

import java.util.*;

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length() == 0) return "";
        
        int start=0, end=0, maxLength=0;

        for(int i=0; i<s.length(); i++) {
            int lenOdd = this.getPalindromeFromMiddle(s, i, i);
            int lenEven = this.getPalindromeFromMiddle(s, i, i+1);

            int lenMax = Math.max(lenOdd, lenEven);

            if(maxLength < lenMax) {
                // System.out.println("I: "+i+", Len: "+lenMax);
                start = i-(lenMax-1)/2;
                end = i+(lenMax/2);
                maxLength = lenMax;
            }
        }

        return s.substring(start, end+1);
    }

    private int getPalindromeFromMiddle(String s, int left, int right) {
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}