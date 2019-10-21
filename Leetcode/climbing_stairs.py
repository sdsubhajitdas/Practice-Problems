# https://leetcode.com/problems/climbing-stairs/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    22/10/2019
'''


class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n==0 or n==1): return n
        
        cache = [-1]*(n+1)
        cache[0], cache[1], cache[2] = 0, 1, 2
        
        return self.climbStairsHelper(n, cache)
    
    def climbStairsHelper(self, step, cache):
        if(step<=0): return 0
        
        if(cache[step] != -1): return cache[step]
        
        cache[step] = self.climbStairsHelper(step-1, cache) + self.climbStairsHelper(step-2, cache)
        return cache[step]
