# https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        result = list()
        self.inorderTraversalRecursive(root, result)
        return result

    def inorderTraversalIterative(self, root: TreeNode, result: list) -> None:
        if(root == None):
            return
        stack = [root]

        while(len(stack) > 0):
            node = stack[-1]
            if(node.right == None and node.left == None):
                result.append(stack.pop().val)
                continue

            if(node.right != None):
                stack.append(node.right)
            if(node.left != None):
                stack.append(node.left)

    def inorderTraversalRecursive(self, root: TreeNode, result: list) -> None:
        if(root == None):
            return

        if(root.left != None):
            self.inorderTraversalRecursive(root.left, result)

        result.append(root.val)

        if(root.right != None):
            self.inorderTraversalRecursive(root.right, result)
