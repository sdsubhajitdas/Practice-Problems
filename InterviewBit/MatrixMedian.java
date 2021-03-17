// https://www.interviewbit.com/problems/matrix-median/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    12/03/2021
*/

import java.util.*;

public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> matrix) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for(ArrayList<Integer> row: matrix){
            min = Math.min(min, row.get(0));
            max = Math.max(max, row.get(row.size()-1));
        }

        int desired = (matrix.size()*matrix.get(0).size()+1)/2;
        while(min < max){
            int mid = min + ((max-min)/2);
            int position = 0, get=0;
            for(ArrayList<Integer> row: matrix){
                get = Arrays.binarySearch(row.toArray(), mid);
                if(get < 0)
                    get = Math.abs(get) - 1;
                else 
                    while(get < row.size() && row.get(get) == mid)
                        get++;
                position += get;
            }

            if(position < desired) min = mid + 1;
            else max = mid;
        }
        return min;
    }
}
