// https://www.interviewbit.com/problems/anagrams/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/04/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> words) {
        ArrayList<ArrayList<Integer>> resultGroups = new ArrayList<>();

        if(words.size() == 0) return resultGroups;
        if(words.size() == 1) {
            ArrayList<Integer> group = new ArrayList<>();
            group.add(1);
            resultGroups.add(group);
            return resultGroups;
        }

        boolean addedToGroups[] = new boolean[words.size()];

        for(int i = 0; i<words.size(); i++) {
            if(addedToGroups[i]) continue;
            ArrayList<Integer> group = new ArrayList<>();
            group.add(i+1);

            for(int j = i+1; j<words.size(); j++) {
                if(addedToGroups[j]) continue;

                if(this.isAnagram(words.get(i), words.get(j))) {
                    group.add(j+1);
                    addedToGroups[j] = true;
                }
            }

            resultGroups.add(group);
            addedToGroups[i] = true;
        }

        return resultGroups;
    }

    private boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        HashMap<Character, Integer> table = new HashMap<Character, Integer>();

        for(int idx=0; idx<a.length(); idx++) {
            char c = a.charAt(idx);
            if(table.containsKey(c)) table.put(c, table.get(c)+1);
            else table.put(c, 1);
        }

        for(int idx=0; idx<b.length(); idx++) {
            char c = b.charAt(idx);
            if(table.containsKey(c)) table.put(c, table.get(c)-1);
            else return false;
        }

        for(char key: table.keySet()) {
            if(table.get(key) != 0) return false;
        }

        return true;
    }
}


// cat dog god tca act

// [1 ] [2 ] [3 5 ] [4 ] [6 ] [7 ] [8 ] 