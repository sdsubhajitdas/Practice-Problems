// https://www.interviewbit.com/problems/remove-element-from-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/03/2021
*/

import java.util.*;

public class Solution {
    public int removeElement(ArrayList<Integer> arr, int element) {
        if(arr.size() == 0 ) return 0;
        int last=0,fast=0;

        while(fast<arr.size()){
            if(!arr.get(fast).equals(element)) {
                // Replace elements
                if(fast != last) {
                    arr.set(last, arr.get(fast));
                }
                last++;
            }
            fast++;
        }
        return last;
    }
}
