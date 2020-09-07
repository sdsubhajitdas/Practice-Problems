# https://codeforces.com/contest/1409/problem/B
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    07/09/2020
'''
import math


def main():
    a, b, x, y, n = map(int, input().strip().split())

    minProduct = math.inf

    for _ in range(2):
        da = min(n, a-x)
        db = min(n-da, b-y)
        minProduct = min(minProduct, (a-da)*(b-db))
        a, b = b, a
        x, y = y, x
    
    print(minProduct)


if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
