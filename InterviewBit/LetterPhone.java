// https://www.interviewbit.com/problems/letter-phone/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/05/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<String> letterCombinations(String input) {
        if(input.length() == 0) return new ArrayList<String>();

        String arr[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> result = new ArrayList<String>();
        
        this.letterCombinationsHelper(input, 0, "", arr, result);

        return result;
    }

    private void letterCombinationsHelper(String input, int index, String combination, String table[], ArrayList<String> result) {

        if(index == input.length()){
            result.add(combination);
            return;
        }

        int idx = Integer.parseInt(Character.toString(input.charAt(index)));

        for(char alpha: table[idx].toCharArray()){
            this.letterCombinationsHelper(input, index+1, combination+alpha, table, result);
        }
    }
}
