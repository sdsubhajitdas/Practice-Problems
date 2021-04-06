// https://www.interviewbit.com/problems/first-non-repeating-character-in-a-stream-of-characters/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/04/2021
*/

import java.util.*;

public class Solution {
    public String solve(String stream) {
        if(stream.length() == 1) return stream;

        Queue<Character> streamQueue = new LinkedList<>();
        int table[] = new int[26];
        StringBuilder result = new StringBuilder("");
        

        for(int idx=0; idx<stream.length(); idx++) {
            char x = stream.charAt(idx);
            table[x-'a'] += 1;
            streamQueue.add(x);
            
            while(!streamQueue.isEmpty() && !this.isNotRepeated(streamQueue.peek(), table)) {
                streamQueue.remove();
            }
            char nonRepeatedChar = streamQueue.isEmpty() ? '#' : streamQueue.peek();
            result.append(nonRepeatedChar);
        }
        return result.toString();
    }

    private boolean isNotRepeated(Character x, int table[]) {
        return (table[x-'a']<=1) ? true: false;
    }
}
