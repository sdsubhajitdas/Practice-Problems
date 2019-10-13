# https://leetcode.com/problems/evaluate-reverse-polish-notation/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    13/10/2019
'''


class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = list()

        for val in tokens:
            if(val in ['+', '-', '*', '/']):
                a = stack.pop()
                b = stack.pop()
                if(val == '+'):
                    stack.append(a+b)
                elif(val == '-'):
                    stack.append(b-a)
                elif(val == '*'):
                    stack.append(a*b)
                else:
                    stack.append(int(b/a))
            else:
                stack.append(int(val))

        return stack[0]
