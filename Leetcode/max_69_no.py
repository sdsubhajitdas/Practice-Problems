# https://leetcode.com/problems/maximum-69-number/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/08/2020
'''


class Solution:
    def maximum69Number(self, num: int) -> int:
        num = list(str(num))

        for idx, digit in enumerate(num):
            if(digit=='6'):
                num[idx] = '9'
                return "".join(num)
        return "".join(num)