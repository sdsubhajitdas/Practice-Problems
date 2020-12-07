// https://leetcode.com/problems/can-place-flowers/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    08/12/2020
*/  

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0) return true;

        for(int idx=0; idx< flowerbed.length; idx++){
            int left = idx!=0 ? flowerbed[idx-1] : 0;
            int right = idx!=flowerbed.length-1 ? flowerbed[idx+1] : 0;
            if(n == 0) return true;
            if(flowerbed[idx] == 0){
                if(left == 0 && right == 0){
                    flowerbed[idx] = 1;
                    n--;
                }
            }
        }

        return n==0;
    }
}