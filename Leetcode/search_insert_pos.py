# https://leetcode.com/problems/search-insert-position/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    02/09/2019
'''


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if(len(nums) == 0 or nums == None):
            return 0

        low, high = 0, len(nums)-1

        while(low <= high):
            mid = (low+high)//2
            if(nums[mid] > target):
                high = mid-1
            elif(nums[mid] < target):
                low = mid+1
            else:
                return mid
        
        while(high >=0 and nums[high]>target):
            high-=1
        return high+1
