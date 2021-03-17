// https://www.interviewbit.com/problems/search-for-a-range/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> searchRange(final List<Integer> arr, int num) {
        int low=0, high=arr.size()-1, foundIdx = -1;
        ArrayList<Integer> pos = new ArrayList<>();

        if(arr.size() == 1) {
            pos.add(0);
            pos.add(0);
            return pos;
        }

        pos.add(this.searchRangeLow(arr, num));
        pos.add(this.searchRangeHigh(arr, num));
        return pos;
    }

    private int searchRangeLow(List<Integer> arr, int num) {
        int low=0, high=arr.size()-1, resultIdx=-1;

        while(low <= high) {
            int mid = low + ((high - low)/2);

            if(arr.get(mid) > num)
                high = mid - 1;
            else if(arr.get(mid) < num)
                low = mid + 1;
            else {
                resultIdx = mid;
                high = mid - 1;
            }
        }
        return resultIdx;
    }

    private int searchRangeHigh(List<Integer> arr, int num) {
        int low=0, high=arr.size()-1, resultIdx=-1;

        while(low <= high) {
            int mid = low + ((high - low)/2);

            if(arr.get(mid) > num)
                high = mid - 1;
            else if(arr.get(mid) < num)
                low = mid + 1;
            else {
                resultIdx = mid;
                low = mid + 1;
            }
        }
        return resultIdx;
    }

}
