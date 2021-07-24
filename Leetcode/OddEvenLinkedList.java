// https://leetcode.com/problems/odd-even-linked-list/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    25/07/2021
*/

import java.util.*;

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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode evenHead, oddPointer, evenPointer;

        evenHead = head.next;
        oddPointer = head;
        evenPointer = evenHead;

        while(evenPointer != null && evenPointer.next !=null) {
            oddPointer.next = evenPointer.next;
            oddPointer = oddPointer.next;

            evenPointer.next = oddPointer.next;
            evenPointer = evenPointer.next;

            // ListNode nextOdd = oddPointer.next;
            // nextOdd = (nextOdd != null) ? nextOdd.next:null;
            
            // ListNode nextEven = evenPointer.next;
            // nextEven = (nextEven != null) ? nextEven.next:null;

            // oddPointer.next = nextOdd;
            // evenPointer.next = nextEven;

            // oddPointer = oddPointer.next;
            // evenPointer = evenPointer.next;
        }

        oddPointer.next = evenHead;
        
        return head;
    }
}