# https://leetcode.com/problems/find-all-anagrams-in-a-string/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    31/05/2020
'''

class Solution:
    def findAnagrams(self, s: str, p: str) -> list:
        pTable = [0]*26
        sTable = [0]*26
        result = list()
        for ch in p:
            pTable[ord(ch)- ord('a')] += 1
        
        for i in range(len(s)):
            if(i<len(p)):
                sTable[ord(s[i])-ord('a')] += 1
            else:
                if (self.compareTables(sTable, pTable)):
                    result.append(i-len(p))
                sTable[ord(s[i-len(p)])-ord('a')] -= 1
                sTable[ord(s[i])-ord('a')] += 1

        if (self.compareTables(sTable, pTable)):
            result.append(len(s)-len(p))
        return result


    def compareTables(self, s:list, p: list):
        for si, pi in zip(s,p):
            if(si != pi):
                return False
        return True
