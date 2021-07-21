// https://leetcode.com/problems/find-the-town-judge/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/07/2021
*/

import java.util.*;

class Solution {
    public int findJudge(int n, int [][] trust) {
        int trusts[] = new int[n+1];
        int isTrusted[] = new int[n+1];

        for(int i=0; i<trust.length; i++) {
            trusts[trust[i][0]]++;
            isTrusted[trust[i][1]]++;
        }

        int i=1;
        for(; i<=n; i++) {
            if(isTrusted[i] == n-1) break;
        }

        if(i>n) return -1;

        if(trusts[i] == 0) return i;

        return -1;
    }
}