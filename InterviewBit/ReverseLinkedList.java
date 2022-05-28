// https://leetcode.com/problems/reverse-linked-list/
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
  public ListNode reverseList(ListNode head) {
    if(head == null || head.next == null) return head;

    ListNode previousNode = head, pointer = head.next;

    previousNode.next = null;

    while(pointer != null) {
      ListNode temp = pointer.next;
      pointer.next = previousNode;
      previousNode = pointer;
      pointer = temp;
    }

    return previousNode;
  }
}