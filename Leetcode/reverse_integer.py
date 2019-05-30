# https://leetcode.com/problems/reverse-integer/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''


class Solution:
    def reverse(self, x: int) -> int:
        maxint = 2 ** 31
        minint = -maxint - 1
        sign = ""
        if x < 0:
            sign = "-"
            x = abs(x)
        x_str = str(x)
        x_str = int((sign+x_str[::-1]))
        x = int(x_str)
        if minint >= x or maxint <= x:
            return 0
        return x
