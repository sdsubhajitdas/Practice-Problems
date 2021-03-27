// https://www.interviewbit.com/problems/count-and-say/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/03/2021
*/

import java.util.*;

public class Solution {
    public String countAndSay(int n) {
        if(n == 0) return "";
        
        String num = "1";        
        while(n != 1) {
            int idx = 1, count = 1;
            char digit = num.charAt(0);
            String nextNum = "";
            while(idx < num.length()) {
                if(digit == num.charAt(idx)){
                    count++;
                }
                else{
                    nextNum = nextNum + (Integer.toString(count) + digit);
                    digit = num.charAt(idx);
                    count = 1;
                }
                idx++;
            }
            nextNum = nextNum + (Integer.toString(count) + digit);
            num = nextNum;
            n--;
        }

        return num;
    }
}
