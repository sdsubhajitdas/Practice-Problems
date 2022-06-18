// https://www.interviewbit.com/problems/maximum-sum-combinations/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/06/2022
*/

import java.util.*;

public class Solution {
  public ArrayList<Integer> solve(ArrayList<Integer> a, ArrayList<Integer> b, int c) {

    PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
      @Override
      public int compare(int arg0[], int arg1[]) {
        return -1*Integer.compare(arg0[0],arg1[0]);
      }
    });
    ArrayList<Integer> result = new ArrayList<>();
    HashMap<String,Boolean> table = new HashMap<>();

    Collections.sort(a);
    Collections.sort(b);
    heap.add(new int[]{a.get(a.size()-1)+b.get(b.size()-1), a.size()-1, b.size()-1});

    while(c>0) {
      int element[] = heap.poll();
      result.add(element[0]);
      c--;
      int i=element[1], j=element[2];

      i--;
      if(i>=0 && j>=0 && !table.getOrDefault(""+i+"_"+j, false)) {
        heap.add(new int[]{a.get(i)+b.get(j), i, j});
        table.put(""+i+"_"+j, true);
      }
      i++;
      j--;
      if(i>=0 && j>=0 && !table.getOrDefault(""+i+"_"+j, false)) {
        heap.add(new int[]{a.get(i)+b.get(j), i, j});
        table.put(""+i+"_"+j, true);
      }
    }
    return result;
  }
}
