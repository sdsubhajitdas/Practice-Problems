# https://leetcode.com/problems/merge-two-binary-trees/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/01/2020
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        if(t1 == None and t2 == None):
            return None
        if(t1 == None):
            node = TreeNode(t2.val)
            node.left = self.mergeTrees(None, t2.left)
            node.right = self.mergeTrees(None, t2.right)
            return node
        elif(t2 == None):
            node = TreeNode(t1.val)
            node.left = self.mergeTrees(t1.left, None)
            node.right = self.mergeTrees(t1.right, None)
            return node
        else:
            node = TreeNode(t1.val+t2.val)
            node.left = self.mergeTrees(t1.left, t2.left)
            node.right = self.mergeTrees(t1.right, t2.right)
            return node
