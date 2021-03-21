// https://www.interviewbit.com/problems/palindrome-string/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/03/2021
*/

import java.util.*;

public class Solution {
    public int isPalindrome(String str) {
        if(str.length()<=1) return 1;
        int start=0, end=str.length()-1;
        str = str.toLowerCase();

        while(start<end) {
            char startChar = str.charAt(start);
            char endChar = str.charAt(end);
            if(
                (Character.isAlphabetic(startChar) || Character.isDigit(startChar)) && 
                (Character.isAlphabetic(endChar) || Character.isDigit(endChar))
            ) {
                if(startChar != endChar) return 0;
                start++;
                end--;
            }

            if(!(Character.isAlphabetic(startChar) || Character.isDigit(startChar))) start++;
            if(!(Character.isAlphabetic(endChar) || Character.isDigit(endChar))) end--;
        }
        return 1;
    }
}
