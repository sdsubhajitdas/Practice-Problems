# https://leetcode.com/problems/path-sum-ii/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    Jr.SW @Turbot HQ India PVT Ltd.
    09/07/2020
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        pathList = list()
        self.pathSumHelper(root,sum,"",pathList)
        pathList = [ map(int, path.split(",")) for path in pathList]
        return pathList


    def pathSumHelper(self, root: TreeNode, sum: int, path: str,pathList: list):
        if(root == None):
            return
        path = path + str(root.val)

        if (self.isLeaf(root) and root.val == sum):
            pathList.append(path)
        else:
            self.pathSumHelper(root.left, sum-root.val,path+",",pathList)
            self.pathSumHelper(root.right, sum-root.val,path+",",pathList)

    
    def isLeaf(self, root:TreeNode):
        return (root.left==None) and (root.right==None)