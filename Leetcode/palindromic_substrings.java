// https://leetcode.com/problems/palindromic-substrings/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    14/12/2020
*/

import java.util.Arrays;

class Solution {
    boolean table[][];
    public int countSubstrings(String s) {
        int count = 0;
        this.table = new boolean[s.length()][s.length()];

        for(int row=0; row<this.table.length; row++){
            Arrays.fill(this.table[row], false);
        }

        // Single character.
        for(int idx=0; idx<this.table.length; idx++){
            this.table[idx][idx] = true;
            count++;
        }

        for(int col=1; col<this.table.length; col++){
            for(int row=0; row<col; row++){
                this.table[row][col] = this.isPalindrome(s.substring(row, col+1), row, col);
                count += this.table[row][col] ? 1:0;
            }
        }

        return count;
    }

    private boolean isPalindrome(String word, int start, int end){
        if(word.length() == 1) return true;
        if(word.length() == 2) {
            return word.charAt(0) == word.charAt(1);
        }

        return (this.table[start+1][end-1]) && (word.charAt(0) == word.charAt(word.length()-1));
    }
}