# https://leetcode.com/problems/majority-element/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    31/05/2020
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        table = dict()

        for word in strs:
            countCode = self.getCountCode(word)
            if (table.get(countCode, None) != None):
                table[countCode].append(word)
            else:
                table[countCode] = [word]
        
        return  list(table.values())

    
    def getCountCode(self, word):
        chars = [0]*26
        for ch in word:
            chars[ord(ch)-ord('a')] += 1
        return "#".join([str(x) for x in chars])