# https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    5/03/2020
'''

class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return []
        
        result = list()
        for i in nums:
            i = abs(i)
            nums[i-1] = -1*abs(nums[i-1])
        
        for idx,num in enumerate(nums):
            if num > 0:
                result.append(idx+1)
        return result