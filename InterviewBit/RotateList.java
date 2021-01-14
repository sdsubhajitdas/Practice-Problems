// https://www.interviewbit.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null && k>0) return head;

        int listLength=0, idx=1;
        ListNode node = head,breakNode;
        while(node != null) {
            node = node.next;
            listLength++;
        }
        k = k % listLength;
        if(k == 0) return head;

        node = head;
        while(idx != listLength-k){
            node = node.next;
            idx++;
        }
        breakNode = node.next;
        node.next = null;
        node = breakNode;
        while(node.next != null){
            node = node.next;
        }
        node.next = head;
        return breakNode;
    }
}
