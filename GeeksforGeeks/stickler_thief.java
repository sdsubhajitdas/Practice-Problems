
// https://practice.geeksforgeeks.org/problems/stickler-theif/0/?track=sp-dynamic-programming&batchId=152
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    18/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- != 0) {
            int n = sc.nextInt();
            int house[] = new int[n];
            for (int i = 0; i < n; i++)
                house[i] = sc.nextInt();
            

            if(n==0){
                System.out.println(0);
                continue;
            }
            else if(n==1){
                System.out.println(house[0]);
                continue;
            }
            else if(n==2){
                System.out.println(Math.max(house[0],house[1]));
                continue;
            }

            int dp1 = house[0], dp2 = Math.max(house[0],house[1]);
            int loot = 0;

            for(int i=2;i<n;i++){
                loot = Math.max(house[i]+dp1,dp2);
                dp1 = dp2;
                dp2 = loot;
            }
            System.out.println(loot);
            
        }
        sc.close();
    }
}