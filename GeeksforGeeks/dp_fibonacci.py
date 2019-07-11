# https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers/0/?track=sp-dynamic-programming&batchId=152
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    11/07/2019
'''


def fibonacci(dp: list, n: int):
    if(dp[n] != None):
        return dp[n]

    dp[n] = fibonacci(dp, n-1)+fibonacci(dp, n-2)
    return dp[n]


def main():
    for _ in range(int(input())):
        n = int(input())
        dp = [None]*n
        dp[0] = 1
        if(n>=2):
            dp[1] = 1
        fibonacci(dp, n-1)
        print(*dp)


if __name__ == "__main__":
    main()
