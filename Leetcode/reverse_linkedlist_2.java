// https://leetcode.com/problems/reverse-linked-list-ii/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/11/2020
*/

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
    public ListNode reverseBetween(ListNode head, int start, int end) {
        if(start == end) return head;

        ListNode copyHead = head, previousNode = null;
        int idx = 1;

        while(idx != start){
            previousNode = copyHead;
            copyHead = copyHead.next;
            idx++;
        }

        ListNode reverseHead = reverse(copyHead, end-start);
        
        // Condition for starting index 1 
        if(previousNode != null)
            previousNode.next = reverseHead;
        else
            head = reverseHead;

        return head;
    }

    private ListNode reverse(ListNode node, int steps){
        ListNode previous = null, after = node.next;
        ListNode startingNodeCopy = node;

        while(steps >= 0){
            node.next = previous;
            previous = node;
            node = after;
            after = node!=null ? node.next: null; // Prevents null pointer exception at last node.
            steps--;
        }
        startingNodeCopy.next = node;
        return previous;
    }
}