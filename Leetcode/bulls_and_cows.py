# https://leetcode.com/problems/bulls-and-cows/
'''
    Author @Subhajit Das
    SWE Intern @Turbot HQ India PVT Ltd.
    11/09/2020
'''

class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        bulls = cows = 0
        table = dict()

        for i in range(len(secret)):
            if(secret[i] == guess[i]):
                bulls += 1
            if(table.get(secret[i],-1) == -1):
                table[secret[i]] = 1
            else:
                table[secret[i]] += 1
        
        for char in guess:
            if(table.get(char,0) != 0):
                table[char] -= 1
                cows += 1
        
        return f'{bulls}A{cows-bulls}B'
