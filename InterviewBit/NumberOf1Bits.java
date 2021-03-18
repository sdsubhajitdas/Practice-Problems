// https://www.interviewbit.com/problems/number-of-1-bits/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/03/2021
*/

import java.util.*;

public class Solution {
    public int numSetBits(long a) {
        int count = 0;
        for(int i=0; i<=32; i++)
            if((a & (long)Math.pow(2, i)) > 0) count++;
            
        return count;
    }
}

