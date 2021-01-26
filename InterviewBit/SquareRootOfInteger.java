// https://www.interviewbit.com/problems/square-root-of-integer/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    26/01/2021
*/

public class Solution {
    public int sqrt(int square) {
        if(square == 0) return 0;
        if(square <= 3) return 1;

        long low = 1, high = square, root = 0;

        while(low <= high) {
            root = (high + low)/2;
            if(root*root > square) {
                high = root-1;
            }
            else if(root*root < square) {
                low = root + 1;
            }
            else{
                return (int)root;
            }
        }
        return (int)high;
    }
}
