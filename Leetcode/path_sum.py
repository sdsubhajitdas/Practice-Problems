# https://leetcode.com/problems/path-sum/
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
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if(root == None):
            return False

        if (self.isLeaf(root) and sum == root.val):
            return True

        return self.hasPathSum(root.left, sum - root.val) or self.hasPathSum(root.right, sum - root.val)

    def isLeaf(self, root):
        return (root.left == None) and (root.right == None)
