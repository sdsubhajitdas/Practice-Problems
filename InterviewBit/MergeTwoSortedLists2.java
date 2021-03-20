// https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    21/03/2021
*/

import java.util.*;

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                i++;
            } else {
                a.add(i, b.get(j));
                j++;
            }
        }
        while (j < b.size()) {
            a.add(i, b.get(j));
            j++;
        }
    }
}

