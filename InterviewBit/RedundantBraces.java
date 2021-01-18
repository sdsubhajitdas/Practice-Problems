// https://www.interviewbit.com/problems/redundant-braces/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/01/2021
*/

import java.util.Stack;

public class Solution {
    public int braces(String exp) {
        Stack <Character> stack = new Stack<>();

        for(int idx=0; idx< exp.length(); idx++){
            char a = exp.charAt(idx);
            if(a==')'){
                int contains = 0;
                char popChar;
                while(stack.pop() != '(')
                    contains++;
                if(contains<=1) return 1;
            }
            else{
                stack.push(a);
            }
        }
        return 0;
    }
}
