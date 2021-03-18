// https://www.interviewbit.com/problems/single-number-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int num = 0;
        int count = 0;
        for(int i=0;i<32;++i) {
            count = 0;
            for(int a : A) {
                if((a & 1 << i) != 0) {
                    count++;
                }
            }
            if(count%3 != 0) {
                num+=1<<i;
            }
        }
        return num;
    }
}

