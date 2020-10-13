// https://leetcode.com/problems/intersection-of-two-linked-lists/
/*
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    14/10/2020
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.*;


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA=0, countB=0,jumps=0;
        ListNode copyHeadA = headA, copyHeadB = headB;
        ListNode longerList, shorterList;

        while(copyHeadA!=null){
            countA ++;
            copyHeadA = copyHeadA.next;
        }
        while(copyHeadB!=null){
            countB ++;
            copyHeadB = copyHeadB.next;
        }
        
        longerList = (countA>countB)? headA: headB;
        shorterList = (countA>countB)? headB: headA;

        jumps = Math.abs(countA-countB);

        while(jumps>0) {
            longerList = longerList.next;
            jumps --;
        }

        while(longerList != null || shorterList != null){
            if(longerList == shorterList){
                return longerList;
            }
            longerList = longerList.next;
            shorterList = shorterList.next;
        }

        return null;
    }
}