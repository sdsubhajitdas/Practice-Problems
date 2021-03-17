// https://www.interviewbit.com/problems/sorted-insert-position/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/03/2021
*/

import java.util.*;

public class Solution {
    public int searchInsert(ArrayList<Integer> arr, int num) {
        if(arr.size() == 0) return 0;
        int low=0, high=arr.size()-1, searchIdx=0;

        while(low <= high){
            searchIdx = low + ((high-low)/2);

            if(arr.get(searchIdx) > num){
                high = searchIdx - 1;
            }
            else if(arr.get(searchIdx) < num){
                low = searchIdx + 1;
            }
            else {
                return searchIdx;
            }
        }

        if(searchIdx == arr.size()-1) searchIdx ++;
        while(searchIdx< arr.size() && arr.get(searchIdx)<num) searchIdx++;
        
        return searchIdx;
    }
}