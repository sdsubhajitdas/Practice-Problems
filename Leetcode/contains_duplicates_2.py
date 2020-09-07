# https://leetcode.com/problems/contains-duplicate/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''


class Solution:
    def containsNearbyDuplicate(self, nums: list, k: int) -> bool:
        if(len(nums) == 0): return False

        nums = sorted([(num, idx) for idx, num in enumerate(nums)])

        i = 1
        lastNum, lastIdx = nums[0]
        while(i < len(nums)):
            num, idx = nums[i]
            i += 1
            if((lastNum == num) and (abs(idx-lastIdx) <= k)):
                return True
            lastNum, lastIdx = num, idx

        return False

