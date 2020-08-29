# https://codeforces.com/contest/275/problem/A
'''
    Author @Subhajit Das (sdsubhajitdas.github.io)
    SWE @Turbot HQ India PVT Ltd.
    30/08/2020
'''


def main():
    pressed = [[1]*3 for _ in range(3)]
    grid = list()
    for _ in range(3):
        grid.append(list(map(int, input().strip().split())))

    for row in range(3):
        for col in range(3):
            if(grid[row][col] != 0):
                countPressed(grid[row][col], row, col, pressed)

    for row in range(3):
        for col in range(3):
            pressed[row][col] %= 2

    for _ in range(3):
        print(*pressed[_], sep="")


def countPressed(toggled, row, col, pressed):
    pressed[row][col] += toggled
    if(row+1 < 3):
        pressed[row+1][col] += toggled
    if(row-1 >= 0):
        pressed[row-1][col] += toggled
    if(col+1<3):
        pressed[row][col+1] += toggled
    if(col-1>=0):
        pressed[row][col-1] += toggled


if __name__ == "__main__":
    main()
