# https://leetcode.com/problems/add-two-numbers/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        digit1 = l1
        digit2 = l2
        carry = 0
        result = None
        start = None

        while digit1 != None and digit2 != None:
            digit3 = digit1.val + digit2.val + carry
            (digit3, carry) = (digit3, 0) if digit3 < 10 else (digit3 % 10, 1)
            node = ListNode(digit3)
            if result == None:
                result = node
                start = result
            else:
                result.next = node
                result = result.next
            digit1 = digit1.next
            digit2 = digit2.next

        if digit1 == None:
            while digit2 != None:
                digit3 = carry + digit2.val
                (digit3, carry) = (digit3, 0) if digit3 < 10 else (digit3 % 10, 1)
                node = ListNode(digit3)
                result.next = node
                result = result.next
                digit2 = digit2.next

        if digit2 == None:
            while digit1 != None:
                digit3 = carry + digit1.val
                (digit3, carry) = (digit3, 0) if digit3 < 10 else (digit3 % 10, 1)
                node = ListNode(digit3)
                result.next = node
                result = result.next
                digit1 = digit1.next

        if carry == 1:
            node = ListNode(carry)
            result.next = node

        return start
