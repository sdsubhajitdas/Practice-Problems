// https://leetcode.com/problems/peak-index-in-a-mountain-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/12/2020
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        boolean isIncreasing=false, isDecreasing=false;

        for(int idx=1; idx<arr.length; idx++){
            if(!isDecreasing && arr[idx]>arr[idx-1]){
                isIncreasing=true;
            }
            else if(isIncreasing && arr[idx]<arr[idx-1]){
                return idx-1;
            }
        }
        return -1;
    }
}