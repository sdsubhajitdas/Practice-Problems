# https://leetcode.com/problems/clone-graph/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, neighbors):
        self.val = val
        self.neighbors = neighbors
"""


class Solution(object):
    def cloneGraph(self, root):
        """
        :type root: Node
        :rtype: Node
        """
        croot = Node(root.val, list())
        cloneMap = dict()

        queue = [root]

        # Generating the nodes using BFS
        while(len(queue) > 0):
            node = queue.pop(0)
            if (cloneMap.get(node, None) == None):
                cloneMap[node] = croot if(
                    node == root) else Node(node.val, list())
                queue.extend(node.neighbors)

        # Generating the node edges
        for o_node in cloneMap.keys():
            c_node = cloneMap[o_node]
            for child in o_node.neighbors:
                c_node.neighbors.append(cloneMap[child])

        return croot
