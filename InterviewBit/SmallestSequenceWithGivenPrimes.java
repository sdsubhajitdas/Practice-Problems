// https://www.interviewbit.com/problems/smallest-sequence-with-given-primes/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    02/06/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> solve(int a, int b, int c, int n) {
        int ai=0, bi=0,ci=0;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        
        while(n != 0) {
            int smallestNum = Math.min(
                result.get(ai)*a, 
                Math.min(
                    result.get(bi)*b, 
                    result.get(ci)*c
                    )
                );
            
            result.add(smallestNum);
            n--;
            
            if(smallestNum == result.get(ai)*a) ai++;
            if(smallestNum == result.get(bi)*b) bi++;
            if(smallestNum == result.get(ci)*c) ci++;
        }
        result.remove(0);
        return result;
    }
}
