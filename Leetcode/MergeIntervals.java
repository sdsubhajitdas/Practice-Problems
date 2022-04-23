// https://leetcode.com/problems/merge-intervals/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    23/04/2022
*/

import java.util.*;

class Solution {
  public int[][] merge(int[][] intervals) {
    List<int[]> result = new ArrayList<>(); 

    if(intervals.length == 0 || intervals == null) return result.toArray(new int[0][]);
    if(intervals.length == 1) return intervals;

    Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

    int start = intervals[0][0], end = intervals[0][1];

    for(int i[]: intervals) {
      if(i[0] <= end) {
        start = Math.min(start, i[0]);
        end = Math.max(i[1], end);
      }
      else {
        result.add(new int[]{start,end});
        start = i[0];
        end = i[1];
      }
    }
    result.add(new int[]{start,end});
    return result.toArray(new int[0][]);
  }
}
