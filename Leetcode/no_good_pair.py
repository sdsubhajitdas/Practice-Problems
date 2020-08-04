# https://leetcode.com/problems/number-of-good-pairs/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/08/2020
'''

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = 0

        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if(nums[i] == nums[j]):
                    count+=1
        return count