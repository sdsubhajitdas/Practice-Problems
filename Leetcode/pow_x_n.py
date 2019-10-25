# https://leetcode.com/problems/powx-n/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    26/10/2019
'''


class Solution(object):
    def myPow(self, x, n):
        """
        :type x: float
        :type n: int
        :rtype: float
        """
        ans = self.powHelper(x, abs(n))

        return 1/ans if(n < 0) else ans

    def powHelper(self, x, n):
        if(n == 0):
            return 1
        if(n == 1):
            return x

        y = self.powHelper(x, n//2)

        return y*y if(n & 1 == 0) else x*y*y
