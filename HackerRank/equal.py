# https://www.hackerrank.com/challenges/equal/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    10/08/2019
'''
import sys


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().strip().split()))

        m = min(arr)
        ans = sys.maxsize

        for offset in range(5):
            ops = 0
            for a in arr:
                t = a - (m-offset)
                ops += t//5 + t % 5//2 + t % 5 % 2
            ans = min(ans, ops)

        print(ans)


if __name__ == "__main__":
    main()
