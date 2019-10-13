# https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
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
        root.next = None
        p = root
        while(p != None):
            q = p
            while(q != None):
                if(q.left != None):
                    q.left.next = q.right if(
                        q.right != None) else self.getRightNode(q)

                if(q.right != None):
                    q.right.next = self.getRightNode(q)
                q = q.next

            if(p.left):
                p = p.left
            elif(p.right):
                p = p.right
            else:
                p = self.getRightNode(p)

        return root

    def getRightNode(self, node):
        temp = node.next

        while(temp != None):
            if(temp.left != None):
                return temp.left
            if(temp.right != None):
                return temp.right
            temp = temp.next

        return None
