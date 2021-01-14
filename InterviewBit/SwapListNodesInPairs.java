// https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    15/01/2021
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode node) {
        if(node == null || node.next == null) return node;

        ListNode first=node, second=node.next;

        ListNode nextLink = this.swapPairs(second.next);
        first.next = nextLink;
        second.next = first;
        return second;
    }
}
