// https://practice.geeksforgeeks.org/problems/count-number-of-hops/0/?track=sp-dynamic-programming&batchId=152
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
        while(tc-- != 0){
            int steps = sc.nextInt();
            int dp[] = new int[steps+1];

            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;

            for(int i=3;i<dp.length;i++){
                dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
            }
            System.out.println(dp[steps]);
        }
        sc.close();
	}
}