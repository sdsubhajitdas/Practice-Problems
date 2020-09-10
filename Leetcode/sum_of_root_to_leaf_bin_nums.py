# https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    11/09/2020
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int:
        return self.sumRootToLeafHelper(root,"")
    

    def sumRootToLeafHelper(self,root: TreeNode, binaryString: str):
        if(root == None):
            return 0
        
        binaryString += str(root.val)

        if(root.left == None and root.right == None):
            return self.binaryToInt(binaryString)

        return self.sumRootToLeafHelper(root.left, binaryString) + self.sumRootToLeafHelper(root.right, binaryString)
    
    def binaryToInt(self, binary):
        num = 0
        for idx, digit in enumerate(binary[::-1]):
            if(digit == '1'):
                num += 2 ** idx
        return num
