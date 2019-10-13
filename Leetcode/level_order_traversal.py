# https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        if (root == None):
            return []
        order = list()
        queue = [(root, 0)]

        while(len(queue) > 0):
            node, level = queue.pop(0)

            if(len(order) <= level):
                order.append(list())

            order[level].append(node.val)

            if(node.left != None):
                queue.append((node.left, level+1))

            if(node.right != None):
                queue.append((node.right, level+1))

        return order
