# https://leetcode.com/problems/middle-of-the-linked-list/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/04/2020
'''

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        before, after = head, head

        while(after != None):
            after = after.next
            if after == None:
                return before
            after = after.next
            before = before.next
        return before