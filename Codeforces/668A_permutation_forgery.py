# https://codeforces.com/contest/1405/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    06/09/2020
'''

def main():
    n = int(input().strip())
    arr = list(map(int,input().strip().split()))
    arr.reverse()
    print(*arr)

if __name__ == "__main__":
    for _ in range(int(input())):
        main()
    # main()
    