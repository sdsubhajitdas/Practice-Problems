// https://www.interviewbit.com/problems/amazing-subarrays/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/03/2021
*/

import java.util.*;

public class Solution {
    public int solve(String word) {
        if(word.length() == 0) return 0;
        int count = 0, length = word.length();
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        word = word.toLowerCase();

        for(int idx=0; idx<length; idx++){
            if(vowels.contains(word.charAt(idx))) {
                count = (count + ((length - idx)%10003))%10003;
            }
        }
        return count;
    }
}
