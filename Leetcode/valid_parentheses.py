# https://leetcode.com/problems/valid-parentheses/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/09/2019
'''


class Solution:
    def isValid(self, string: str) -> bool:
        if(string == ""):
            return True

        stack = list()
        opposite = {"(": ")", "{": "}", "[": "]"}

        for ch in string:
            if(ch == "(" or ch == "{" or ch == "["):
                stack.append(opposite[ch])
            elif(len(stack)!=0 and stack[-1] == ch):
                stack.pop()
            else:
                return False

        return True if(len(stack) == 0) else False

