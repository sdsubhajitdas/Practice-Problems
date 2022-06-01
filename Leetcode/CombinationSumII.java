// https://leetcode.com/problems/combination-sum-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    2/06/2022
*/

import java.util.*;

class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    this.combinationSum2Helper(candidates, 0, target, new ArrayList<Integer>(), result);
    return result;
  }

  private void combinationSum2Helper(int candidates[], int index, int target, List<Integer> combination, List<List<Integer>> result) {
    if(target == 0) {
      result.add(new ArrayList<Integer>(combination));
      return;
    }
    if(target<0 || index == candidates.length) return;

    for(int i=index; i<candidates.length; i++) {
      if(i>index && candidates[i-1] == candidates[i]) continue;
      if(candidates[i]> target) break;

      combination.add(candidates[i]);
      this.combinationSum2Helper(candidates, i+1, target-candidates[i], combination, result);
      combination.remove(combination.size()-1);
    }
  }
}
