// https://leetcode.com/problems/sort-colors/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/08/2021
*/

import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        int low=0, mid=0,high=nums.length-1;

        while(mid<=high) {
            switch(nums[mid]) {
                case 0:
                    this.swapElements(nums, low, mid);
                    low++;
                    break;
                case 2:
                    this.swapElements(nums, mid, high);
                    high--;
                    mid--;
                    break;
            }
            mid++;
        }
    }

    private void swapElements(int nums[], int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}