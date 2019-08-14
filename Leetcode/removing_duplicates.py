# https://leetcode.com/problems/remove-duplicates-from-sorted-array/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    14/08/2019
'''


class Solution:
    def removeDuplicates(self, nums: list) -> int:
        if(len(nums) == 0): return 0

        i = 0
        for j in range(1,len(nums)):
            if(nums[i]!=nums[j]):
                i+=1
                nums[i] = nums[j]
        
        return i+1


if __name__ == '__main__':
    print(Solution().removeDuplicates([1, 1]))
