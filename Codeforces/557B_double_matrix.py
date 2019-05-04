# http://codeforces.com/contest/1162/problem/B
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    4/5/2019
'''


def main():
    n, m = map(int, input().strip().split())
    a = [list(map(int, input().strip().split())) for _ in range(n)]
    b = [list(map(int, input().strip().split())) for _ in range(n)]

    possible = True

    for row in range(n):
        last_a = a[row][0]
        last_b = b[row][0]
        for col in range(1, m):
            if last_a < a[row][col] and last_b < b[row][col]:
                last_a = a[row][col]
                last_b = b[row][col]
            else:
                a[row][col], b[row][col] = b[row][col], a[row][col]
                if last_a < a[row][col] and last_b < b[row][col]:
                    last_a = a[row][col]
                    last_b = b[row][col]
                else:
                    possible = False
                    break

    if possible:
        for col in range(m):
            last_a = a[0][col]
            last_b = b[0][col]
            for row in range(1, n):
                if last_a < a[row][col] and last_b < b[row][col]:
                    last_a = a[row][col]
                    last_b = b[row][col]
                else:
                    a[row][col], b[row][col] = b[row][col], a[row][col]
                    if last_a < a[row][col] and last_b < b[row][col]:
                        last_a = a[row][col]
                        last_b = b[row][col]
                    else:
                        possible = False
                        break

    print("Possible" if possible else "Impossible")


if __name__ == '__main__':
    main()
