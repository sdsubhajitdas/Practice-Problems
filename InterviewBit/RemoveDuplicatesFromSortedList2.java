// https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pointer = head, after = head.next;
        ListNode returnHead = new ListNode(0);
        ListNode returnListPointer = returnHead;

        while(after != null) {
            if(pointer.val != after.val) {
                returnListPointer.next = pointer;
                returnListPointer = returnListPointer.next;
            }
            else
                while(after!=null && pointer.val == after.val) 
                    after = after.next;
            pointer = after;
            after = (after != null) ? after.next : null;
        }

        returnListPointer.next = pointer;

        return returnHead.next;
    }
}
