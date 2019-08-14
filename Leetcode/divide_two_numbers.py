# https://leetcode.com/problems/divide-two-integers/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    14/08/2019
'''


class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        sign = -1 if((dividend < 0) ^ (divisor < 0)) else 1

        dividend = abs(dividend)
        divisor = abs(divisor)

        temp, quotient = 0, 0

        for i in range(31, -1, -1):
            if(temp+(divisor << i) <= dividend):
                temp += divisor << i
                quotient |= 1 << i

        quotient = sign * quotient
        if(quotient >= 2**31 or quotient < -2**31):
            quotient = 2**31-1

        return quotient


if __name__ == "__main__":

    print(Solution().divide(-2147483648, -1))
    print(Solution().divide(10, -7))
