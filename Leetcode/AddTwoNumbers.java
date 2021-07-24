// https://leetcode.com/problems/add-two-numbers/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return this.addTwoNumbersHelper(l1, l2, 0);
    }

    private ListNode addTwoNumbersHelper(ListNode firstDigit, ListNode secondDigit, int carryOver) {

        if(firstDigit == null && secondDigit == null) {
            return carryOver > 0 ? new ListNode(carryOver) : null;
        }


        int firstDigitValue = firstDigit != null ? firstDigit.val : 0;
        int secondDigitValue = secondDigit != null ? secondDigit.val : 0;

        ListNode resultDigit = new ListNode(firstDigitValue+secondDigitValue+carryOver);

        resultDigit.next = this.addTwoNumbersHelper(
            firstDigit!=null ? firstDigit.next : null,
            secondDigit!=null ? secondDigit.next : null,
            resultDigit.val/10
        );
        resultDigit.val = resultDigit.val%10;

        return resultDigit;
    }
}