// https://www.interviewbit.com/problems/merge-k-sorted-lists/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    22/04/2021
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
    public ListNode mergeKLists(ArrayList<ListNode> heads) {
        if(heads.size() == 0) return null;
        if(heads.size() == 1) return heads.get(0);

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new ListNodeComparator());
        ListNode returnHead = new ListNode(-1);
        ListNode traverseNode = returnHead;

        for(ListNode head: heads) minHeap.add(head);

        while(!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            traverseNode.next = node;
            traverseNode = traverseNode.next;
            if(node.next != null) {
                minHeap.add(node.next);
                node.next = null;
            }
        }

        return returnHead.next;
    }

    private class ListNodeComparator implements Comparator<ListNode> {
        public int compare(ListNode first, ListNode second) {
            return first.val - second.val;
        }
    }
}
