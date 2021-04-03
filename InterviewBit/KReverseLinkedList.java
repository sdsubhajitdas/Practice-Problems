// https://www.interviewbit.com/problems/k-reverse-linked-list/
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
    public ListNode reverseList(ListNode current, int k) {
        if(current == null || k==1) return current;

        ListNode previous=null, after;
        ListNode endNode = current, nextLink, nextCurrent=current;

        for(int i=0; i<k && nextCurrent != null; i++) nextCurrent = nextCurrent.next;

        nextLink = this.reverseList(nextCurrent, k);

        while(current != null && k!=0) {
            k--;
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }

        endNode.next = nextLink;
        return previous;
    }
}
