# https://leetcode.com/problems/min-cost-climbing-stairs/
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    09/07/2019
'''


class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        for i in range(2, len(cost)):
            cost[i] += min(cost[i-1], cost[i-2])

        return min(cost[-1], cost[-2])
