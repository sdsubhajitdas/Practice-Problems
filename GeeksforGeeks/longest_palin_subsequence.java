
// https://practice.geeksforgeeks.org/problems/longest-palindromic-subsequence/0/?track=sp-dynamic-programming&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    19/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            String s = sc.nextLine();
            int len = s.length();
            int dp[][] = new int[len][len];
            int gap = 0, i = 0, j = 0;
            if(len==0){
                System.out.println(0);
                continue;
            }
            

            while (gap < len) {
                i = 0;
                j = i + gap;
                while (j < len && gap<len) {
                    if (i == j)
                        dp[i][j] = 1;
                    if (s.charAt(i) == s.charAt(j))
                        dp[i][j] = 2 + dp[i + 1][j - 1];
                    else
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    i++;
                    j = i + gap;
                }
                gap++;
            }
            System.out.println(dp[0][len-1]);
        }
        sc.close();
    }
}