# https://leetcode.com/problems/contiguous-array/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    20/05/2020
'''

class Solution:
    def findMaxLength(self, nums: list) -> int:
        count, maxLen = 0, 0
        table = {0:0}
        for idx, num in enumerate(nums,1):
            count += 1 if num else -1
            if(count in table):
                maxLen = max(maxLen, idx - table[count])
            else:
                table[count] = idx
        return maxLen