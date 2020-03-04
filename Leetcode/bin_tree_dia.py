# https://leetcode.com/problems/diameter-of-binary-tree/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    04/03/2020
'''


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        if(root == None):
            return 0
        self.ans = 1
        self.heightOfTree(root)
        return self.ans - 1
    
    def heightOfTree(self,node: TreeNode) -> int:
        if not node:
            return 0
        left = self.heightOfTree(node.left)
        right = self.heightOfTree(node.right)
        self.ans = max(self.ans,left+right+1)
        return max(left,right) + 1