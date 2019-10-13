# https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
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
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        self.table = dict()

        for i, val in enumerate(inorder):
            self.table[val] = i

        return self.buildTreeHelper(preorder, inorder, 0, len(inorder)-1, 0)

    def buildTreeHelper(self, preorder, inorder, instart, inend, prestart):

        if(prestart > len(preorder) or instart > inend):
            return None

        root = TreeNode(preorder[prestart])

        inmiddle = self.table[root.val]

        root.left = self.buildTreeHelper(
            preorder, inorder, instart, inmiddle-1, prestart+1)
        root.right = self.buildTreeHelper(
            preorder, inorder, inmiddle+1, inend,  prestart+(inmiddle-instart)+1)

        return root
