// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/05/2022
*/

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      if(head == null) return head; 

      return this.removeNthFromEndHelper(head, new int[]{n});
  }

  private ListNode removeNthFromEndHelper(ListNode head, int n[]) {
    if(head == null) return head; 

    ListNode nextNode = this.removeNthFromEndHelper(head.next, n);

    head.next = nextNode;
    n[0]--;

    return n[0] == 0 ? nextNode: head;
  }
}