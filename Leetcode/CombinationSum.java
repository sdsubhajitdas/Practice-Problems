// https://leetcode.com/problems/combination-sum/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    31/05/2022
*/

import java.util.*;

class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    this.combinationSumHelper(candidates, target, 0, new ArrayList<Integer>(), result);

    return result;
  }

  private void combinationSumHelper(int candidates[], int target, int index, List<Integer> combination, List<List<Integer>> result) {
    // System.out.println(target);
    if(target<0 || index == candidates.length) return;

    if(target == 0) {
      result.add(new ArrayList<Integer>(combination));
      return;
    }

    for(int i = index; i<candidates.length; i++) {
      if(candidates[i] <= target) {
        combination.add(candidates[i]);
        this.combinationSumHelper(candidates, target-candidates[i], i, combination, result);
        combination.remove(combination.size()-1);
      }
    }
  }
}