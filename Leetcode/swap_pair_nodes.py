# Problem Link
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head == None):
            return None
        if(head.next == None):
            return head

        return self.swapPairsHelper(head)

    def swapPairsHelper(self, node):
        if(node == None):
            return None

        afterNode = node.next
        if(afterNode == None):
            return node

        nextCallNode = afterNode.next

        afterNode.next = node
        node.next = self.swapPairsHelper(nextCallNode)

        return afterNode
