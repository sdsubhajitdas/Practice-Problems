// https://www.interviewbit.com/problems/palindrome-partitioning/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/05/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<String>> partition(String word) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> path = new ArrayList<>();

        this.partitionHelper(word, 0, path, result);
        return result;
    }

    private void partitionHelper(String word, int idx, ArrayList<String> path, ArrayList<ArrayList<String>> result) {
        if(idx == word.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=idx; i < word.length(); i++) {
            if(isPalindrome(word, idx, i)) {
                path.add(word.substring(idx, i+1));
                this.partitionHelper(word, i+1, path, result);
                path.remove(path.size()-1);
            }
        }
    }

    private boolean isPalindrome(String word, int start, int end) {
        if(start == end) return true;

        while(start < end) {
            if(word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
