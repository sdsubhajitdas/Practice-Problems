# https://www.codechef.com/MARCH19B/problems/CHNUM
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    1/3/2018
'''


def main():
    for _ in range(int(input())):
        n = int(input())
        arr = list(map(int, input().split()))

        p, n = 0, 0

        for i in arr:
            if i >= 0:
                p += 1
            else:
                n += 1

        if p == 0 or n == 0:
            print(p, p) if n == 0 else print(n, n)
        else:
            print(max(p, n), min(p, n))


if __name__ == "__main__":
    main()
