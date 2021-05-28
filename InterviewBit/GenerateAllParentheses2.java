// https://www.interviewbit.com/problems/generate-all-parentheses-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/05/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        if(n == 0) return result;

        this.generateParenthesisHelper("", n, n, result);

        return result;
    }

    private void generateParenthesisHelper(String current, int openRem, int closeRem, ArrayList<String> result) {
        // Count goes -ve or unbalanced
        if(openRem < 0 || closeRem < 0 || closeRem < openRem) return ;

        // The generation is complete
        if(openRem == 0 && closeRem == 0){
            result.add(current);
            return;
        }

        this.generateParenthesisHelper(current+"(", openRem-1, closeRem, result);
        this.generateParenthesisHelper(current+")", openRem, closeRem-1, result);
    }
}
