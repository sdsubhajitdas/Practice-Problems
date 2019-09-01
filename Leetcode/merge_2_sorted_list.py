# https://leetcode.com/problems/merge-two-sorted-lists/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/09/2019
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if(l1 == None):
            return l2
        if(l2 == None):
            return l1
        head = run = None
        while(l1 != None and l2 != None):
            if(l1.val <= l2.val):
                if(head == None):
                    head = l1
                    run = head
                else:
                    run.next = l1
                    run = run.next
                l1 = l1.next
            else:
                if(head == None):
                    head = l2
                    run = head
                else:
                    run.next = l2
                    run = run.next
                l2 = l2.next

        if(l1 == None):
            run.next = l2
        if(l2 == None):
            run.next = l1

        return head
