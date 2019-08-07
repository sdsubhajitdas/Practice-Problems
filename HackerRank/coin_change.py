# https://www.hackerrank.com/challenges/coin-change/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    07/08/2019
'''


def main():
    n, m = map(int, input().split())
    coins = sorted(list(map(int, input().strip().split())))
    dp = [[None]*(n+1) for _ in range(m+1)]

    for c in range(m+1):
        for v in range(n+1):
            if(v == 0):
                dp[c][v] = 1
            elif(c == 0):
                dp[c][v] = 0
            elif(v-coins[c-1]>=0):
                dp[c][v] = dp[c-1][v] + dp[c][v-coins[c-1]]
            else:
                dp[c][v] = dp[c-1][v]
    
    print(dp[m][n])


if __name__ == "__main__":
    main()
