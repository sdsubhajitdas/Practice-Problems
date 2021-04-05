// https://www.interviewbit.com/problems/evaluate-expression/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/04/2021
*/

import java.util.*;

public class Solution {
    public int evalRPN(ArrayList<String> expression) {
        if(expression.size() == 0) return 0;
        if(expression.size() == 1) return Integer.parseInt(expression.get(0));

        int arr[] = {expression.size()-1};

        return this.evalRPNHelper(expression, arr);
    }

    private int evalRPNHelper(ArrayList<String> exp, int pointer[]) {
        int first, second, result=0;
        String item = exp.get(pointer[0]);

        if(!"+-*/".contains(item)) return Integer.parseInt(item);

        pointer[0] = pointer[0]-1;        
        second = this.evalRPNHelper(exp, pointer);
        pointer[0] = pointer[0]-1;
        first = this.evalRPNHelper(exp, pointer);

        switch(item.charAt(0)) {
            case '+':
                result =  first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first/second;
                break;
        }
        return result;
    }
}
