// https://www.interviewbit.com/problems/remove-nth-node-from-list-end/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    17/01/2021
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
    public ListNode removeNthFromEnd(ListNode head, int b) {
        if(head==null || b==0) return head;
        int idx = 1;
        int len = this.lengthOfList(head);

        if(b >= len) return head.next;

        ListNode pointer=head;
        while(idx != (len-b)){
            pointer = pointer.next;
            idx++;
        }

        pointer.next = pointer.next.next;

        return head;
    }

    private int lengthOfList(ListNode root){
        int length = 0;
        while(root!=null){
            root = root.next;
            length++;
        }
        return length;
    }
}
