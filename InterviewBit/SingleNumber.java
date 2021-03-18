// https://www.interviewbit.com/problems/single-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> array) {
        int nonRepeatedNumber=0;
        for(Integer num :array)
            nonRepeatedNumber = nonRepeatedNumber ^ num;
        
        return nonRepeatedNumber;
    }
}
