# https://leetcode.com/problems/climbing-stairs/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/07/2019
'''


class Solution:
    def climbStairs(self, n: int) -> int:
        if(n == 0):
            return 1

        if(n == 1 or n == 2):
            return n

        result = dict()
        result[1] = 1
        result[2] = 2

        for way in range(3, n+1):
            result[way] = result[way-1] + result[way-2]

        return result[n]
