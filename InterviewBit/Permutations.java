// https://www.interviewbit.com/problems/permutations/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        
        if(arr.size() == 0) return permutations;

        int a[] = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) 
            a[i] = arr.get(i);

        this.permuteHelper(0,a , permutations);

        return permutations;
    }

    private void permuteHelper(int idx, int[] digits, ArrayList<ArrayList<Integer>> permutations) {
        if(idx == digits.length-1) {
            ArrayList<Integer> singlePerm = new ArrayList<>();
            for(int digit: digits)
                singlePerm.add(digit);
            permutations.add(singlePerm);
            return;
        }

        for(int i=idx; i < digits.length; i++) {
            this.swap(digits,idx, i);
            this.permuteHelper(idx+1, digits, permutations);
            this.swap(digits,idx, i);
        }
    }

    private void swap(int[] digits, int i, int j) {
        if(i == j) return;
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
}
