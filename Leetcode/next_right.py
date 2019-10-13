# https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''

"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, left, right, next):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""


class Solution(object):
    def connect(self, root):
        """
        :type root: Node
        :rtype: Node
        """
        if(root == None):
            return root

        self.connectHelper(root.left, root.right)
        self.connectHelper(root.right, None)

        return root

    def connectHelper(self, left, right):
        if(left == None):
            return

        left.next = right

        self.connectHelper(left.left, left.right)
        self.connectHelper(left.right, right.left if(right != None) else None)
