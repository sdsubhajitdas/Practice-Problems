# https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return self.maxDepthUtil(root, 1)

    def maxDepthUtil(self, root, level):
        if(root == None):
            return level - 1

        return max(self.maxDepthUtil(root.left, level + 1),
                   self.maxDepthUtil(root.right, level + 1))
