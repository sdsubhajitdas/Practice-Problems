// https://www.interviewbit.com/problems/merge-intervals/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    12/03/2021
*/

import java.util.*;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if(intervals.size()==0){
            intervals.add(newInterval);
            return intervals;
        } 

        ArrayList<Interval> modifiedRange = new ArrayList<>();
        int startIdx=-1, endIdx=-1;

        for(int i=0; i<intervals.size(); i++){
            if(Math.max(intervals.get(i).start, newInterval.start) <= Math.min(intervals.get(i).end, newInterval.end)){
                if(startIdx == -1)
                    startIdx = i;
                else
                    endIdx = i;   
            }
        }

        if(startIdx == -1){
            // Add at start
            if(newInterval.end < intervals.get(0).start)
                intervals.add(0, newInterval);
            // Add at end
            else if(intervals.get(intervals.size()-1).end < newInterval.start)
                intervals.add(newInterval);
            else {
                for(int i=0; i<intervals.size()-1; i++){
                    Interval current = intervals.get(i);
                    Interval next = intervals.get(i+1);
                    if(newInterval.start > current.end && newInterval.end < next.start){
                        intervals.add(i+1, newInterval);
                        break;
                    }
                }
            }
            return intervals;
        }


        if(endIdx == -1){
            if(Math.max(intervals.get(startIdx).start, newInterval.start) <= Math.min(intervals.get(startIdx).end, newInterval.end)){
                endIdx = startIdx;
            }
        }

        for(int i=0; i<startIdx; i++)
            modifiedRange.add(intervals.get(i));
        
        if(startIdx != -1 && endIdx != -1) {
            modifiedRange.add(
                new Interval(
                    Math.min(intervals.get(startIdx).start, newInterval.start), 
                    Math.max(intervals.get(endIdx).end, newInterval.end)
                )
            );
        }

        for(int i=endIdx+1; i<intervals.size(); i++)
            modifiedRange.add(intervals.get(i));

        return modifiedRange;
    }

}
