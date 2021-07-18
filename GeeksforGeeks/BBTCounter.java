// https://www.geeksforgeeks.org/count-balanced-binary-trees-height-h/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/07/2021
*/


//User function Template for Java
class Solution {
    static long countBT(int h){
        int modulo = (int)Math.pow(10, 9) + 7;
        long dp[] = new long[h+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=h; i++) 
            dp[i] = (dp[i-1] * (((2*dp[i-2])%modulo + dp[i-1])%modulo))%modulo;

        return dp[h];
    }
}
