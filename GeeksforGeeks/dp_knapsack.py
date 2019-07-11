# https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem/0/?track=sp-dynamic-programming&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''
from sys import stdin, stdout

def main():
    for _ in range(int(input())):
        n = int(input())
        lw = int(input())
        values = list(map(int, stdin.readline().split()))
        weights = list(map(int, stdin.readline().split()))

        n = len(values)
        dp = [[0]*(lw+1) for _ in range(n)]

        for i in range(n):
            for w in range(lw+1):
                if(w >= weights[i]):
                    taken = dp[i-1][w-weights[i]] + values[i]
                    not_taken = dp[i-1][w]
                    dp[i][w] = max(taken, not_taken)
                else:
                    dp[i][w] = dp[i-1][w]

        stdout.write(str(dp[-1][-1])+'\n')


if __name__ == "__main__":
    main()
