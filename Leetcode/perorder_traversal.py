# https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        result = list()
        self.preorderTraversalIterative(root, result)
        return result

    def preorderTraversalIterative(self, root: TreeNode, result: list) -> None:
        if(root == None):
            return
        stack = [root]

        while(len(stack) > 0):
            node = stack.pop()

            result.append(node.val)

            if(node.right != None):
                stack.append(node.right)
            if(node.left != None):
                stack.append(node.left)

    def preorderTraversalRecursive(self, root: TreeNode, result: list) -> None:
        if(root == None):
            return

        result.append(root.val)
        self.preorderTraversalRecursive(root.left, result)
        self.preorderTraversalRecursive(root.right, result)
