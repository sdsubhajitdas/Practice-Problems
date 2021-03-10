// https://www.interviewbit.com/problems/add-one-to-number/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    11/03/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> array) {
        removeZerosFromStart(array);

        if(array.size() == 0){
            array.add(1);
            return array;
        }
        
        int lastIdx = array.size()-1;
        int add = 1;

        while(add != 0 && lastIdx>=0){
            int newDigit = array.get(lastIdx) + add;
            add = newDigit/10;
            array.set(lastIdx, newDigit%10);
            lastIdx--;
        }

        if(add != 0)
            array.add(0,add);
        return array;
    }

    private void removeZerosFromStart(ArrayList<Integer> array){
        while(array.size()>0 && array.get(0) == 0){
            array.remove(0);
        }
    }
}
