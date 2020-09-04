# https://codeforces.com/contest/1409/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    04/09/2020
'''
import math

def main():
    a, b = map(int,input().strip().split())
    count = int(math.ceil(abs(a-b)/10))
    print(count)


if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
