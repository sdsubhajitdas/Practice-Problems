# http://codeforces.com/problemset/problem/259/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    DD/MM/2019
'''


def main():
    board = list()
    for _ in range(8):
        board.append(list(input()))

    for i in range(8):
        for j in range(8):
            j1 = (j+1) % 8
            b, a = board[i][j], board[i][j1]
            if((b == 'W' and a == 'W') or (b == 'B' and a == 'B')):
                print('NO')
                return

    print('YES')


if __name__ == "__main__":
    main()
