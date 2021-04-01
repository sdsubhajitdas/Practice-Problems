// https://www.interviewbit.com/problems/numrange/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    02/04/2021
*/

import java.util.*;

public class Solution {
    public int numRange(ArrayList<Integer> arr, int start, int end) {
        return subArrayLessThanOrEqualTo(arr, end) - subArrayLessThanOrEqualTo(arr, start-1);
    }

    private int subArrayLessThanOrEqualTo(ArrayList<Integer> A, int B) {
        int left = 0;
        int right = 0;
        int sum = A.get(0);
        int num = 0;
        while (left < A.size() && right < A.size()) {
            if (sum <= B) {
                if (right >= left) {
                    num += right - left + 1;
                }
                right ++;
                if (right < A.size()) {
                    sum += A.get(right);
                }
            } else {
                sum -= A.get(left);
                left ++;
            }
        }
        return num;
    }
}


