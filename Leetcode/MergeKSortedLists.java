// https://leetcode.com/problems/merge-k-sorted-lists/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    18/06/2022
*/

import java.util.*;

//  * Definition for singly-linked list.
// public class ListNode {
//   int val;
//   ListNode next;
//   ListNode() {}
//   ListNode(int val) { this.val = val; }
//   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0) return null;

    ListNode dummyHead = new ListNode();
    ListNode pointer = dummyHead;
    PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);

    int k = lists.length;

    for(int i=0; i<k; i++) {
      ListNode node = lists[i];
      if(node != null) {
        heap.add(node);
        node = node.next;
      }
      lists[i] = node;
    }
    if(heap.isEmpty()) return null;

    while(!heap.isEmpty()) {
      ListNode node = heap.poll();
      pointer.next = node;
      pointer = pointer.next;
      if(node.next != null)
        heap.add(node.next);
    }

    return dummyHead.next;
  }
}