# https://leetcode.com/problems/palindrome-number/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    30/05/2019
'''

class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)
        return (x == x[::-1])