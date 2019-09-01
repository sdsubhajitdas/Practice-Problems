# https://leetcode.com/problems/roman-to-integer/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/09/2019
'''


class Solution:
    def romanToInt(self, roman: str) -> int:
        value = {'I': 1, 'V': 5, 'X': 10, 'L': 50,
                 'C': 100, 'D': 500, 'M': 1000}

        if(roman == "" or roman == None):
            return 0

        stack = list()
        result = 0

        for digit in roman:
            if(len(stack) == 0):
                stack.append(digit)
                result += value[digit]
            else:
                if(value[digit] <= value[stack[-1]]):
                    result += value[digit]
                else:
                    result -= value[stack[-1]]
                    result += (value[digit]-value[stack[-1]])
                stack.append(digit)
        return result
