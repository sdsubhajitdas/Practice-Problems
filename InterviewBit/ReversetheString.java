// https://www.interviewbit.com/problems/reverse-the-string/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/07/2021
*/

import java.util.*;

public class Solution {
    public String solve(String sentence) {
        String words[] = sentence.split("([ ]+)");
        String newSentence = "";
        for(int idx=words.length-1; idx>=0; idx--) {
            newSentence = newSentence +  words[idx] + " ";
        }

        return newSentence.trim();
    }
}
