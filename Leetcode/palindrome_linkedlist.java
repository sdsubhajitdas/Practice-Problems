// https://leetcode.com/problems/palindrome-linked-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/11/2020
*/

// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // System.out.println("slow:"+slow.val+",  fast:"+fast.val);
        }

        ListNode endHead = this.reverseLinkedList(slow.next);
        slow.next = null;

        while(endHead != null && head != null){
            if(head.val != endHead.val){
                return false;
            }
            head = head.next;
            endHead = endHead.next;
        }
        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null, nextNode ;

        while(head != null){
            nextNode = head.next;
            head.next = previous;
            previous = head;
            head =nextNode;
        }
        return previous;
    }
}


