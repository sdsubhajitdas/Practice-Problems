# https://leetcode.com/problems/longest-univalue-path/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/06/2019
'''


class Solution:
    
    def longestUnivaluePath(self, root: TreeNode) -> int:
        self.max_count = 0
        self.longestPath(root)
        return self.max_count
    
    def longestPath(self, root: TreeNode) -> int:
        if root == None:
            return 0
        
        maxLeft = self.longestPath(root.left)
        maxRight = self.longestPath(root.right)
        maxLeftSoFar, maxRightSoFar = 0, 0
        
        if (root.left != None and root.left.val == root.val):
            maxLeftSoFar = maxLeft + 1
        if (root.right != None and root.right.val == root.val):
            maxRightSoFar = maxRight + 1
        
        self.max_count = max(self.max_count,maxLeftSoFar+maxRightSoFar)
        
        return max(maxLeftSoFar, maxRightSoFar)
