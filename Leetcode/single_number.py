# https://leetcode.com/problems/single-number/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    11/01/2020
'''

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        number = nums[0]
        
        for i in range(1,len(nums)):
            number = number ^ nums[i]
        
        return number
