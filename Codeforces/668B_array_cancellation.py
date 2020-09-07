# https://codeforces.com/contest/1405/problem/B
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''
import math

def main():
    n = int(input().strip())
    arr = list(map(int,input().strip().split()))
    cost = suffixSum = arr[-1]

    for i in reversed(range(n-1)):
        suffixSum += arr[i] 
        cost = max(cost,suffixSum)
        
    print(cost)



if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
    