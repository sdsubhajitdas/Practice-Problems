// https://leetcode.com/problems/linked-list-cycle-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    29/05/2022
*/

import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) return null;

    ListNode slow = head, fast = head;

    while(slow != null && fast != null) {
      slow = slow.next;
      fast = fast.next;
      if(fast != null) fast = fast.next;

      if(slow == fast) break;
    }
    if(slow != fast) return null;

    slow = head;

    while(slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }
}