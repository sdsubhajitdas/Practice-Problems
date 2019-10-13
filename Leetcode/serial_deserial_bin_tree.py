# https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
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


class Codec:

    def serialize(self, root):
        """Encodes a tree to a single string.

        :type root: TreeNode
        :rtype: str
        """

        if(root == None):
            return 'X'

        leftSerial = self.serialize(root.left)
        rightSerial = self.serialize(root.right)

        return str(root.val) + ',' + leftSerial + ',' + rightSerial

    def deserialize(self, data):
        """Decodes your encoded data to tree.

        :type data: str
        :rtype: TreeNode
        """

        # print(data)

        queue = data.strip().split(',')

        return self.deserializeHelper(queue)

    def deserializeHelper(self, queue):

        val = queue.pop(0)
        if(val == 'X'):
            return None

        root = TreeNode(val)

        root.left = self.deserializeHelper(queue)
        root.right = self.deserializeHelper(queue)

        return root


# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.deserialize(codec.serialize(root))
