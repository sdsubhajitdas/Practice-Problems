# https://leetcode.com/problems/two-sum/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        table = dict()
        for index, element in enumerate(nums):
            complement = target - element
            if complement in table.keys() and table[complement] != index:
                return [table[complement], index]
            table[element] = index
