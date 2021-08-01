// https://leetcode.com/problems/word-search/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    01/08/2021
*/

import java.util.*;

class Solution {
    public boolean exist(char[][] board, String word) {
        
        char currentWord[] = new char[word.length()];
        boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                currentWord[0] = board[i][j];
                visited[i][j] = true;
                if(this.helper(i, j, 0, board, visited, currentWord, word.toCharArray()))
                    return true;
                visited[i][j] = false;
            }
        }

        return false;
    }


    private boolean helper(int row, int col, int idx, char board[][], boolean visited[][], char currentWord[], char targetWord[]) {
        if(idx==currentWord.length-1) {
            return this.compareTillIndex(idx, currentWord, targetWord);
        }
        if(!this.compareTillIndex(idx, currentWord, targetWord)) return false;

        int validDirections[][] = {{-1,0},{1,0},{0,-1},{0,1}};

        for(int direction[]: validDirections){
            int dr = direction[0];
            int dc = direction[1];

            if(!this.isValidPosition(row+dr, col+dc, board) || visited[row+dr][col+dc])
                continue;
            
            currentWord[idx+1] = board[row+dr][col+dc];
            visited[row+dr][col+dc] = true;
            if(this.helper(row+dr, col+dc, idx+1, board, visited, currentWord, targetWord))
                return true;
            visited[row+dr][col+dc] = false;
            currentWord[idx+1] = ' ';
        }

        return false;
    }



    private boolean compareTillIndex(int idx, char word1[], char word2[]) {
        for(int i=0; i<=idx; i++)
            if(word1[i] != word2[i]) return false;
        
        return true;
    }

    private boolean isValidPosition(int row, int col, char board[][]) {
        if(row>=board.length || row<0) return false;
        if(col>=board[0].length || col<0) return false;

        return true;
    }
}