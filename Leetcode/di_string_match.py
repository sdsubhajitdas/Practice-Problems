# https://leetcode.com/problems/di-string-match/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    05/08/2020
'''


class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        i, d = 0, len(s)
        arr = [0]*(d+1)

        for idx in range(len(s)):
            if(s[idx] == 'I'):
                arr[idx] = i
                i += 1
            else:
                arr[idx] = d
                d -= 1
        
        arr[-1] = i if(s[-1]=='I') else d
        return arr
