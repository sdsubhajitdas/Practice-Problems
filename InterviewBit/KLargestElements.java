// https://www.interviewbit.com/problems/k-largest-elements/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int num: nums) heap.add(num);

        int removeLimit = heap.size() - k;

        while(removeLimit!=0) {
            removeLimit--;
            heap.remove();
        }

        while(k!=0){
            k--;
            resultList.add(heap.remove());
        }

        return resultList;
    }
}



