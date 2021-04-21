// https://www.interviewbit.com/problems/magician-and-chocolates/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/04/2021
*/

import java.util.*;

public class Solution {
    public int nchoc(int units, ArrayList<Integer> chocolates) {
        if(units == 0 || chocolates.size() == 0) return 0;

        int totalEatenChocolates = 0;
        int MODULO_CONSTANT = (int)Math.pow(10, 9) + 7;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(chocolates);

        while(units > 0) {
            units--;
            totalEatenChocolates = (totalEatenChocolates + (maxHeap.peek() % MODULO_CONSTANT )) % MODULO_CONSTANT;
            maxHeap.add(Math.floorDiv(maxHeap.poll(), 2));
        }
        return totalEatenChocolates;
    }
}