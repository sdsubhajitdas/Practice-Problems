// https://www.interviewbit.com/problems/balanced-parantheses/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/04/2021
*/

import java.util.*;

public class Solution {
    public int solve(String exp) {
        if(exp.length()==0) return 1;
        if(exp.length()==1) return 0;

        Stack<Character> stack = new Stack<>();

        for(int idx=0; idx<exp.length(); idx++) {
            char bracket = exp.charAt(idx);

            if(bracket == '(') {
                stack.add(bracket);
                continue;
            }

            if(stack.isEmpty()) return 0;
            stack.pop();
        }

        return (stack.isEmpty()) ? 1: 0;
    }
}
