// https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    20/07/2021
*/


// User function Template for Java

class Solution {
    long countStrings(int n) {
        long last = 3;
        long secondLast = 2;
        if(n == 1) return secondLast;
        if(n == 2) return last;
        
        long ans=0;
        n = n-2;
        
        while(n!=0) {
            ans = (last + secondLast) % ((long) Math.pow(10,9)+7);
            secondLast = last;
            last = ans;
            n--;
        }
        
        return ans;
    }
}