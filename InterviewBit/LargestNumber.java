// https://www.interviewbit.com/problems/largest-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/03/2021
*/

import java.util.*;


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> a) {
        if(a.size() == 0) return "";
        if(a.size() == 1) return Integer.toString(a.get(0));

        StringBuilder newNumber= new StringBuilder("");
        ArrayList<String> nums = new ArrayList<>();

        for(Integer num: a){
            nums.add(Integer.toString(num));
        }
        Collections.sort(nums, new LexSort());;

        for(int idx= nums.size()-1; idx >=0; idx--)
            if(!nums.get(idx).equals("0"))
                newNumber.append(nums.get(idx));
        
        return newNumber.toString().equals("") ? "0" : newNumber.toString();
    }
}

class LexSort implements Comparator<String> {
    public int compare (String a, String b){
        return ((a+b).compareTo((b+a)) > 0) ? 1: -1;
    }
}
