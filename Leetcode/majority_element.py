# https://leetcode.com/problems/majority-element/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    21/01/2020
'''


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        candidateKey = None

        for num in nums:
            if (count == 0):
                candidateKey = num

            count += 1 if num == candidateKey else -1
        return candidateKey