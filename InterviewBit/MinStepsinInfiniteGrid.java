// https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/03/2021
*/

import java.util.*;

public class Solution {
    public int coverPoints(ArrayList<Integer> x, ArrayList<Integer> y) {
        int steps = 0;

        for(int idx=1; idx< x.size(); idx++) 
            steps += Math.max(Math.abs(x.get(idx)-x.get(idx-1)), Math.abs(y.get(idx)-y.get(idx-1)));

        return steps;
    }
}
