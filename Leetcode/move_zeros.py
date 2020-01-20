# https://leetcode.com/problems/move-zeroes/solution/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    21/01/2020
'''


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lastZeroFoundAt = 0

        for i in range(len(nums)):
            if (nums[i] != 0):
                nums[lastZeroFoundAt] = nums[i]
                lastZeroFoundAt += 1

        for i in range(lastZeroFoundAt,len(nums)):
            nums[i] = 0
        