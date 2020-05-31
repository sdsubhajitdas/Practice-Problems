# https://leetcode.com/problems/product-of-array-except-self/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    01/06/2020
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        suffix = [1]*n
        prefix = 1

        for idx in range(1,n):
            suffix[idx] = nums[idx-1]*suffix[idx-1]
        
        for idx in reversed(range(n)):
            suffix[idx] *=  prefix
            prefix *= nums[idx] 
        return suffix