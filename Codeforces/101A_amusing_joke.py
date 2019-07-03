# http://codeforces.com/problemset/problem/141/A
'''
    Author - Subhajit Das
    University of Engineering and Management, Kolkata
    03/07/2019
'''


def main():
    s1 = input()
    s2 = input()
    s = input()

    table = dict().fromkeys(s1+s2, 0)

    for ch in s1:
        table[ch] += 1
    for ch in s2:
        table[ch] += 1

    for ch in s:
        if(table.get(ch, -1) > 0):
            table[ch] -= 1
        else:
            print('NO')
            return
    for key in table.keys():
        if(table[key] != 0):
            print('NO')
            return
    print('YES')


if __name__ == "__main__":
    main()
