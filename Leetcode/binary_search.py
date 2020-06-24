# https://leetcode.com/problems/binary-search/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    25/06/2020
'''
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums)-1

        while(low <= high):
            mid = (low+high)//2
            if(nums[mid]>target):
                high = mid-1
            elif(nums[mid]<target):
                low = mid+1
            else:
                return mid
        return -1 
