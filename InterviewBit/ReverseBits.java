// https://www.interviewbit.com/problems/reverse-bits/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/03/2021
*/

import java.util.*;

public class Solution {
    public long reverse(long num) {
        long reverse=0, move = 32;

        while(move != 0){
            reverse = reverse << 1;

            if((int)(num & 1) == 1)
                reverse = reverse | 1;
            
            num = num >> 1;
            move--;
        }
        return reverse;
    }
}
