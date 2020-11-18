// https://leetcode.com/problems/squares-of-a-sorted-array/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/11/2020
*/

class Solution {
    public int[] sortedSquares(int[] arr) {
        int squares[] = new int[arr.length];
        
        int start, end=arr.length-1, index=arr.length-1;

        for(start=0; start<=end; index--){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                squares[index] = arr[start] * arr[start];
                start++;
            }
            else {
                squares[index] = arr[end] * arr[end];
                end--;
            }
        }
        return squares;
    } 
}