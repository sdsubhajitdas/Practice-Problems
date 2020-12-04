// https://leetcode.com/problems/richest-customer-wealth/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/12/2020
*/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=Integer.MIN_VALUE;

        for(int customer=0; customer<accounts.length; customer++){
            int customerWealth = 0;
            for(int account=0; account<accounts[customer].length; account++){
                customerWealth+= accounts[customer][account];
            }
            maxWealth = Math.max(maxWealth,customerWealth);
        }

        return maxWealth;
    }
}