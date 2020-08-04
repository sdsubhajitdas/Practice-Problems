# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/08/2020
'''


class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        _sum, product = 0, 1

        while(n != 0):
            r = n % 10
            _sum += r
            product *= r
            n = n // 10

        return product - _sum
