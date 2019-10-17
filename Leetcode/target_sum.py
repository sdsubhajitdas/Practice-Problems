# https://leetcode.com/problems/target-sum/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/10/2019
'''
from sys import maxsize

class Solution(object):
    def findTargetSumWays(self, nums, S):
        """
        :type nums: List[int]
        :type S: int
        :rtype: int
        """
        self.count = 0
        self.targetSum = S
        self.mem = [[maxsize]*2001 for _ in nums]

        return self.findTargetHelper(nums, 0, 0)

    def findTargetHelper(self, nums, idx, sumTillNow):
        if(idx == len(nums)):
            return  1 if(sumTillNow == self.targetSum) else 0
        
        if(self.mem[idx][sumTillNow+1000] != maxsize):
            return self.mem[idx][sumTillNow+1000]
        
        self.mem[idx][sumTillNow+1000] = self.findTargetHelper(nums, idx+1, sumTillNow + nums[idx]) + self.findTargetHelper(nums, idx+1, sumTillNow - nums[idx])
        
        return self.mem[idx][sumTillNow+1000]