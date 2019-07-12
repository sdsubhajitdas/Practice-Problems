# http://codeforces.com/contest/1191/problem/B
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    12/07/2019
'''


def get_koutsu(a: dict) -> int:
    count = -1
    for digit in range(1, 10):
        for tile in ['m', 'p', 's']:
            find = str(digit)+tile
            if(a.get(find, -1) != -1):
                count = max(count, a[find])
    return 3-count


def get_shuntsu(a: dict) -> int:
    count = -1
    mcount = count
    for digit in range(1, 8):
        for tile in ['m', 'p', 's']:
            f1 = str(digit)+tile
            f2 = str(digit+1)+tile
            f3 = str(digit+2)+tile

            if(a.get(f1, -1) != -1):
                count += 1
            if(a.get(f2, -1) != -1):
                count += 1
            if(a.get(f3, -1) != -1):
                count += 1
            if(count == 3):
                return 0
            mcount = max(mcount, count)
            count = 0

    return 3-mcount


def main():
    inp = input().split()
    table = dict().fromkeys(inp, 0)
    for i in inp:
        table[i] += 1

    k = get_koutsu(table)
    s = get_shuntsu(table)
    print(min(k,s))


if __name__ == "__main__":
    main()
