# https://leetcode.com/problems/minimum-distance-between-bst-nodes/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/06/2019
'''

"""  """
# Definition for a binary tree node.
""" class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None """


class Solution:
    def minDiffInBST(self, root: TreeNode) -> int:
        self.ans = 10**5
        self.dfs(root)
        return self.ans

    def dfs(self, root: TreeNode):
        if not root:
            return

        if root.left:
            val = self.right_val(root.left)
            self.ans = min(self.ans, root.val - val)

        if root.right:
            val = self.left_val(root.right)
            self.ans = min(self.ans, val - root.val)

        self.dfs(root.left)
        self.dfs(root.right)

    def left_val(self, root: TreeNode):
        val = 0
        while root:
            val = root.val
            root = root.left
        return val

    def right_val(self, root: TreeNode):
        val = 0
        while root:
            val = root.val
            root = root.right
        return val
