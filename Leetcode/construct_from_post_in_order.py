# https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
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
    def buildTree(self, inorder, postorder):
        """
        :type inorder: List[int]
        :type postorder: List[int]
        :rtype: TreeNode
        """
        self.table = dict()

        for i, val in enumerate(inorder):
            self.table[val] = i

        return self.buildTreeHelper(inorder, postorder, 0, len(inorder)-1, len(postorder)-1)

    def buildTreeHelper(self, inorder, postorder, instart, inend, postend):
        if(postend < 0 or instart > inend):
            return None

        node = TreeNode(postorder[postend])

        inmiddle = self.table[node.val]

        node.left = self.buildTreeHelper(
            inorder, postorder, instart, inmiddle-1, postend - (inend-inmiddle)-1)
        node.right = self.buildTreeHelper(
            inorder, postorder, inmiddle+1, inend, postend - 1)

        return node
