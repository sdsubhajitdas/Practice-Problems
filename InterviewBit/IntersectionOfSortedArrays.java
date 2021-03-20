// https://www.interviewbit.com/problems/intersection-of-sorted-arrays/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> arr1, final List<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        if(arr1.size()==0 || arr2.size()==0) return result;

        int pointer1=0, pointer2=0;

        while(pointer1<arr1.size() && pointer2<arr2.size()){
            int a = arr1.get(pointer1);
            int b = arr2.get(pointer2);
            if(a==b){
                result.add(a);
                pointer1++;
                pointer2++;
                continue;
            }
            if(a<b)
                pointer1++;
            else
                pointer2++;
        }

        return result;
    }
}
