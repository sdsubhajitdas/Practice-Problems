// https://www.interviewbit.com/problems/list-cycle/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    03/04/2021
*/

import java.util.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode slow = head, fast=head;


        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
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
