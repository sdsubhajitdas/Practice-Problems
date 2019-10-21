# https://leetcode.com/problems/reverse-string/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    21/10/2019
'''

class Solution(object):
    '''Recursive Way of reversing string'''
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        self.reverseStringHelper(s, 0)
    
    def reverseStringHelper(self,string, left):
        
        right = len(string) - 1 - left
        if(left>=right): return
        
        string[left], string[right] = string[right], string[left]
        self.reverseStringHelper(string, left+1)