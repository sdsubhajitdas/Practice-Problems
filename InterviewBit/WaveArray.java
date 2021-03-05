// https://www.interviewbit.com/problems/wave-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/03/2021
*/

import java.util.*;   

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> list) {
        if(list.size() <= 1) return list;

        int firstIdx = 0, secondIdx=1;
        Collections.sort(list);

        Integer array[] = list.toArray(new Integer[list.size()]);

        while(firstIdx< array.length && secondIdx< array.length) {
            int temp = array[firstIdx];
            array[firstIdx] = array[secondIdx];
            array[secondIdx]  = temp;
            firstIdx += 2;
            secondIdx += 2;
        }

        ArrayList<Integer> ret = new ArrayList<>();
        for(int i=0; i< array.length; i++)
            ret.add(array[i]);
        return ret;
    }
}
