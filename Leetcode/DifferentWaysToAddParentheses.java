// https://leetcode.com/problems/different-ways-to-add-parentheses/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/07/2021
*/

import java.util.*;

class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        return this.helper(0, expression.length()-1, expression);
    }

    private List<Integer> helper(int start, int end, String exp) {
        List<Integer> result = new ArrayList<>();
        
        if(start>end) return result;

        boolean isOperatorPresent = false;

        for(int i=start; i<=end; i++) {
            if(!Character.isDigit(exp.charAt(i))) {
                isOperatorPresent = true;
                List<Integer> left = this.helper(start, i-1, exp);
                List<Integer> right = this.helper(i+1, end, exp);

                for(int leftVal: left) {
                    for(int rightVal: right) {
                        result.add(this.calculate(leftVal, exp.charAt(i), rightVal));
                    }
                }
            }
        }

        if(!isOperatorPresent) {
            result.add(Integer.parseInt(exp.substring(start, end+1)));
        }

        return result;
    }

    private int calculate(int num1, char operator, int num2) {
        if(operator == '+') return num1+num2;
        if(operator == '-') return num1-num2;
        if(operator == '*') return num1*num2;
        if(operator == '/') return num1/num2;

        return 0;
    }
}