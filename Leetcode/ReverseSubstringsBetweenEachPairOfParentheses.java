// https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/07/2021
*/

import java.util.*;

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(i);
            }
            else if(str.charAt(i) == ')') {
                int start = stack.pop();
                StringBuilder sub = new StringBuilder(str.substring(start+1, i));
                sub.reverse();
                str.replace(start+1, i, sub.toString());
                str.deleteCharAt(i);
                str.deleteCharAt(start);
                i -= 2;
            }
        }

        return str.toString();
    }
}