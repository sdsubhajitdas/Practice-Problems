// https://leetcode.com/problems/valid-mountain-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/12/2020
*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;

        boolean isIncreasing=false, isDecreasing=false;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                if(!isDecreasing)
                    isIncreasing = true;
                else return false;
            }
            else if(arr[i] < arr[i-1]){
                if(isIncreasing)
                    isDecreasing = true;
                else return false;
            }
            else return false;
        }
        return (isIncreasing && isDecreasing);
    }
}