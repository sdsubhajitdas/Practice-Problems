    // https://www.interviewbit.com/problems/merge-two-sorted-lists/
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
        public ListNode mergeTwoLists(ListNode a, ListNode b) {
            if(a==null) return b;
            if(b==null) return a;
            
            ListNode returnHead, pointerNode;

            if(a.val < b.val){
                returnHead = a;
                a = a.next;
            }
            else{
                returnHead = b;
                b = b.next;
            }

            pointerNode = returnHead;

            while(a!=null && b!=null){
                if(a.val < b.val){
                    pointerNode.next = a;
                    a = a.next;
                }
                else{
                    pointerNode.next = b;
                    b = b.next;
                }
                pointerNode = pointerNode.next;
            }

            if(a!=null && b==null){
                pointerNode.next = a;
            }
            if(b!=null && a==null){
                pointerNode.next = b;
            }
            return returnHead;
        }
    }
