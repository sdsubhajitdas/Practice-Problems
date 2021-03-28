// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    28/03/2021
*/

import java.util.*;

public class Solution {
    public int removeDuplicates(ArrayList<Integer> arr) {
        if(arr.size() <=2) return arr.size();

        int length = 2;

        for(int i=2; i<arr.size(); i++) {
            if(!arr.get(i).equals(arr.get(length-2)) || !arr.get(i).equals(arr.get(length-1))) {
                arr.set(length++, arr.get(i));
            }
        }
        return length;
    }
}