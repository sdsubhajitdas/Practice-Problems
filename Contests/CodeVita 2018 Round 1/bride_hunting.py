# https://www.programminggeek.in/2018/08/codevita-2018-round-1-question-bride-hunting.html
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    17/06/2019
'''


def get_qualities(a: list, i: int, j: int) -> int:
    count = 0
    r, c = len(a), len(a[0])
    for x in range(max(0, i-1), min(r, i+2)):
        for y in range(max(0, j-1), min(c, j+2)):
            if (x == i and y == j):
                continue
            #print(f'{x+1}, {y+1}, a = {a[x][y]}')
            count += 1 if (a[x][y] == 1) else 0
    return count


def get_distance(s: tuple, d: tuple):
    if (s[0] == d[0] and s[1] == d[1]):
        return 1
    if (s[1] == d[1]):
        s = (s[0]+1, s[1])
        return 1 + get_distance(s, d)
    if (s[0] == d[0]):
        s = (s[0], s[1]+1)
        return 1 + get_distance(s, d)
    s = (s[0]+1, s[1]+1)
    return 1 + get_distance(s, d)


def main():
    r, c = map(int, input().split())
    arr = list()
    for _ in range(r):
        arr.append(list(map(int, input().strip().split())))
    arr[0][0] = 0
    found = False
    brides = list()
    for i in range(r):
        for j in range(c):
            if (arr[i][j] == 1):
                found = True
                brides.append([i, j, get_qualities(arr, i, j)])
    if (not found):
        print('No suitable girl found')
        return

    brides.sort(key=lambda x: x[2], reverse=True)
    for i in range(len(brides)-1):
        if (brides[i+1][2] < brides[i][2]):
            brides = brides[:i+1]
            break
    if (len(brides) == 1):
        i, j, c = brides[0]
        print(i+1, j+1, c, sep=':')
        return

    for bride in brides:
        s = (0, 0)
        d = (bride[0]+1, bride[1]+1)
        bride.append(get_distance(s, d))

    brides.sort(key=lambda x: x[-1])
    if (brides[0][-1] == brides[1][-1]):
        print('Polygamy not allowed')

    i, j, c, _ = brides[0]
    print(i+1, j+1, c, sep=':')
    print(brides)


if __name__ == "__main__":
    main()
