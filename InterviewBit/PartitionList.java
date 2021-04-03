// https://www.interviewbit.com/problems/partition-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    DD/MM/2021
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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode smallerHead = new ListNode(0);
        ListNode largerHead = new ListNode(0);

        ListNode smPointer = smallerHead, lgPointer = largerHead;

        while(head != null) {
            if(head.val < x) {
                smPointer.next = head;
                smPointer = smPointer.next;
            }
            else{
                lgPointer.next = head;
                lgPointer = lgPointer.next;
            }
            head = head.next;
        }
        lgPointer.next = null;
        smPointer.next = largerHead.next;

        return smallerHead.next;
    }
}
