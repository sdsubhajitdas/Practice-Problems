# https://leetcode.com/problems/self-dividing-numbers/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/09/2019
'''


class Solution(object):
    def checkNumber(self, num):
        if('0' in str(num)):
            return False

        numl = set(list(str(num)))

        if(len(numl) == 1):
            return True

        for digit in numl:
            digit = int(digit)
            if(num % digit != 0):
                return False

        return True

    def selfDividingNumbers(self, left, right):
        result = list()
        for num in range(left, right+1):
            if(self.checkNumber(num)):
                result.append(num)
        
        return result
