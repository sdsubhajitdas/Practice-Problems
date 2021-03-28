// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/03/2021
*/

import java.util.*;

public class Solution {
    public int removeDuplicates(ArrayList<Integer> arr) {
        if(arr.size() <=1) return arr.size();

        int first=0,second=1;

        while(second<arr.size()) {
            if((int)arr.get(first) == (int)arr.get(second)) {
                second++;
            }
            else{
                first++;
                if(first != second)
                    arr.set(first, arr.get(second));
            }
        }
        return first+1;
    }
}
