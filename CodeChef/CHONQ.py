# https://www.codechef.com/MARCH19B/problems/CHONQ
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    2/3/2018
    Status: Partial
'''
import math


def main():
    for _ in range(int(input())):
        n, k = map(int, input().split())
        a = list(map(int, input().split()))
        a.insert(0, None)
        pos = None
        for p in range(1, n+1):
            total = sum([math.floor(ap/(idx+1))
                         for idx, ap in enumerate(a[p:n+1])])
            if total <= k:
                pos = p
                break

        if pos == None:
            pos = n+1
        print(pos)


if __name__ == "__main__":
    main()
