# https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
'''
    Author - Subhajit Das
    SWE Intern @ Turbot HQ India PVT Ltd.
    University of Engineering and Management, Kolkata
    08/01/2019
'''

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if (len(prices) == 0): return 0
        minBuyPrice = prices[0]
        maxProfit = 0

        for currentPrice in prices[1:]:
            if(currentPrice < minBuyPrice):
                minBuyPrice = currentPrice
            elif(currentPrice - minBuyPrice > maxProfit):
                maxProfit = currentPrice - minBuyPrice
        return maxProfit