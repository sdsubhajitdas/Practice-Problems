# https://leetcode.com/problems/contains-duplicate/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        table = dict()

        for num in nums:
            if(table.get(num,0)==0):
                table[num] = 1
            else:
                return True
        return False