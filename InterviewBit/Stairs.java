// https://www.interviewbit.com/problems/stairs/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/05/2021
*/

import java.util.*;

public class Solution {
    public int climbStairs(int stair) {
        int table[] = new int[stair+1];
        table[0] = 1;
        return this.climbStairsHelper(stair, table) ;
    }

    private int climbStairsHelper(int stair, int table[]) {
        if(stair < 0) return 0;
        if(table[stair] != 0) return table[stair];

        table[stair] = this.climbStairsHelper(stair-1, table) + this.climbStairsHelper(stair-2, table);

        return table[stair];
    }
}
