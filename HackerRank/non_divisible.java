
// https://www.hackerrank.com/challenges/non-divisible-subset/problem
/*
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/07/2019
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        int nums[], rems[];
        int count;
        n = sc.nextInt();
        k = sc.nextInt();

        nums = new int[n];
        rems = new int[k];
        Arrays.fill(rems, 0);

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            rems[nums[i] % k] += 1;
        }

        count = Math.min(rems[0],1);

        for(int i = 1;i<=k/2;i++){
            if(i!=k-i)
                count += Math.max(rems[i],rems[k-i]);
            else
                count ++ ;
        }
        
        System.out.println(count);
        sc.close();
    }
}