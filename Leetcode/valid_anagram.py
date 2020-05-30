# https://leetcode.com/problems/valid-anagram/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    31/05/2020
'''

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        table = dict.fromkeys(s,0)

        for ch in s:
            table[ch] += 1

        for ch in t:
            if (table.get(ch,0)==0):
                return False
            else:
                table[ch] -= 1
        for key in table.keys():
            if table[key] != 0:
                return False
        return True 

if __name__ == "__main__":
    print(Solution().isAnagram("anagram", "nagaram"))