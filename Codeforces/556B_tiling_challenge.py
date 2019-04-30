# https://codeforces.com/contest/1150/problem/B
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    29/4/2019
'''


def can_be_filled(board: list):
    for row in board:
        if row.count('.') > 0:
            return True

    return False


def main():
    n = int(input())
    board = [list(input()) for row in range(n)]

    for row in range(1, n-1):
        for col in range(1, n-1):
            if board[row][col] != '#':
                if board[row-1][col] == '.' and \
                        board[row+1][col] == '.' and \
                        board[row][col-1] == '.' and \
                        board[row][col+1] == '.':
                    board[row-1][col] = '#'
                    board[row + 1][col] = '#'
                    board[row][col - 1] = '#'
                    board[row][col+1] = '#'
                    board[row][col] = '#'

    #print(board)
    #print(can_be_filled(board))
    if can_be_filled(board):
        print("NO")
    else:
        print("YES")


if __name__ == '__main__':
    main()
