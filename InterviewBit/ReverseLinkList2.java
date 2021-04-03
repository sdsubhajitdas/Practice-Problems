// https://www.interviewbit.com/problems/reverse-link-list-ii/
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
    public ListNode reverseBetween(ListNode head, int start, int end) {
        if(head == null ) return head;
        if(head.next == null) return head;

        ListNode node = head,before=null;

        for(int i=1; i<start; i++) {
            before = node;
            node = node.next;
        }

        ListNode previous=null, after, reverseEnd = node;

        for(int i=start; i<=end; i++) {
            after = node.next;
            node.next = previous;
            previous = node;
            node = after;
        }

        if(before != null) before.next = previous;
        reverseEnd.next = node;

        return (start != 1)? head: previous;
    }
}
