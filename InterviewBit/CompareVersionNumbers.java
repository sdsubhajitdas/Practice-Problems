// https://www.interviewbit.com/problems/compare-version-numbers/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/03/2021
*/

import java.util.*;

public class Solution {
    public int compareVersion(String v1, String v2) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(v1.split("[.]")));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(v2.split("[.]")));

        while(a.size() > b.size()) b.add("0");
        while(a.size() < b.size()) a.add("0");

        // int i=0,j=0;

        for(int i=0,j=0; i<a.size() && j<b.size(); i++,j++){
            double d1 = Double.parseDouble(a.get(i));
            double d2 = Double.parseDouble(b.get(j));

            if(d1>d2) return 1;
            else if(d1<d2) return -1;
        }

        return 0;
    }
}
