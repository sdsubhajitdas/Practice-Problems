// https://leetcode.com/problems/reverse-nodes-in-k-group/
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
  public ListNode reverseKGroup(ListNode head, int k) {
    if(head == null || head.next == null) return head;

    int copyK = k;

    // Calculating if reversal possible
    ListNode headCopy = head;

    while(headCopy != null && copyK != 0) {
      copyK--;
      headCopy = headCopy.next;
    }
    if(copyK != 0) return head;
    
    copyK = k-1;
    ListNode previousNode = head, pointerNode = head.next;

    previousNode.next = null;

    while(pointerNode != null && copyK>0) {
      ListNode tempNode = pointerNode.next;
      pointerNode.next = previousNode;
      previousNode = pointerNode;
      pointerNode = tempNode;
      copyK--;
    }

    ListNode nextNode =  this.reverseKGroup(pointerNode, k);

    head.next = nextNode;

    return previousNode;
  }
}