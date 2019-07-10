# https://leetcode.com/problems/maximum-subarray/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/07/2019
'''


import sys


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        dp0, dp1 = 0, None
        m = -(sys.maxsize)+1

        for i in range(n):
            dp1 = max(dp0 + nums[i], nums[i])
            if(m < dp1):
                m = dp1
            dp0 = dp1
        return m
