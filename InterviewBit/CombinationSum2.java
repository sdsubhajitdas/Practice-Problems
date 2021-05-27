// https://www.interviewbit.com/problems/combination-sum-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/05/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> cNums, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> combination = new ArrayList<>();
        // cNums = new ArrayList<>(new HashSet<>(cNums));
        Collections.sort(cNums);
        
        this.combinationSumHelper(cNums, 0, target, 0, combination, result);

        return result;
    }

    private void combinationSumHelper(ArrayList<Integer> cNums, int idx, int target, int sum, ArrayList<Integer> combination, ArrayList<ArrayList<Integer>> result) {
        if(sum > target) return;

        if(sum == target) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for(int i=idx; i < cNums.size(); i++) {
            if(i == idx){
                combination.add(cNums.get(i));
                this.combinationSumHelper(cNums, i+1, target, sum+cNums.get(i), combination, result);
                combination.remove(combination.size() - 1);
            }
            if(i > idx && cNums.get(i-1) != cNums.get(i)) {
                combination.add(cNums.get(i));
                this.combinationSumHelper(cNums, i+1, target, sum+cNums.get(i), combination, result);
                combination.remove(combination.size() - 1);
            }

        }
    }
}

// Expected output is [1 1 6 ] [1 2 5 ] [1 7 ] [2 6 ]
// [ 1, 1, 2, 5, 6, 7, 10 ]
// 8
