# https://leetcode.com/problems/backspace-string-compare/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    10/04/2020
'''

class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        s_stack, t_stack = list(), list()

        for char in S:
            if(char == '#'):
                if len(s_stack) != 0:
                    s_stack.pop()
            else:
                s_stack.append(char)

        for char in T:
            if(char == '#'):
                if len(t_stack) != 0:
                    t_stack.pop()
            else:
                t_stack.append(char)
        
        return True if "".join(s_stack) == "".join(t_stack) else False
