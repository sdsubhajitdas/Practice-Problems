// https://www.interviewbit.com/problems/palindrome-list/
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
    public int lPalin(ListNode head) {
        if(head == null || head.next == null) return 1;
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode endHead = this.reverseLinkedList(slow.next);
        slow.next = null;

        while(endHead != null && head != null) {
            if(endHead.val != head.val) return 0;

            endHead = endHead.next;
            head = head.next;
        }
        return 1;
    }

    private ListNode reverseLinkedList(ListNode node) {
        ListNode before = null, after;

        while(node != null) {
            after = node.next;
            node.next = before;
            before = node;
            node = after;
        }
        return before;
    }
}
