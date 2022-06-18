// https://leetcode.com/problems/top-k-frequent-elements/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    19/06/2022
*/

import java.util.*;

class Solution {
  private class Pair {
    int value, frequency;
    Pair() {}
    Pair(int value) {this.value=value;}
    Pair(int value, int frequency) {this.value=value; this.frequency=frequency;}
  }

  public int[] topKFrequent(int[] nums, int k) {
    PriorityQueue<Pair> heap = new PriorityQueue<>((a,b) -> b.frequency - a.frequency);
    HashMap<Integer, Integer> table = new HashMap<>();

    for(int num: nums) {
      int frequency = table.getOrDefault(num, 0);
      table.put(num, frequency+1);
    }

    for(int num: table.keySet()) {
      heap.add(new Pair(num, table.get(num)));
    }

    int result[] = new int[k];

    for(int i=0; i<result.length; i++)
      result[i] = heap.poll().value;

    return result;
  }
}
