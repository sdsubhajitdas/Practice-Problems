# https://leetcode.com/problems/happy-number/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    04/04/2020
'''

class Solution:
    def isHappy(self, n: int) -> bool:
        seen = dict()
        seen[n] = True
        if (int(str(n)[::-1])) != 1:
            seen[int(str(n)[::-1])] = True
        while n!=1:
            n = sum([int(i)**2 for i in str(n)])
            if seen.get(n,False):
                return False
            seen[n] = True
            if (int(str(n)[::-1])) != 1:
                seen[int(str(n)[::-1])] = True
        return True