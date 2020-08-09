# https://www.codechef.com/LRNDSA01/problems/ZCO14003
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    09/08/2020
'''
import math


def main():
    n = int(input())
    arr = sorted([int(input()) for _ in range(n)])
    maxProfit = -1 * math.inf

    for idx, price in enumerate(arr):
        maxProfit = max(maxProfit, price*(n-idx))
    
    print(maxProfit)


if __name__ == "__main__":
    main()
