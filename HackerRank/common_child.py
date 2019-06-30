# https://www.hackerrank.com/challenges/common-child/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=strings
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    27/06/2019
    Partial
'''


def main():
    s1 = input()
    s2 = input()

    dp = [[None]*(5001) for _ in range(5001)]

    m = len(s1)
    n = len(s2)

    for i in range(m+1):
        for j in range(n+1):
            if(i == 0 or j == 0):
                dp[i][j] = 0
            elif(s1[i-1] == s2[j-1]):
                dp[i][j] = 1 + dp[i-1][j-1]
            else:
                dp[i][j] = max(dp[i-1][j], dp[i][j-1])

    print(dp[m][n])


if __name__ == "__main__":
    main()
