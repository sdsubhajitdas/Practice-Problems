// https://www.interviewbit.com/problems/subset/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/05/2021
*/

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    ArrayList<ArrayList<Integer>> result;
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> arr) {
        result = new ArrayList<>();
        if(arr.size() == 0 ) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        Collections.sort(arr);

        this.subsetsHelper(arr, arr.size()-1 , new ArrayList<Integer>());

        Collections.sort(result, new LexicographicComparator());

        return result;
    }
    
    private void subsetsHelper(ArrayList<Integer> arr, int idx, ArrayList<Integer> subset) {
        if(idx == -1) {
            result.add((ArrayList) subset.clone());
            return;
        }

        this.subsetsHelper(arr, idx-1, subset);
        subset.add(0,arr.get(idx));
        this.subsetsHelper(arr, idx-1, subset);
        subset.remove(0);
    }

    private class LexicographicComparator implements Comparator<ArrayList<Integer>> {
        public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
            int i=0, j=0;

            while(i < a.size() && j < b.size()) {
                if(a.get(i) == b.get(j)){
                    i++;
                    j++;
                    continue;
                }
                return a.get(i) - b.get(j);
            }

            return a.size() - b.size();
        }
    }
}
