// https://leetcode.com/problems/unique-binary-search-trees/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/07/2021
*/

import java.util.*;

class Solution {
    public int numTrees(int n) {
        int table[] = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                table[i] += table[j-1] * table[i-j]; 
            }
        }
        
        return table[n];
    }
}