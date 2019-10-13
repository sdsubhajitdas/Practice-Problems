# https://leetcode.com/problems/binary-tree-postorder-traversal/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


class Solution:
    def postorderTraversal(self, root: TreeNode) -> List[int]:
        result = list()
        self.postorderTraversalRecursive(root, result)
        return result

    def postorderTraversalRecursive(self, root: TreeNode, result: list) -> None:
        if(root == None):
            return

        if(root.left != None):
            self.postorderTraversalRecursive(root.left, result)

        if(root.right != None):
            self.postorderTraversalRecursive(root.right, result)

        result.append(root.val)
