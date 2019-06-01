# https://www.hackerrank.com/challenges/kangaroo/problem
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    01/06/2019
'''
import math


def main():
    x1, v1, x2, v2 = map(int, input().strip().split())

    if (x1 < x2 and v1 <= v2) or (x1 > x2 and v1 >= v2):
        print("NO")
        return

    steps = (x2-x1) / (v1 - v2)
    print("YES" if steps == math.floor(steps) else "NO")


if __name__ == "__main__":
    main()
