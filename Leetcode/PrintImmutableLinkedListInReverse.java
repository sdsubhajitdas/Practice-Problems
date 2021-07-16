// https://leetcode.com/problems/print-immutable-linked-list-in-reverse/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    16/07/2021
*/

import java.util.*;

/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        if(head == null) return;
        
        this.printLinkedListInReverse(head.getNext());
        head.printValue();
    }
}