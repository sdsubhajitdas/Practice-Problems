# https://codeforces.com/problemset/problem/69/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    27/08/2020
'''


def main():
    x = y = z = 0
    for _ in range(int(input())):
        dx, dy, dz = map(int, input().strip().split())
        x += dx
        y += dy
        z += dz

    print("YES" if(x == y == z == 0) else "NO")


if __name__ == "__main__":
    main()
