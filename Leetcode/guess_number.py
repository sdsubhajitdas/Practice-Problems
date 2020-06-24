# https://leetcode.com/problems/guess-number-higher-or-lower/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    25/06/2020
'''

# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        low, high = 0, n
        while(low <= high):
            mid = (low+high)//2
            result = guess(mid) 
            if(result==0):
                return mid
            if(result<0):
                high = mid-1
            else:
                low = mid+1
        return -1
