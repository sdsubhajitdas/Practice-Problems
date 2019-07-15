# http://codeforces.com/contest/1191/problem/B
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    14/07/2019
'''


def f(x: int) -> int:
    return 1 if not not x else 0


def main():
    inp = input().split()
    idx = {'m': 0, 'p': 1, 's': 2}
    table = [[0]*9 for _ in range(3)]

    for i in inp:
        r = idx[i[1]]
        c = int(i[0])-1
        table[r][c] += 1

    ans = 3

    for i in range(3):
        for j in range(9):
            ans = min(ans, 3-table[i][j])
            if(j+2 < 9):
                ans = min(ans, 3 - f(table[i][j])-f(table[i][j+1])-f(table[i][j+2]))
    print(ans)


if __name__ == "__main__":
    main()
