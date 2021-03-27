// https://www.interviewbit.com/problems/length-of-last-word/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/03/2021
*/

import java.util.*;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String sentence) {
        String words[] = sentence.split(" ");
        if(words.length == 0) return 0;

        return words[words.length-1].length();
    }
}
