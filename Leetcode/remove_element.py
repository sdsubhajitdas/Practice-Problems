# https://leetcode.com/problems/remove-element/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/09/2019
'''


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        if(nums == None or len(nums) == 0):
            return 0
        i = 0 
        for j in range(len(nums)):
            if(nums[j]!= val):
                nums[i] = nums[j]
                i+=1
    
        return i