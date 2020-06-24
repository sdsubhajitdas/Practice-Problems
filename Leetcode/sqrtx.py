# https://leetcode.com/problems/sqrtx/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    25/06/2020
'''

import math

class Solution:
    def mySqrt(self, x: int) -> int:
        if (x==1 or x==0):
            return x

        low, high = 0, x
        
        while(low <= high):
            root = (high + low)/2
            sqr = math.floor(root**2)
            if(sqr > x):
                high = root
            elif(sqr < x):
                low = root
            else:
                rootFloor = math.floor(root)
                rootCeil = math.ceil(root)
                if(rootCeil**2>x):
                    return rootFloor
                if(rootCeil**2<=x):
                    return rootCeil
