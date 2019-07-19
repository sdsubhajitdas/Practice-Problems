
// https://practice.geeksforgeeks.org/problems/rod-cutting/0/?track=sp-dynamic-programming&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    19/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int n = sc.nextInt();
            int cost[] = new int[n + 1];
            for (int i = 1; i <= n; i++)
                cost[i] = sc.nextInt();

            int dp[][] = new int[n + 1][n + 1];

            for (int plen = 0; plen <= n; plen++) {
                for (int tlen = 0; tlen <= n; tlen++) {
                    if (plen == 0 || tlen == 0)
                        dp[plen][tlen] = 0;
                    else if (plen == 1)
                        dp[plen][tlen] = cost[plen] * tlen;
                    else if (plen > tlen)
                        dp[plen][tlen] = dp[plen - 1][tlen];
                    else {
                        dp[plen][tlen] = Math.max(dp[plen - 1][tlen], cost[plen] + dp[plen][tlen - plen]);
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
        sc.close();
    }
}