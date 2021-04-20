// https://www.interviewbit.com/problems/profit-maximisation/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    20/04/2021
*/

import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> seatsInRows, int customers) {
        if(customers == 0) return 0;
        int totalProfit = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(seatsInRows);

        while(customers > 0) {
            customers--;
            int cost = maxHeap.poll();
            totalProfit += cost;
            maxHeap.add(cost-1);
        }
        return totalProfit;
    }
}
