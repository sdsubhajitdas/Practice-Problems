// https://www.interviewbit.com/problems/nearest-smaller-element/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>(); 
        if(arr.size()==0) return result;
        if(arr.size()==1) {
            result.add(-1);
            return result;
        }

        Stack<Integer> stack = new Stack<>();

        for(int idx=0; idx<arr.size(); idx++) {
            int nearestSmallestNum = -1;

            while(!stack.isEmpty() && stack.peek() >= arr.get(idx)) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result.add(-1);
                stack.add(arr.get(idx));
                continue;
            }

            result.add(stack.peek());
            stack.add(arr.get(idx));
        }

        return result;
    }
}


// [ 34, 35, 27, 42, 5, 28, 39, 20, 28 ]

// ans : -1 34 -1 27 -1 5 28 5 20 