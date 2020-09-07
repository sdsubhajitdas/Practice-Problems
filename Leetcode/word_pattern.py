# https://leetcode.com/problems/word-pattern/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''

class Solution:
    def wordPattern(self, pattern: str, words: str) -> bool:
        words = words.strip().split()
        if(len(pattern) != len(words)): return False
        
        charTable = dict()
        wordTable = dict()

        for char, word in zip(pattern,words):
            charInTable = charTable.get(word,"")
            wordInTable = wordTable.get(char,"")
            if( charInTable == "" and wordInTable == ""):
                charTable[word] = char
                wordTable[char] = word
                continue
            if(charInTable != char or wordInTable != word):
                return False
        return True