# https://leetcode.com/problems/reverse-linked-list/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/10/2019
'''


# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head == None or head.next == None):
            return head

        returnRoot = self.reverseList(head.next)

        head.next.next = head
        head.next = None
        return returnRoot
