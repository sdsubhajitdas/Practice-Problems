// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    02/04/2021
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode pointer = head;

        while(pointer != null) {
            ListNode after = pointer.next;

            while(after != null && after.val == pointer.val) {
                after = after.next;
            }
            pointer.next = after;
            pointer = pointer.next;
        }

        return head;
    }
}
