// https://leetcode.com/problems/climbing-stairs/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/07/2021
*/

import java.util.*;

class Solution {
    public int climbStairs(int n) {
        int secondLast = 1;
        int last = 1;
        int current = 1;
        
        for(int idx=2; idx<=n; idx++){
            current = last + secondLast;
            secondLast = last;
            last = current;
        }
        return current;
    }
}