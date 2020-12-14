// https://leetcode.com/problems/palindrome-partitioning/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/12/2020
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        if(s==null || s.length()==0) return result;
        
        this.partitionHelper(s, new ArrayList<>(), result);
        return result;
    }

    private void partitionHelper(String part, List<String> currentList, List<List<String>> resultList) {
        if(part.length() == 0){
            resultList.add(new ArrayList<>(currentList));
            return;
        }

        for(int idx=0; idx<part.length(); idx++){
            String first = part.substring(0, idx+1);
            if(this.isPalindrome(first)){
                currentList.add(first);
                String second = part.substring(idx+1);
                this.partitionHelper(second, currentList, resultList);
                currentList.remove(currentList.size()-1);
            }
        }
    }

    private boolean isPalindrome(String word){
        if(word.length()==1) return true;
        
        int start=0, end=word.length()-1;
        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }   
}