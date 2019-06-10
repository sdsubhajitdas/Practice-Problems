# https://leetcode.com/problems/range-sum-of-bst/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/06/2019
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def rangeSumBST(self, root: TreeNode, L: int, R: int) -> int:
        return self.BSTSum(root, L, R)
    
    def BSTSum(self, root: TreeNode, L: int, R: int) -> int:
        if (root == None):
            return 0
        s = root.val if (root.val >= L and root.val <= R) else 0 
        return s + self.BSTSum(root.left,L,R) + self.BSTSum(root.right,L,R)