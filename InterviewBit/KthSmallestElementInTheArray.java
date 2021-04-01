// https://www.interviewbit.com/problems/kth-smallest-element-in-the-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    01/04/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for ( int i=0; i < A.size(); i++){
            minHeap.add(A.get(i));
        }
        
        for (int i =0; i < B-1 ;i++){
            minHeap.remove();
        }
        return minHeap.remove();
    }
}
