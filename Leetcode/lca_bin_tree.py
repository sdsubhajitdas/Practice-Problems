# https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution(object):
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if(root == None):
            return None

        if(root.val == p.val or root.val == q.val):
            return root

        leftTree = self.lowestCommonAncestor(root.left, p, q)
        rightTree = self.lowestCommonAncestor(root.right, p, q)

        if(leftTree == None):
            return rightTree
        if(rightTree == None):
            return leftTree
        return root
