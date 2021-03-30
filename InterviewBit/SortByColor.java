// https://www.interviewbit.com/problems/sort-by-color/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/03/2021
*/

import java.util.*;

public class Solution {
    public void sortColors(ArrayList<Integer> arr) {
        if(arr.size() == 0) return;

        sortSingleColor(arr, 0);
        sortSingleColor(arr, 1);
    }

    private void sortSingleColor(ArrayList<Integer> arr, int color) {
        int last=0;

        for(int idx=0; idx<arr.size(); idx++) {
            if(arr.get(idx)>color) {
                last = idx;
                break;
            }
        }

        for(int fast = last+1; fast<arr.size(); fast++) {
            if(arr.get(fast).equals(color)) {
                int temp = arr.get(last);
                arr.set(last, arr.get(fast));
                arr.set(fast, temp);
                last++;
            }
        }
    }
}