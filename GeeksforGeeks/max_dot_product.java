// https://practice.geeksforgeeks.org/problems/maximize-dot-product/0/?track=sp-dynamic-programming&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    19/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc--!= 0){
            int n, m;
            int a[],b[];
            n = sc.nextInt();
            m = sc.nextInt();
            a = new int[n];
            b = new int[m];
            for(int i = 0; i< n;i++)
                a[i] = sc.nextInt();
            for(int i = 0; i< m;i++)
                b[i] = sc.nextInt();
            
            long dp[][] = new long[m+1][n+1];
            for(int i=0;i<=m;i++)
                Arrays.fill(dp[i],0);
            
            for(int i=1;i<=m;i++){
                for(int j=i;j<=n;j++){
                    dp[i][j] = Math.max(dp[i-1][j-1]+(long)a[j-1]*b[i-1],
                                        dp[i][j-1]);
                }
            }
            System.out.println(dp[m][n]);
        }
        sc.close();
	}
}