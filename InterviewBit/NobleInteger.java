// https://www.interviewbit.com/problems/noble-integer/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/03/2021
*/

import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> arr) {
        if(arr.size()==0) return -1;

        int length = arr.size();
        Collections.sort(arr);

        for(int idx=0; idx<length; idx++) {
            int nextGreaterIndex = idx+1;
            while(nextGreaterIndex<length && arr.get(idx)==arr.get(nextGreaterIndex)){
                nextGreaterIndex++;
            }
            int countGreater = length - nextGreaterIndex;
            if(arr.get(idx) == countGreater) return 1;
            if(nextGreaterIndex == length) return -1;
        }
        return -1;
    }
}
