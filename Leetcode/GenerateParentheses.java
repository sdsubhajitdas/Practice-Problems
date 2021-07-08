// https://leetcode.com/problems/generate-parentheses/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/07/2021
*/

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        this.generateParenthesisHelper(new StringBuilder(), 0, 0, n, result);
        return result;
    }
    
    private void generateParenthesisHelper(StringBuilder combination ,int open, int close, int max, List<String> result) {
        if(combination.length() == max*2) {
            result.add(combination.toString());
            return;
        }

        if(open < max) {
            combination.append('(');
            this.generateParenthesisHelper(combination, open+1, close, max, result);
            combination.deleteCharAt(combination.length()-1);
        }

        if(close < open) {
            combination.append(')');
            this.generateParenthesisHelper(combination, open, close+1, max, result);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}