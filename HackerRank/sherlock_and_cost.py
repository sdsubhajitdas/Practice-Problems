# https://www.hackerrank.com/challenges/sherlock-and-cost/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/08/2019
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        if(n == 2):
            print(max(arr)-1)
            continue
        if(n == 1):
            print(0)
            continue
        dp = [[0, 0] for _ in range(n)]

        for i in range(n-1):
            dp[i+1][0] = max(dp[i][0], dp[i][1]+abs(arr[i]-1))
            dp[i+1][1] = max(dp[i][0]+abs(arr[i+1]-1),
                             dp[i][1]+abs(arr[i]-arr[i+1]))

        print(max(dp[-1]))


if __name__ == "__main__":
    main()
