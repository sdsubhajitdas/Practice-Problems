// https://www.interviewbit.com/problems/distinct-numbers-in-window/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/04/2021
*/

import java.util.*;

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> arr, int b) {
        ArrayList<Integer> distinctInts = new ArrayList<>();
        if(b == 0) {
            for(int i = 1; i<=arr.size(); i++) distinctInts.add(i);
            return distinctInts;
        }
        if(b == 1)
            return new ArrayList<Integer>(Collections.nCopies(arr.size(), 1));

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i<b; i++) this.addToMap(frequencyMap, arr.get(i));
        distinctInts.add(this.countUniqueNumbers(frequencyMap));

        for(int i = 1; i<arr.size()-b+1; i++) {
            this.addToMap(frequencyMap, arr.get(i+b-1));
            this.removeFromMap(frequencyMap, arr.get(i-1));
            distinctInts.add(this.countUniqueNumbers(frequencyMap));
        }

        return distinctInts;
    }

    private int countUniqueNumbers(HashMap<Integer, Integer> frequencyMap) {
        return frequencyMap.keySet().size();
    }

    private void addToMap(HashMap<Integer, Integer> frequencyMap, int key) {
        frequencyMap.put(
            key, 
            frequencyMap.containsKey(key) ? frequencyMap.get(key)+1 : 1
        );
    }

    private void removeFromMap(HashMap<Integer, Integer> frequencyMap, int key) {
        int value = frequencyMap.get(key)-1;
        if(value<=0) 
            frequencyMap.remove(key);
        else 
            frequencyMap.put(key, value);
    }
}