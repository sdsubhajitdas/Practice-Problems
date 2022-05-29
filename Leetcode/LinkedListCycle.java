// Link
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2022
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
  public boolean hasCycle(ListNode head) {
    if(head == null || head.next == null) return false;

    ListNode slow = head, fast = head;

    while(slow != null && fast != null) {
      slow = slow.next;
      fast = fast.next;
      if(fast != null) fast = fast.next;

      if(slow == fast) return true;
    }

    return false;
  }
}