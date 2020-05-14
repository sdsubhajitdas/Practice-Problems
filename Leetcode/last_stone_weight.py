# https://leetcode.com/problems/last-stone-weight/
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE Intern @Turbot HQ India PVT Ltd.
    14/05/2020
'''

class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while(len(stones)>1):
            stones.sort()
            stone1 = stones.pop()
            stone2 = stones.pop()
            if(abs(stone1 - stone2) != 0):
                stones.append(abs(stone1-stone2))
        
        return 0 if(len(stones) == 0) else stones[0]