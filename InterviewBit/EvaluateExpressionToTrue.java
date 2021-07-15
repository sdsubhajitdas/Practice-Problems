// https://www.interviewbit.com/problems/evaluate-expression-to-true/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/07/2021
*/

import java.util.*;

public class Solution {
    public int cnttrue(String str) {
        int dp[][][] = new int[str.length()][str.length()][2];

        for(int grid[][]: dp)
            for(int col[]:grid)
                Arrays.fill(col, -1);
        
        return this.helper(str.toCharArray(), 0, str.length()-1, true, dp);
    }

    private int helper(char str[], int start, int end, boolean isTrue, int dp[][][]) {
        if(start > end) return 0;
        int gridIdx = isTrue ? 1:0, ans=0, modulo = 1003;

        if(dp[start][end][gridIdx] != -1) return dp[start][end][gridIdx];

        if(start == end) {
            ans = isTrue ? str[start] == 'T'? 1:0 : str[start] == 'F'? 1:0;
            dp[start][end][gridIdx] = ans;
            return ans;
        }

        for(int brk=start+1; brk<end; brk++) {
            int leftTrue = this.helper(str, start, brk-1, true, dp);
            int leftFalse = this.helper(str, start, brk-1, false, dp);
            int rightTrue = this.helper(str, brk+1, end, true, dp);
            int rightFalse = this.helper(str, brk+1, end, false, dp);

            boolean expResult=false;
            switch(str[brk]) {
                case '|':
                    ans += isTrue ? (leftTrue*rightTrue + leftTrue*rightFalse + leftFalse*rightTrue)%modulo : (leftFalse*rightFalse)%modulo;
                    break;
                case '&':
                    ans += isTrue ? (leftTrue*rightTrue)%modulo : (leftFalse*rightFalse + leftTrue*rightFalse + leftFalse*rightTrue)%modulo;
                    break;
                case '^':
                    ans += isTrue ? (leftTrue*rightFalse + leftFalse*rightTrue)%modulo : (leftFalse*rightFalse + leftTrue*rightTrue)%modulo;
                    break;
            }
            ans = ans % modulo;
        }

        dp[start][end][gridIdx] = ans;
        return ans;
    }
}