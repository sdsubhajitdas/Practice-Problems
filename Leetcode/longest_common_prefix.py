# https://leetcode.com/problems/longest-common-prefix/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/09/2019
'''


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = ""
        if(len(strs) == 0):
            return prefix
        elif(len(strs) == 1):
            return strs[0]

        prev = ""
        idx = 0
        while(True):
            for word in strs:
                if(len(word)-1 >= idx):
                    if(prev == ""):
                        prev = word[idx]
                    elif(prev != word[idx]):
                        return prefix
                else:
                    return prefix
            prefix += strs[0][idx]
            prev = ""
            idx += 1
