// https://leetcode.com/problems/rotate-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/05/2022
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
  public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next == null || k == 0) return head;

    int length = 0;
    ListNode pointerNode = head, nextNode = null;

    while(pointerNode != null) {
      length++;
      pointerNode = pointerNode.next;
    }
    if(k%length == 0) return head;
    k = length - (k%length) - 1;
    pointerNode = head;

    while(k != 0) {
      pointerNode = pointerNode.next;
      k--;
    }

    nextNode = pointerNode.next;
    pointerNode.next = null;
    pointerNode = nextNode;

    while(pointerNode.next != null) {
      pointerNode = pointerNode.next;
    }

    pointerNode.next = head;

    return nextNode;

  }
}