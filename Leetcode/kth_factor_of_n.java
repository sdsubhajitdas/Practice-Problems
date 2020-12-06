// https://leetcode.com/problems/the-kth-factor-of-n/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/12/2020
*/

class Solution {
    public int kthFactor(int n, int k) {
        if(k>n) return -1;

        for(int i=1; i<=n && k>0; i++) {
            if(n%i == 0){
                k--;
                if(k == 0) return i;
            }
        }
        return -1;
    }
}