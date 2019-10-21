# https://leetcode.com/problems/fibonacci-number/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/10/2019
'''


class Solution(object):
    def fib(self, N):
        """
        :type N: int
        :rtype: int
        """
        if(N == 0 or N == 1):
            return N

        cache = [0]*(N+1)
        cache[0], cache[1] = 0, 1

        return self.fibHelper(N, cache)

    def fibHelper(self, n, cache):

        if(n <= 0):
            return 0

        if(cache[n] != 0):
            return cache[n]

        cache[n] = self.fibHelper(n-1, cache) + self.fibHelper(n-2, cache)
        return cache[n]
